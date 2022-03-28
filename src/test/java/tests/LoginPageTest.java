package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Constants;

public class LoginPageTest extends BaseTest {

    @Test
    public void successfulLogin_Test() throws InterruptedException {
    final LoginPage loginPage = new LoginPage(driver);
        driver.get(Constants.TEST_URL);
        loginPage.enterUsername(Constants.USERNAME);
        Thread.sleep(1000);
        loginPage.enterPassword(Constants.TRUE_PASSWORD);
        Thread.sleep(1000);
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.checkProductString(),Constants.EXPECTED_SUCCESS_LOGIN);
    }

    @Test
    public void unsuccessfulLogin_Test() throws InterruptedException {
        final LoginPage loginPage1 = new LoginPage(driver);
        driver.get(Constants.TEST_URL);
        loginPage1.enterUsername(Constants.USERNAME);
        Thread.sleep(1000);
        loginPage1.enterPassword(Constants.FALSE_PASSWORD);
        Thread.sleep(1000);
        loginPage1.clickLoginButton();
        Assert.assertEquals(loginPage1.wrongLogin(),Constants.EXPECTED_UNSUCCESS_LOGIN);
    }
}
