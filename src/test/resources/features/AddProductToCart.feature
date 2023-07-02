#language: es

  Característica: Agregar producto al carrito de compras
    Yo como usuario quiero guardar un producto en el carrito
    para poder comprarlo después

  @AgregarProductoCarrito
  Escenario: : Agregar un producto al carrito de compras
    Dado que el usuario ingrese a la pagina de alkomprar
    Cuando el usuario busque un producto con la barra de busqueda
    Y el usuario escoge un producto de el catalogo y da click en agregar al carrito
    Entonces el usuario ve el mensaje se agrego el producto satisfactoriamente



