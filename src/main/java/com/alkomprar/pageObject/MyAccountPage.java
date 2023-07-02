package com.alkomprar.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class MyAccountPage extends PageObject {

    By divMiCuenta = By.xpath("//div[contains(text(),\"Mi cuenta\")]");

    public By getDivMiCuenta() {
        return divMiCuenta;
    }
}
