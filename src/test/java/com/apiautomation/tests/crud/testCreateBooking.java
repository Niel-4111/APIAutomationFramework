package com.apiautomation.tests.crud;

import com.apiautomation.base.BaseTest;
import com.apiautomation.endpoints.APIConstants;
import com.apiautomation.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.TmsLink;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class testCreateBooking extends BaseTest {
    @Owner("Nilesh")
    @Description("Verify the POST request in working fine")
    @Test(groups = "qa")
    public void testVerifyCreateBookingPOST01(){
        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString()).post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());
        assertActions.verifyStringKey(bookingResponse.getBooking().getFirstname(), "James");

    }
}
