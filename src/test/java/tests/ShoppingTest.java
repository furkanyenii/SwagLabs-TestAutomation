package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;
import utils.ShoppingTestConstants;

public class ShoppingTest extends BaseTest {

    @Test
    public void addToShoppingCart_Test() throws InterruptedException {
        final ProductsPage productsPage = new ProductsPage(driver);
        final ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        final CartPage cartPage = new CartPage(driver);
        final InformationPage informationPage = new InformationPage(driver);
        final OverviewPage overviewPage = new OverviewPage(driver);

        driver.get(ShoppingTestConstants.PRODUCTS_URL);
        productsPage.clickBackPack();
        productDetailsPage.clickAddToCart();
        productDetailsPage.clickShoppingCartIcon();
        cartPage.clickCheckoutBtn();
        informationPage.enterFirstName(ShoppingTestConstants.FIRST_NAME);
        informationPage.enterLastName(ShoppingTestConstants.Last_Name);
        informationPage.enterPostalCode(ShoppingTestConstants.POSTAL_CODE);
        informationPage.clickContinueBtn();
        overviewPage.clickFinishBtn();


    }


}
