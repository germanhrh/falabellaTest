Feature: Resumen Compra falabella
  Se desea automatizar una prueba que permita validar correcto funcionamiento del resumen de una compra falabella antes de pagar


  @ResumenCompra
  Scenario: Resumen Compra falabella
    Given que un cliente abre la pagina de google
    When busca e ingresa a la pagina de falabella
    And ingresa el nombre de un articulo en el buscador y presiona enter
    And selecciona y agrega un articulo al carrito de compras
    And adiciona un seguro para el articulo en la compra
    Then valido la correcta generacion del resumen de la compra

