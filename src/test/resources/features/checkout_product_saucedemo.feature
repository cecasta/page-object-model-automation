#language:es

Característica: Compra de productos
  Yo como usuario de Saucedemo
  Quiero agregar productos al carrito
  Para realizar la compra de estos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina
    Cuando usuario ingresa sus credenciales
      | usuario  | standard_user|
      | clave |secret_sauce|

  Esquema del escenario: Realizar checkout de compra
    Cuando cuando el usuario agrega producto al carrito
    Y realiza el checkout de la compra
      | nombre   | apellido   | postal         |
      | <nombre> | <apellido> | <codigoPostal> |
    Entonces el  usuario finaliza la compra
    Ejemplos:
      | nombre | apellido | codigoPostal |
      | cesar  | castano  | 20007        |
      | Maria  | Lopez  | 67440007        |