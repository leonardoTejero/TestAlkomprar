package com.alkomprar.stepDefinitions;


import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.MyAccountSteps;
import com.alkomprar.steps.RegisterSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;


public class RegisterStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Steps
    RegisterSteps registerSteps;

    @Steps
    MyAccountSteps myAccountSteps;

    @Cuando("el usuario de click en mi cuenta e ingrese el correo y de click en continuar")
    public void elUsuarioDeClickEnMiCuentaEIngreseElCorreoYDeClickEnContinuar() throws IOException {
        homeSteps.clickMiCuenta();
        registerSteps.ingresarCorreo();
    }
    @Cuando("el usuario ingrese todos los campos del formulario y de click en continuar")
    public void elUsuarioIngreseLosCamposDelFormularioYDeClickEnContinuar() throws IOException {
        registerSteps.llenarFormulario();
    }
    @Entonces("el usuario puede ver el titulo mi cuenta")
    public void elUsuarioPuedeVerElTituloMiCuenta() {
        myAccountSteps.validarTitulo();
    }
}
