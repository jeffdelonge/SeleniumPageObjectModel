package com.test;

import com.core.BaseTest;
import com.pageobject.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jeff206462799 on 6/12/17.
 */
public class TC0001_TestValidLogIn extends BaseTest {

    @Test
    public void testValidLogIn() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        pageToTest.successfulLogIn();
        Assert.assertTrue(pageToTest.getLoginSuccessBanner().isDisplayed());
    }

    @Test
    public void testInvalidLogIn() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        pageToTest.unsuccessfulLogIn();
        Assert.assertTrue(pageToTest.getLoginFailureBanner().isDisplayed());
    }
}
