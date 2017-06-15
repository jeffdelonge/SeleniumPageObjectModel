package test.java.com.jeff.tests;

import main.java.com.jeff.core.BaseTest;
import main.java.com.jeff.pageobject.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jeff206462799 on 6/12/17.
 */
public class TC0001_TestValidLogIn extends BaseTest {

    @Test
    public void testValidLogIn() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        pageToTest.logIn("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(pageToTest.isTheSuccessBannerPresent());
    }
}
