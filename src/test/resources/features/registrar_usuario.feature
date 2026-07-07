Feature: registrar usuario
  @Registrar
  Scenario Outline: registrar un usuario
  Given el usuario esta en la pagina de inicio
  When se registra con un nombre de usuario "<username>" y contrasenia "<password>"
  Then se realiza el registro de manera exitosa
  Examples:
  |username    |password|
  |RENZO123 |pass123 |
