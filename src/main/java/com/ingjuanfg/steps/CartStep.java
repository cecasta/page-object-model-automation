package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CarPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CartStep {

    @Page
    private CarPage carPage;

    @Step
    public void hacerCheckOut(){
        carPage.makeCheckOut();
    }

}
