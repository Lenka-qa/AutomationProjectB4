package io.loop.test.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class SeleniumTest {
    public static void main(String[] args) {

        // Setting up the web driver

        // create the instance of the driver
        WebDriver driver = new ChromeDriver();
        // maximize the window
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        // navigate to the page
        driver.navigate().to("https://www.google.com");

        // navigate back
        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // for refreshing the page
        driver.navigate().refresh();

        // quitting the browser
        driver.quit();

    }
}
