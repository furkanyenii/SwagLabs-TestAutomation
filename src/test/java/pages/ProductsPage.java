package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    private final By backPackLocator = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");

    public void clickBackPack() throws InterruptedException {
        WebElement backPack = driver.findElement(backPackLocator);
        backPack.click();
        Thread.sleep(2000);
    }
}
