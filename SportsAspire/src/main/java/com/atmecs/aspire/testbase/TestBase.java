package com.atmecs.aspire.testbase;

import java.io.IOException;

import com.atmecs.aspire.constants.FileConstant;
import com.atmecs.aspire.helpers.WaitForElement;
import com.atmecs.aspire.pages.SportsPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
    public WebDriver driver;
    SportsPage sportsPage;

    public void initiateBrowser(String browser) throws IOException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", FileConstant.CHROME_PATH);
            ChromeOptions chrome = new ChromeOptions();
            chrome.addArguments("--disable-notifications");
            chrome.addArguments("--disable-geolocation");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", FileConstant.FIREFOX_PATH);
            FirefoxOptions firefox = new FirefoxOptions();
            firefox.addPreference("dom.webnotifications.enabled", false);
            driver = new FirefoxDriver(firefox);
        } else if (browser.equalsIgnoreCase("internet explorer")) {
            System.setProperty("webdriver.ie.driver", FileConstant.INTERNETEXPLORER_PATH);
            DesiredCapabilities iecapabilities = new DesiredCapabilities();
            iecapabilities.setCapability(InternetExplorerDriver.INITIAL_BROWSER_URL, " ");
            iecapabilities.setCapability("requireWindowFocus", true);
            iecapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            driver = new InternetExplorerDriver(iecapabilities);
        } else {
            System.out.println("Driver not found in the config file");
        }
    }

    public void invokeBrowser() {
        driver.get("https://www.atmecs.com/sports/");
        driver.manage().window().maximize();
        WaitForElement waitObject = new WaitForElement();
        waitObject.waitForPageLoadTime(driver);
    }

    public void callAutomate() {
        sportsPage = new SportsPage(driver);
        sportsPage.clickAutomate();

    }
    public void closeBrowser() {
        driver.quit();
    }
}
