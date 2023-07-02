package com.alkomprar.steps;

import com.alkomprar.pageObject.RegisterPage;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @Step("Llenar campo correo electronico")
    public void ingresarCorreo() throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Datos.xlsx",
                "usuarios");
        String usuario = data.get(0).get("correo");

        registerPage.getDriver().findElement(registerPage.getInputCorreo()).click();
        registerPage.getDriver().findElement(registerPage.getInputCorreo()).sendKeys(usuario);
        registerPage.getDriver().findElement(registerPage.getBtnContinuar()).click();
    }

    @Step("llenar formulario de registro")
    public void llenarFormulario() throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Datos.xlsx",
                "usuarios");

        registerPage.getDriver().findElement(registerPage.getInputNombres()).click();
        registerPage.getDriver().findElement(registerPage.getInputNombres()).sendKeys(data.get(0).get("nombres"));

        registerPage.getDriver().findElement(registerPage.getInputApellidos()).click();
        registerPage.getDriver().findElement(registerPage.getInputApellidos()).sendKeys(data.get(0).get("apellidos"));

        registerPage.getDriver().findElement(registerPage.getInputTelefono()).click();
        registerPage.getDriver().findElement(registerPage.getInputTelefono()).sendKeys(data.get(0).get("telefono"));

        registerPage.getDriver().findElement(registerPage.getCheckTerminos()).click();
        registerPage.getDriver().findElement(registerPage.getBtnContinuarRegistro()).click();
    }

}
