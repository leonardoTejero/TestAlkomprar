package com.alkomprar.steps;

import com.alkomprar.pageObject.HomePage;
import com.alkomprar.utils.EsperaExplicita;
import com.alkomprar.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class HomeSteps {
    HomePage homePage = new HomePage();
    EsperaExplicita espera = new EsperaExplicita();
    WebDriverWait myWaitVar = new WebDriverWait(homePage.getDriver(), Duration.ofSeconds(30));

    @Step
    public void abrirNavegador() {

        homePage.openUrl("https://www.alkomprar.com/");
//        homePage.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    @Step("Hacer click en mi cuenta")
    public void clickMiCuenta() {
        homePage.getDriver().findElement(homePage.getaMiCuenta()).click();
    }

    @Step("Escribir en la barra de busqueda")
    public void buscarProducto() throws IOException {

        ArrayList<Map<String, String>> data = Excel.leerDatosDeHojaDeExcel("src/test/resources/data/Datos.xlsx",
                "usuarios");

        homePage.getDriver().findElement(homePage.getInputBuscar()).click();
        homePage.getDriver().findElement(homePage.getInputBuscar()).sendKeys(data.get(0).get("producto"));

        myWaitVar.until(ExpectedConditions.elementToBeClickable(homePage.getBtnBuscar()));
        homePage.getDriver().findElement(homePage.getBtnBuscar()).click();
    }


}
