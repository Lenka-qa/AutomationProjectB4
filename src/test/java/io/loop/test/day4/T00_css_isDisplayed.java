package io.loop.test.day4;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T00_css_isDisplayed {
    /*
  https://the-internet.herokuapp.com/forgot_password
   */
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

        WebElement forgotPasswordHeading = driver.findElement(By.cssSelector("div[class='example']>h2"));
        String forgotPasswordText = forgotPasswordHeading.getText();

        //isDisplayed() boolean  will return true or false depending on the element is displayed at html
        System.out.println("ForgotPasswordHeading.isDisplayed() = " + forgotPasswordHeading.isDisplayed()) ;

        if (forgotPasswordHeading.isDisplayed()) {
            System.out.println("Test Pass");
        }else {
            System.out.println("Test Fail");
        }

    }
}
