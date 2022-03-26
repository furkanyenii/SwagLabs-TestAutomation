package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Constants;

import java.util.concurrent.ConcurrentNavigableMap;

public class LoginPageTest extends BaseTest {

    @Test
    public void successfulLogin_Test() throws InterruptedException {
        final LoginPage loginPage = new LoginPage(driver);
        driver.get("https://www.saucedemo.com/v1/");
        loginPage.enterUsername(Constants.USERNAME);
        Thread.sleep(1000);
        loginPage.enterPassword(Constants.TRUE_PASSWORD);
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.checkString(),"Products");
    }


}
