#Author:Sebas2011561@2outlook.es

Feature: Registar un usuario
   Como estudiante de semillero
  necesito aprender automatización a traves de ejemplos
  para automatizar cualquier caso de prueba
  
  Background:
  	Given   Ingrese a la pagina

  @tag1
  Scenario: Registar usuario en la pagina 
    When    un usuario se registra con los datos sebas, gutierrez, 3222619909, guamerosyt@gmail.com, calle17, medallo, antioquia, 234, sebitas, sebitas1234   
    Then    el usuario ve el mensaje de registro exitoso
    
    
  @tag2
  Scenario: Iniciar sesion con un usuario
    When    El usuario hace login con las credenciales sebitas y sebitas1234
    Then    EL usuario se logea correctamente 