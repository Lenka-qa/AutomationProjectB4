package io.loop.test.day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        System.out.println(driver.getTitle());

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Actual title is " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASSED");
        } else {
            System.out.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAILED");
        }

        String expectedUrl = "https://www.google.com";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Actual url: " + actualUrl + ", matches expected url: " + expectedUrl + ". => TEST PASSED");
        } else {
            System.err.println("Actual url: " + actualUrl + ", DOES NOT match expected url: " + expectedUrl + ". => TEST FAILED");
        }

        driver.quit(); // Moved inside the main method
    }
}
