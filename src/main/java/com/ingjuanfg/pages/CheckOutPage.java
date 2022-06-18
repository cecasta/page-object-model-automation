package com.ingjuanfg.pages;


import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage extends PageObject {

    WebDriver driver;
    By inputFirtName = By.id("first-name");
    By inputLastName = By.id("last-name");
    By inputCodePost = By.id("postal-code");
    By bottonBy = By.id("continue");

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }


    public void completeFormCheckOut(){
        driver.findElement(inputFirtName).sendKeys("Cesar");
        driver.findElement(inputLastName).sendKeys("Castano");
        driver.findElement(inputCodePost).sendKeys("00000");
        driver.findElement(bottonBy).click();
    }

}
