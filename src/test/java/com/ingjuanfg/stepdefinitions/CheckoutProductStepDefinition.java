package com.ingjuanfg.stepdefinitions;

import com.ingjuanfg.pages.CarPage;
import com.ingjuanfg.pages.CheckOutPage;
import com.ingjuanfg.pages.InventoryPage;
import com.ingjuanfg.pages.LoginPage;
import com.ingjuanfg.steps.CartStep;
import com.ingjuanfg.steps.CheckOutStep;
import com.ingjuanfg.steps.InventoryStep;
import com.ingjuanfg.steps.LoginStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

import java.util.List;
import java.util.Map;

public class CheckoutProductStepDefinition {

    @Steps
    LoginStep loginStep;

    @Steps
    InventoryStep inventoryStep;

    @Steps
    CartStep cartStep;

    @Steps
    CheckOutStep checkOutStep;


    @Cuando("usuario ingresa sus credenciales")
    public void usuarioIngresaSusCredenciales(Map<String, String> credenciales) {
        loginStep.abrirNavegador();
        loginStep.iniciarAutenticacion(credenciales);
    }

    @Cuando("cuando el usuario agrega producto al carrito")
    public void cuandoElUsuarioAgregaProductoAlCarrito() {
        inventoryStep.agregarProductoAlCarrito();
        inventoryStep.verCarritoDeCompra();
    }

    @Cuando("realiza el checkout de la compra")
    public void realizaElCheckoutDeLaCompra(List<Map<String, String>> datosCheckOut) {
        cartStep.hacerCheckOut();
        checkOutStep.completarFormularioCheckout(datosCheckOut);
    }

    @Entonces("el  usuario finaliza la compra")
    public void elUsuarioFinalizaLaCompra() {

    }


}
