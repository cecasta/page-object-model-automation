package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CarPage extends PageObject {

    @FindBy(id="checkout")
    WebElementFacade bottonCheckout;

    public void makeCheckOut(){
        bottonCheckout.click();
    }

}
