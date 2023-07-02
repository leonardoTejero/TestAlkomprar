package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    By inputCorreo = By.id("js-login-email");
    By btnContinuar = By.id("js-login-continue");
    By inputNombres = By.id("register.firstName");
    By inputApellidos = By.id("register.lastName");
    By inputTelefono = By.id("register.mobileNumber");
    By checkTerminos = By.xpath("//label[@for=\"registerChkTermsConditions\"]");
    By btnContinuarRegistro = By.xpath("//button[@class=\"button-primary btn-block js-btn-register-myaccount\"]");

    public By getBtnContinuar() {
        return btnContinuar;
    }

    public By getBtnContinuarRegistro() {
        return btnContinuarRegistro;
    }

    public By getInputCorreo() {
        return inputCorreo;
    }

    public By getInputNombres() {
        return inputNombres;
    }

    public By getInputApellidos() {
        return inputApellidos;
    }

    public By getInputTelefono() {
        return inputTelefono;
    }

    public By getCheckTerminos() {
        return checkTerminos;
    }
}
