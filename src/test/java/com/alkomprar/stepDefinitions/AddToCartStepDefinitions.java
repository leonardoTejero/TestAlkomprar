package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.ProductResultsListSteps;
import com.alkomprar.steps.ProductSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class AddToCartStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Steps
    ProductResultsListSteps productResultsListSteps;

    @Steps
    ProductSteps productSteps;

    @Cuando("el usuario busque un producto con la barra de busqueda")
    public void elUsuarioBusqueUnProductoConLaBarraDeBusqueda() throws IOException {
        homeSteps.buscarProducto();
    }
    @Cuando("el usuario escoge un producto de el catalogo y da click en agregar al carrito")
    public void elUsuarioEscogeUnProductoDeElCatalogoYDaClickEnAgregarAlCarrito() {
        productResultsListSteps.seleccionarProducto();
        productSteps.clickCarrito();
    }
    @Entonces("el usuario ve el mensaje se agrego el producto satisfactoriamente")
    public void elUsuarioVeElMensajeSeAgregoElProductoSatisfactoriamente() {
        productSteps.validarProductoguardado();
    }

}
