package com.core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by jeff206462799 on 6/12/17.
 */
public class BaseTest {
    public WebDriver webDriver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.firefox.marionette","/Users/jeff206462799/SeleniumDrivers/geckodriver");
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("http://the-internet.herokuapp.com/login");
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}
