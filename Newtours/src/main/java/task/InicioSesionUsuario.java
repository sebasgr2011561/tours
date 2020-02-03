package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IniciarSesion;

public class InicioSesionUsuario implements Task{

	private String nombreUsuario;
	private String contrase�aUsuario;
	
	public InicioSesionUsuario(	String nombreUsuario, String contrase�aUsuario) {
		
		this.nombreUsuario=nombreUsuario;
		this.contrase�aUsuario=contrase�aUsuario;
	} 
	
	public static InicioSesionUsuario iniciarSesion(String nombreUsuario, String contrase�aUsuario) {
		return Tasks.instrumented(InicioSesionUsuario.class, nombreUsuario, contrase�aUsuario);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(IniciarSesion.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(IniciarSesion.NOMBRE_USUARIO),
				Enter.theValue(contrase�aUsuario).into(IniciarSesion.CONTRASE�A_USUARIO),
				Click.on(IniciarSesion.ENVIAR)
				);
		
	}

}
