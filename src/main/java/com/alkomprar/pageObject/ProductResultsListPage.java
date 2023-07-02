package com.alkomprar.pageObject;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

import java.util.List;

public class ProductResultsListPage extends PageObject {

    By titleProductName = By.xpath("//a[@class=\"js-algolia-product-click\"]");
    @FindBy(how = How.XPATH, using = "//a[@class=\"js-algolia-product-click\"]")
    public List<WebElementFacade> Products;

    public By getTitleProductName() {
        return titleProductName;
    }

}
