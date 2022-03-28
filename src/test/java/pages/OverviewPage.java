package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasePage {
    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    private final By finishBtnLocator = By.className("cart_button");

    public void clickFinishBtn(){
        WebElement finishBtn = driver.findElement(finishBtnLocator);
        finishBtn.click();
    }


}
