package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    By btnAgregarAlCarrito = By.xpath("//button[@class=\"button-primary js-add-to-cart js-enable-btn text-default\"]");
    By divProductoAgregado = By.xpath("//div[@class=\"sucess-message sucess-message-alkomprar\"]");

    public By getBtnAgregarAlCarrito() {
        return btnAgregarAlCarrito;
    }
    public By getDivProductoAgregado() {
        return divProductoAgregado;
    }
}
