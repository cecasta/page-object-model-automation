package com.ingjuanfg.steps;

import com.ingjuanfg.pages.InventoryPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InventoryStep {
    @Page
    private InventoryPage inventoryPage;


    @Step
    public void agregarProductoAlCarrito(){
        inventoryPage.clickAddProductCart();
    }

    @Step
    public void verCarritoDeCompra(){
        inventoryPage.clickViewShopCart();
    }

}
