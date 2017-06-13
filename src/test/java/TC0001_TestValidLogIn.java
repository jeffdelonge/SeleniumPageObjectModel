package test.java;

import main.java.BaseTest;
import main.java.LoginPage;
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

        pageToTest.logIn("tomsmith", "SuperSecretPassword!");
        Assert.assertTrue(pageToTest.isTheSuccessBannerPresent());
    }
}
