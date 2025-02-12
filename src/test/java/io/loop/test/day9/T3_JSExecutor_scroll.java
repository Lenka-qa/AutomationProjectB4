package io.loop.test.day9;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_JSExecutor_scroll {

    @Test
    public void loopcamp_scroll() {
        Driver.getDriver().get("https:/loopcamp.vercel.app/index.html");

        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']"));

        // how to scroll
        // #1 use actions class move to element

        Actions actions = new Actions(Driver.getDriver());
        actions.scrollToElement(link).click().perform();

        // #2 use Key press
        //actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

        // #3 MOVE HORIZONTALLY OR VERICALLY
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //js.executeScript("window.scroll(0, 5000)");

        // #4 scroll to view
        js.executeScript("arguments[0].scrollIntoView(true);", link);
        js.executeScript("arguments[0].click();", link);
        js.executeScript("window.scroll(0, 500)");



    }
}
