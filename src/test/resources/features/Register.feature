#language: es

  Característica: Registro usuario
    Yo como usuario quiero registrarme en la pagina de alkomprar
    para tener una cuenta

  @RegistroExitoso
  Escenario: Registrar usuario de forma exitosa
    Dado que el usuario ingrese a la pagina de alkomprar
    Cuando el usuario de click en mi cuenta e ingrese el correo y de click en continuar
    Y el usuario ingrese todos los campos del formulario y de click en continuar
    Entonces el usuario puede ver el titulo mi cuenta
