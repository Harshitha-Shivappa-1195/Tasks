package com.atmecs.aspire.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtility {
    WebDriver driver;
    WaitForElement waitObject = new WaitForElement();

    public CommonUtility(WebDriver driver) {
        this.driver = driver;
    }

    public void clickTheElement(String locator) {
        try {
            WebElement element = waitObject.WaitForFluent(driver, locator);
            element.click();
        } catch (Exception exception) {
            System.out.println("Element not clickable");
            exception.printStackTrace();
        }
    }
}
