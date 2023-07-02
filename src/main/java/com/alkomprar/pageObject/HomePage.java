package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

    By aMiCuenta = By.xpath("//a[@href=\"/my-account\"][1]");
    By inputBuscar = By.id("js-site-search-input");
    By btnBuscar = By.id("js-search-button");

    public By getBtnBuscar() {
        return btnBuscar;
    }

    public By getInputBuscar() {
        return inputBuscar;
    }

    public By getaMiCuenta() {
        return aMiCuenta;
    }

}
