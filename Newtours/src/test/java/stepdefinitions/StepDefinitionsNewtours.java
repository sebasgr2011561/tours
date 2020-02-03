package stepdefinitions;

import org.openqa.selenium.WebDriver;

import userinterfaces.InicioNewtours;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import exceptios.ErrorLogin;
import exceptios.ErrorRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import questions.ConfirmacionLogin;
import questions.ConfirmacionRegistro;
import task.InicioSesionUsuario;
import task.RegistarUsuario;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StepDefinitionsNewtours {

	@Managed(driver = "chrome")
	private WebDriver web;
	private Actor actor = Actor.named("Sebastian");
	private InicioNewtours newtours;

	@Before
	public void setUp() {
		web.manage().window().maximize();
		actor.can(BrowseTheWeb.with(web));
	}

	@Given("^Ingrese a la pagina$")
	public void ingrese_a_la_pagina() {
		actor.wasAbleTo(Open.browserOn(newtours));
	}

	@When("^un usuario se registra con los datos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)$")
	public void un_usuario_se_registra(String nombre, String apellido, String celular, String correo, String direccion,
			String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contraseña) {
		actor.attemptsTo(RegistarUsuario.nuevo(nombre, apellido, celular, correo, direccion, ciudad, provincia,
				codigoPostal, nombreUsuario, contraseña));
	}

	@Then("^el usuario ve el mensaje de registro exitoso$")
	public void el_usuario_ve_el_mensaje_de_registro_exitoso() throws Exception {
		actor.should(seeThat(ConfirmacionRegistro.usuario()).orComplainWith(ErrorRegistro.class));
	}

	@When("^El usuario hace login con las credenciales (.*) y (.*)$")
	public void el_usuario_hace_login_con_las_credenciales(String nombreUsuario, String contraseñaUsuario) {

		actor.attemptsTo(InicioSesionUsuario.iniciarSesion(nombreUsuario, contraseñaUsuario));

	}

	@Then("^EL usuario se logea correctamente$")
	public void el_usuario_se_logea_correctamente() {
		actor.should(seeThat(ConfirmacionLogin.user()).orComplainWith(ErrorLogin.class));
	}
}
