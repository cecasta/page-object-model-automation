package com.ingjuanfg.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends PageObject {

    @FindBy(id="first-name")
    WebElementFacade inputFirtName;

    @FindBy(id="last-name")
    WebElementFacade inputLastName;

    @FindBy(id="postal-code")
    WebElementFacade inputCodePost;

    @FindBy(id="continue")
    WebElementFacade bottonBy;


    public void setFirtName(String name){
        inputFirtName.type(name);
    }

    public void setLastName(String lastName){
        inputLastName.type(lastName);
    }

    public void setCodePost(String codePost){
        inputCodePost.type(codePost);
    }

    public void continueCheckOut(){
        bottonBy.click();
    }

}
