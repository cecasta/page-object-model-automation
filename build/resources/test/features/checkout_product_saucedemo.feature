#language:es

  Característica: Compra de productos
    Yo como usuario de Saucedemo
    Quiero agregar productos al carrito
    Para realizar la compra de estos

    Antecedentes:
      Dado que el usuario se encuentra en la pagina
      Cuando usuario ingresa sus credenciales

    Escenario: Realizar checkout de compra
      Cuando cuando el usuario agrega producto al carrito
        Y realiza el checkout de la compra
      Entonces el  usuario finaliza la compra