@Carrito
Feature: Carrito de compras

  Scenario: Agregar producto

    Given el usuario esta en la pagina de inicio
    When agrega un producto al carrito
    And ingresa al carrito
    Then visualiza el producto "Samsung galaxy s6"