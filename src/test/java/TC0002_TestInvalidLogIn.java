package test.java;

import main.java.BaseTest;
import main.java.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by jeff206462799 on 6/13/17.
 */
public class TC0002_TestInvalidLogIn extends BaseTest {

    @Test
    public void testInvalidLogIn() {
        LoginPage pageToTest = PageFactory.initElements(webDriver, LoginPage.class);

        pageToTest.logIn("badusername", "badpassword");
        Assert.assertTrue(pageToTest.isTheFailureBannerPresent());
    }
}
