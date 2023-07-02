package com.alkomprar.steps;

import com.alkomprar.pageObject.MyAccountPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.equalTo;

public class MyAccountSteps {

    MyAccountPage myAccountPage = new MyAccountPage();

    @Step
    public void validarTitulo(){

        Assert.assertThat(
                myAccountPage.getDriver().findElement(myAccountPage.getDivMiCuenta()).getText(),
                equalTo("Mi cuenta")
        );
    }

}
