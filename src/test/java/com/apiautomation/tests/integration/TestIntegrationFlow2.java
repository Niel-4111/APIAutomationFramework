package com.apiautomation.tests.integration;
import com.apiautomation.base.BaseTest;
import com.apiautomation.endpoints.APIConstants;
import com.apiautomation.pojos.Booking;
import com.apiautomation.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestIntegrationFlow2 extends BaseTest {

    // Create Booking -> Delete it -> Verify

}