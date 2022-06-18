package com.ingjuanfg.stepdefinitions;


import com.ingjuanfg.steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
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

    @Steps
    CheckOutCompleteStep checkOutCompleteStep;


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
        assertThat(true, is(checkOutCompleteStep.validateCompleteCheckOutSuccess()));
    }


}
