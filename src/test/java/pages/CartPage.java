package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    private final By checkOutBtnLocator = By.className("checkout_button");

    public void clickCheckoutBtn() throws InterruptedException {
        WebElement checkOutBtn = driver.findElement(checkOutBtnLocator);
        checkOutBtn.click();
        Thread.sleep(1000);
    }

}
