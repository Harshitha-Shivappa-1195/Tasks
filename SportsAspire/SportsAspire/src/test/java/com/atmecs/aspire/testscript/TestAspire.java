package com.atmecs.aspire.testscript;

import com.atmecs.aspire.testbase.TestBase;

import java.io.IOException;

public class TestAspire {
    public static void main(String[] args) throws IOException {
        TestBase testBase = new TestBase();
        testBase.initiateBrowser("chrome");
        testBase.invokeBrowser();
        testBase.callAutomate();
    }
}
