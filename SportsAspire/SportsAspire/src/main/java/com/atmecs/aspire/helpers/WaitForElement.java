package com.atmecs.aspire.helpers;

import com.atmecs.aspire.constants.FileConstant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class WaitForElement {
    public WebElement WaitForFluent(WebDriver driver,String locator) {
        try {
            FluentWait<WebDriver> fluentWait = null;
            fluentWait = new FluentWait<WebDriver>(driver).ignoring(Exception.class).pollingEvery(Duration.ofSeconds(FileConstant.FLUENT_POLL))
                    .withTimeout(Duration.ofSeconds(FileConstant.FLUENT_WAIT));
            return fluentWait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    WebElement element = GetElementFromLocators.matchLocatorsAndFetchElement(locator, driver);
                    return element;
                }
            });
        }catch(Exception e)
        {
            System.out.println("Element is not available or clickable");
        }
        return null;
    }

    public void waitForPageLoadTime(WebDriver driver)
    {
        try {
            driver.manage().timeouts().implicitlyWait(FileConstant.PAGE_LOAD_TIME, TimeUnit.SECONDS);
        }catch(Exception e)
        {
            System.out.println("Element is not available or not clickable");
        }
    }
}
