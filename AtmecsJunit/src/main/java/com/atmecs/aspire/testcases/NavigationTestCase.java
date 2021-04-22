package com.atmecs.aspire.testcases;

import com.atmecs.aspire.constants.FileConstant;
import com.atmecs.aspire.helpers.CommonUtility;
import com.atmecs.aspire.utils.ReadPropertiesFile;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class NavigationTestCase {
    Properties locators;
    CommonUtility commonUtility;
    WebDriver driver;

    public NavigationTestCase(WebDriver driver) {
        this.driver=driver;
        try {
            locators = ReadPropertiesFile.loadProperty(FileConstant.lOCATORS_FILE);
            commonUtility = new CommonUtility(driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void careerMethod() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
        commonUtility.clickTheElement(locators.getProperty("loc_name"));
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }
}
