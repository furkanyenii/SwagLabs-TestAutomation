package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    private final By addToCartBtnLocator = By.className("btn_inventory");
    private final By shoppingCartIconLocator = By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']");

    public void clickAddToCart() throws InterruptedException {
        WebElement addToCart = driver.findElement(addToCartBtnLocator);
        addToCart.click();
        Thread.sleep(2000);
    }

    public void clickShoppingCartIcon() throws InterruptedException {
        WebElement shoppingCartIcon = driver.findElement(shoppingCartIconLocator);
        shoppingCartIcon.click();
        Thread.sleep(1000);
    }
}
