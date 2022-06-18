package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.CarPage;
import com.ingjuanfg.pages.CheckOutPage;
import com.ingjuanfg.pages.InventoryPage;
import com.ingjuanfg.pages.LoginPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import org.fluentlenium.core.annotation.Page;

public class CheckoutProductStepDefinition {

    @Page
    private LoginPage loginPage;

    @Page
    private InventoryPage inventoryPage;

    @Page
    private CarPage carPage;

    @Page
    private CheckOutPage checkOutPage;

    @Cuando("usuario ingresa sus credenciales")
    public void usuarioIngresaSusCredenciales() {
        loginPage.escribirUsuario("standard_user");
        loginPage.escribirPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Cuando("cuando el usuario agrega producto al carrito")
    public void cuandoElUsuarioAgregaProductoAlCarrito() {
            inventoryPage.clickAddProductCart();
            inventoryPage.clickViewShopCart();
    }

    @Cuando("realiza el checkout de la compra")
    public void realizaElCheckoutDeLaCompra() {
        carPage.makeCheckOut();
        checkOutPage.completeFormCheckOut();
    }

    @Entonces("el  usuario finaliza la compra")
    public void elUsuarioFinalizaLaCompra() {

    }

    @Entonces("terminar el checkout")
    public void terminarElCheckout() {

    }

}
