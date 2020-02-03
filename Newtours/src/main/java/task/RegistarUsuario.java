package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.InicioNewtours;
import userinterfaces.RegistroNewtours;

public class RegistarUsuario implements Task {

	private String nombre;
	private String apellido;
	private String celular;
	private String correo;
	private String direccion;
	private String ciudad;
	private String provincia;
	private String codigoPostal;
	private String nombreUsuario;
	private String contraseña;


	public RegistarUsuario(String nombre, String apellido, String celular, String correo, String direccion,
			String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contraseña) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.ciudad = ciudad;
		this.correo = correo;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.nombreUsuario = nombreUsuario;
		this.contraseña = contraseña;
		this.provincia=provincia;

	}

	public static RegistarUsuario nuevo(String nombre, String apellido, String celular, String correo, String direccion,
			 String ciudad, String provincia, String codigoPostal, String nombreUsuario, String contraseña ) {

		return Tasks.instrumented(RegistarUsuario.class, nombre, apellido, celular, correo, direccion, ciudad,
				provincia, codigoPostal, nombreUsuario, contraseña);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(InicioNewtours.REGISTRO), 
				Enter.theValue(nombre).into(RegistroNewtours.NOMBRE),
				Enter.theValue(apellido).into(RegistroNewtours.APELLIDO),
				Enter.theValue(celular).into(RegistroNewtours.TELEFONO),
				Enter.theValue(correo).into(RegistroNewtours.EMAIL),
				Enter.theValue(direccion).into(RegistroNewtours.ADDRES),
				Enter.theValue(direccion).into(RegistroNewtours.ADDRES2),
				Enter.theValue(ciudad).into(RegistroNewtours.CIUDAD),
				Enter.theValue(provincia).into(RegistroNewtours.PROVINCIA),
				Enter.theValue(codigoPostal).into(RegistroNewtours.CODIGO_POSTAL),
				Enter.theValue(nombreUsuario).into(RegistroNewtours.USERNAME),
				Enter.theValue(contraseña).into(RegistroNewtours.PASSWORD),
				Enter.theValue(contraseña).into(RegistroNewtours.COMFIRMPASSWORD),
				Click.on(RegistroNewtours.ENVIAR));

	}

}
