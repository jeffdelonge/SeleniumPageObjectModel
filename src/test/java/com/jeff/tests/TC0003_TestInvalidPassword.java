package test.java.com.jeff.tests;

import main.java.com.jeff.core.BaseTest;
import main.java.com.jeff.pageobject.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by jeff206462799 on 6/14/17.
 */
public class TC0003_TestInvalidPassword extends BaseTest {

    @Test
    public void testInvalidPassword() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        pageToTest.logIn("tomsmith", "badpassword");
        Assert.assertTrue(pageToTest.isTheFailureBannerPresent());
        Assert.assertEquals(pageToTest.getLoginFailureBanner().getText(), "Your password is invalid!\n" + "×");
    }
}
