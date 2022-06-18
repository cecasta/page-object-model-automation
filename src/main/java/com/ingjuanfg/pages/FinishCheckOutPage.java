package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class FinishCheckOutPage extends PageObject {

    @FindBy(id="finish")
    WebElementFacade buttonFinishCheckOut;


    public void completeCheckOut(){
        buttonFinishCheckOut.click();
    }
}
