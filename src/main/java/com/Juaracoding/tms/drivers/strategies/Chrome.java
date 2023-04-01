package com.Juaracoding.tms.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Chrome implements DriverStrategy{
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "C:\\juaracoding\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");

        //untuk directory download
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory",System.getProperty("user.dir")+ File.separator+"downloads");
        options.setExperimentalOption("prefs",prefs);
        //sampe sini
        return new ChromeDriver(options);
    }
}

