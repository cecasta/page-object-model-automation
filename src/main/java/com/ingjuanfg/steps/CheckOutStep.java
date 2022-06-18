package com.ingjuanfg.steps;

import com.ingjuanfg.pages.CheckOutPage;
import com.ingjuanfg.pages.FinishCheckOutPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class CheckOutStep {
    @Page
    private CheckOutPage checkOutPage;

    @Page
    private FinishCheckOutPage finishCheckOutPage;

    @Step
    public void completarFormularioCheckout(List<Map<String, String>> datosCheckOut){
        checkOutPage.setFirtName(datosCheckOut.get(0).get("nombre"));
        checkOutPage.setLastName(datosCheckOut.get(0).get("apellido"));
        checkOutPage.setCodePost(datosCheckOut.get(0).get("postal"));
        checkOutPage.continueCheckOut();
        finishCheckOutPage.completeCheckOut();
    }
}
