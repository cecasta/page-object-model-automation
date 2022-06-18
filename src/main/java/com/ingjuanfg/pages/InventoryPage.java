package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.saucedemo.com/")
public class InventoryPage extends PageObject {


    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElementFacade bottonAddCart;

    @FindBy(id="shopping_cart_container")
    WebElementFacade divBottonCartCheckout;

    public void clickAddProductCart(){
        bottonAddCart.click();
    }


    public void clickViewShopCart() {
        divBottonCartCheckout.click();
    }


}
