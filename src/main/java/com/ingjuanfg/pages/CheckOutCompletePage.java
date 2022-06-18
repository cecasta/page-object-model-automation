package com.ingjuanfg.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CheckOutCompletePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElementFacade labelCheckOut_OK;

    public String getMenssageFinalyCheckOut(){
        return labelCheckOut_OK.getText();
    }
}
