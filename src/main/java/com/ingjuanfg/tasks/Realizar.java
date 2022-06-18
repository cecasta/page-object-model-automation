package com.ingjuanfg.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ingjuanfg.userinterface.LoginPage.BOTON_LOGIN;
import static com.ingjuanfg.userinterface.LoginPage.INPUT_USUARIO;
import static com.ingjuanfg.userinterface.LoginPage.INPUT_CONTRASENA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Realizar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("").into(INPUT_USUARIO),
                Enter.theValue("").into(INPUT_CONTRASENA),
                Click.on(BOTON_LOGIN)
        );
    }

    public static Realizar autenticacion(){
        return instrumented(Realizar.class);
    }
}
