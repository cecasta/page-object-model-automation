package com.ingjuanfg.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@DefaultUrl("https://www.saucedemo.com/")
public class InventoryPage extends PageObject {

    WebDriver driver;
    By bottonAddCart = By.id("add-to-cart-sauce-labs-backpack");
    By divBottonCartCheckout = By.id("shopping_cart_container");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddProductCart(){
        driver.findElement(bottonAddCart).click();
    }


    public void clickViewShopCart() {
        driver.findElement(divBottonCartCheckout).click();
    }


}
