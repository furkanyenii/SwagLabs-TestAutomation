package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By usernameLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By loginButtonLocator = By.id("login-button");
    private final By checkProductStringLocator = By.className("product_label");
    private final By errorStringLocator = By.xpath("//h3[@data-test='error']");


    public void enterUsername(String username) throws InterruptedException {
        WebElement usernameField = driver.findElement(usernameLocator);
        usernameField.click();
        usernameField.sendKeys(username);
        Thread.sleep(1000);
    }

    public void enterPassword(String password) throws InterruptedException {
        WebElement passwordField = driver.findElement(passwordLocator);
        passwordField.click();
        passwordField.sendKeys(password);
        Thread.sleep(1000);
    }

    public void clickLoginButton() throws InterruptedException {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
        Thread.sleep(3000);
    }

    public String checkProductString(){
        WebElement checkString = driver.findElement(checkProductStringLocator);
        return checkString.getText();
    }

    public String wrongLogin(){
        WebElement errorString = driver.findElement(errorStringLocator);
        return errorString.getText();
    }


}
