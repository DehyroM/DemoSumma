Feature: Registro en pagina Web
  Yo como usuario de la pagina Automation Exercise
  Quiero poder abrir la web
  Para registrarme en la misma

  Scenario: Como usuario ingreso a la pagina web
    Given el usuario ingresa a la pagina web
    When  el usuario interactua con la pagina web
    Then  debera obtener una respuesta