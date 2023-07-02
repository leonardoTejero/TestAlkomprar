package com.alkomprar.steps;

import com.alkomprar.pageObject.ProductResultsListPage;
import com.alkomprar.utils.EsperaExplicita;
import com.alkomprar.utils.RandomIndex;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductResultsListSteps {
    EsperaExplicita espera = new EsperaExplicita();
    ProductResultsListPage productResultsListPage = new ProductResultsListPage();
    WebDriverWait myWaitVar = new WebDriverWait(productResultsListPage.getDriver(), Duration.ofSeconds(30));

    @Step
    public void seleccionarProducto() {

        espera.esperaCargarPagina(productResultsListPage.getDriver());
        myWaitVar.until(ExpectedConditions.presenceOfElementLocated(productResultsListPage.getTitleProductName()));

        List<WebElementFacade> productos = productResultsListPage.Products;
        WebElementFacade producto = productos.get(RandomIndex.indiceAleatorio(productos.size()));
        producto.click();
    }
}
