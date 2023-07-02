package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeSteps;
import io.cucumber.java.es.Dado;
import net.thucydides.core.annotations.Steps;

public class CommonStepDefinitions {

    @Steps
    HomeSteps homeSteps;
    @Dado("que el usuario ingrese a la pagina de alkomprar")
    public void queElUsuarioIngreseALaPaginaDeAlkomprar() {
        homeSteps.abrirNavegador();
    }
}
