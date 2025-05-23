package io.loop.test.day5;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class T0_radioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.BROWSER);
        driver.manage().window().maximize();
        driver.get("https://loopcamp.vercel.app/radio-buttons.html");

        //SELEIUM 3 WAIT
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //SELENIUM 4
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement red = driver.findElement(By.xpath("//input[@id = 'red']"));
        WebElement green = driver.findElement(By.xpath("//input[@id = 'green']"));

        // is selected()
        System.out.println("redred.isSelected() BEFORE CLICKING = " + red.isSelected());

        red.click();

        System.out.println("red.isSelected() AFTER CLICKING = " + red.isSelected());

        green.click();

        System.out.println("green.isSelected()) = " + green.isSelected());

        // isEnabled()
        System.out.println("red.isEnabled() = " + red.isEnabled());
        System.out.println("green.isEnabled()) = " + green.isEnabled());
    }
}
