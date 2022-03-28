package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage extends BasePage {
    public InformationPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameFieldLocator = By.id("first-name");
    private final By lastNameFieldLocator = By.id("last-name");
    private final By postalCodeFieldLocator = By.id("postal-code");
    private final By continueBtnLocator = By.className("cart_button");

    public void enterFirstName(String firstName){
        WebElement firstNameField = driver.findElement(firstNameFieldLocator);
        firstNameField.click();
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) throws InterruptedException {
        WebElement lastNameField = driver.findElement(lastNameFieldLocator);
        lastNameField.click();
        lastNameField.sendKeys(lastName);
        Thread.sleep(1000);
    }

    public void enterPostalCode(String postalCode) throws InterruptedException {
        WebElement postalCodeField = driver.findElement(postalCodeFieldLocator);
        postalCodeField.click();
        postalCodeField.sendKeys(postalCode);
        Thread.sleep(1000);
    }

    public void clickContinueBtn() throws InterruptedException {
        WebElement continueBtn = driver.findElement(continueBtnLocator);
        continueBtn.click();
        Thread.sleep(1000);
    }




}
