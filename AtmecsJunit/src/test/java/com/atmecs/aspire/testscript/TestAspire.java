package com.atmecs.aspire.testscript;

import com.atmecs.aspire.helpers.WaitForElement;
import com.atmecs.aspire.testbase.TestBase;
import com.atmecs.aspire.testcases.NavigationTestCase;
import org.junit.Before;
import org.junit.Test;

public class TestAspire extends TestBase {
    private static NavigationTestCase navigationTestCase;

    @Before
    public void invokeBrowser() {
        driver.get("https://www.atmecs.com/sports/");
        driver.manage().window().maximize();
        WaitForElement waitObject = new WaitForElement();
        waitObject.waitForPageLoadTime(driver);
        navigationTestCase = new NavigationTestCase(driver);
    }

    @Test
    public void testNavigation() {
        navigationTestCase.careerMethod();
    }
}
