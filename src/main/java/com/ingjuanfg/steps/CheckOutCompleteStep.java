package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckOutCompletePage;
import org.fluentlenium.core.annotation.Page;

public class CheckOutCompleteStep {

    private static final String MSG_SUCESS_CHECKOUT = "THANK YOU FOR YOUR ORDER";
    @Page
    private CheckOutCompletePage checkOutCompletePage;

    public boolean validateCompleteCheckOutSuccess(){
        return checkOutCompletePage.getMenssageFinalyCheckOut().equals(MSG_SUCESS_CHECKOUT);
    }
}
