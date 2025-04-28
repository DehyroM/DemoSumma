Feature: Loguearse en la web
  Yo como usuario de la web Automation Exercise
  Quiero poder acceder a la web
  Para interactuar con los servicios ofrecidos en la misma

  Background:
    Given el usuario ingresa a la pagina web
    When el cliente entra en la seccion Sign Up del sitio Web

  Scenario: Como cliente proporciono la informacion necesaria para poder ingresar a la cuenta
    When  el cliente ingresa sus datos personales y clickea el boton Create Account
    Then  debera aparecer la confirmacion de creacion de la cuenta