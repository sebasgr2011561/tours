$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/HU001_RegistarNewtours.feature");
formatter.feature({
  "name": "Registar un usuario",
  "description": "   Como estudiante de semillero\n  necesito aprender automatizaci�n a traves de ejemplos\n  para automatizar cualquier caso de prueba",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingrese a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsNewtours.ingrese_a_la_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Registar usuario en la pagina",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "un usuario se registra con los datos sebas, gutierrez, 3222619909, guamerosyt@gmail.com, calle17, medallo, antioquia, 234, sebitas, sebitas1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsNewtours.un_usuario_se_registra(String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "el usuario ve el mensaje de registro exitoso",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsNewtours.el_usuario_ve_el_mensaje_de_registro_exitoso()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Ingrese a la pagina",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionsNewtours.ingrese_a_la_pagina()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Iniciar sesion con un usuario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "El usuario hace login con las credenciales sebitas y sebitas1234",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionsNewtours.el_usuario_hace_login_con_las_credenciales(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "EL usuario se logea correctamente",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionsNewtours.el_usuario_se_logea_correctamente()"
});
formatter.result({
  "status": "passed"
});
});