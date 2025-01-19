package com.apiautomation.tests.samples;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    //Create a Booking, create a token
    //Verify Get Booking
    //update the booking
    //delete the booking

    @Test(groups = "qa", priority = 1)
    @Owner("Nilesh")
    @Description("TC#INT1 -Step 1. Verify that the booking can be created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 2)
    @Owner("Nilesh")
    @Description("TC#INT1 -Step 2. Verify the booking by ID")
    public void testVerifyBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 3)
    @Owner("Nilesh")
    @Description("TC#INT1 -Step 3. Update the booking by ID")
    public void testUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa", priority = 4)
    @Owner("Nilesh")
    @Description("TC#INT1 -Step 4. Delete booking by ID")
    public void testDeleteBooking(){
        Assert.assertTrue(true);
    }


}

