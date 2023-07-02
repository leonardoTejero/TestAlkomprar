package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductPage;
import com.alkomprar.utils.EsperaExplicita;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductSteps {

    ProductPage productPage = new ProductPage();
    EsperaExplicita espera = new EsperaExplicita();
    WebDriverWait wait = new WebDriverWait(productPage.getDriver(), Duration.ofSeconds(30));

    @Step
    public void clickCarrito(){

        WebElement btnContinuar = productPage.getDriver().findElement(productPage.getBtnAgregarAlCarrito());

        JavascriptExecutor jsExecutor = (JavascriptExecutor) productPage.getDriver();
        String script = "arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});";
        jsExecutor.executeScript(script, btnContinuar);

        wait.until(ExpectedConditions.elementToBeClickable(productPage.getBtnAgregarAlCarrito()));
        productPage.getDriver().findElement(productPage.getBtnAgregarAlCarrito()).click();
    }

    @Step
    public void validarProductoguardado(){

        espera.esperaExplicitaTexto(productPage.getDriver(), productPage.getDivProductoAgregado());
        Assert.assertTrue(
                productPage.getDriver().findElement(productPage.getDivProductoAgregado()).isDisplayed());
    }

}
