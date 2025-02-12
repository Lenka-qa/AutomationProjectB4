package io.loop.test.day8;

import io.loop.test.base.TestBase;
import io.loop.test.utilities.PizzaOrderWebTableUtil;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T0_pizza_order extends TestBase {
    @Test
    public void test_pizza_type(){
        driver.get("https://loopcamp.vercel.app/web-tables.html");
        String name = "Samuel Jackson";
        String expectedPizzaType = "Italian";
        String actualPizzaType = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "pizza type");

        System.out.println("actualPizzaType = " + actualPizzaType);

        assertEquals(actualPizzaType, expectedPizzaType, "Actual does not match expected");

        String expectedAmount = "3";
        String actualAmount = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "amount");
        assertEquals(actualAmount, expectedAmount, "Actual does not match expected");

        // Validate Date
        String expectedDate = "12/21/2021";
        String actualDate = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "date");
        assertEquals(actualDate, expectedDate, "Date mismatch!");

        // Validate Street
        String expectedStreet = "13, Owl st.";
        String actualStreet = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "street");
        assertEquals(actualStreet, expectedStreet, "Street address mismatch!");

        // Validate City
        String expectedCity = "Starberry, UT";
        String actualCity = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "city");
        assertEquals(actualCity, expectedCity, "City mismatch!");

        // Validate the State
        String expectedState = "US";
        String actualState = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "state");
        assertEquals(actualState, expectedState, "State mismatch!");

        // Validate ZIP Code
        String expectedZip = "53665";
        String actualZip = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "zip");
        assertEquals(actualZip, expectedZip, "ZIP code mismatch!");

        // Validate Card Type
        String expectedCardType = "MasterCard";
        String actualCardType = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "card");
        assertEquals(actualCardType, expectedCardType, "Card type mismatch!");

        // Validate Card Number
        String expectedCardNumber = "555743242342";
        String actualCardNumber = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "card number");
        assertEquals(actualCardNumber, expectedCardNumber, "Card number mismatch!");

        // Validate Expiration Date
        String expectedExp = "03/25";
        String actualExp = PizzaOrderWebTableUtil.returnFieldValue(driver, name, "exp");
        assertEquals(actualExp, expectedExp, "Expiration date mismatch!");

    }
}
