package com.ingjuanfg.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarPage extends PageObject {

    WebDriver driver;
    By bottonCheckout = By.id("checkout");


    public CarPage(WebDriver driver) {
        this.driver = driver;
    }

    public void makeCheckOut(){
        driver.findElement(bottonCheckout).click();
    }

}
