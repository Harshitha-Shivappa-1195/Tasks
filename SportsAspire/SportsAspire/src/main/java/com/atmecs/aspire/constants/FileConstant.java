package com.atmecs.aspire.constants;

import java.io.File;

public class FileConstant {
    public static final String USER_HOME= System.getProperty("user.dir")+File.separator;
    public static final String RESOURCES_HOME= USER_HOME+"src"+File.separator+"test"+ File.separator+"resources"+File.separator;
    public static final String LOCATOR_HOME= RESOURCES_HOME+"locators"+File.separator;
    public static final String LIB_HOME =USER_HOME+"lib"+File.separator;

    public static final String CHROME_PATH= LIB_HOME+"chromedriver.exe";
    public static final String FIREFOX_PATH= LIB_HOME+"geckodriver.exe";
    public static final String INTERNETEXPLORER_PATH= LIB_HOME+"IEDriverServer.exe";

    public static final String lOCATORS_FILE= LOCATOR_HOME+"locators.properties";

    public static final int EXPLICIT_WAIT=30;
    public static final int FLUENT_WAIT=30;
    public static final int PAGE_LOAD_TIME=30;
    public static final int FLUENT_POLL=1;
}
