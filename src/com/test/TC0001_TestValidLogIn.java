package com.test;

import com.core.BaseTest;
import com.pageobject.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jeff206462799 on 6/12/17.
 */
public class TC0001_TestValidLogIn extends BaseTest {

    @Test
    public void testValidLogIn() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        System.out.println(pageToTest.getSubmitButton().getText());
        pageToTest.setUsername("tomsmith");
        pageToTest.setPassword("SuperSecretPassword!");
        Assert.assertTrue(pageToTest.logInWithSuccessConfirmation());
    }
}
