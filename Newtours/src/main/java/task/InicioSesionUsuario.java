package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IniciarSesion;

public class InicioSesionUsuario implements Task{

	private String nombreUsuario;
	private String contraseñaUsuario;
	
	public InicioSesionUsuario(	String nombreUsuario, String contraseñaUsuario) {
		
		this.nombreUsuario=nombreUsuario;
		this.contraseñaUsuario=contraseñaUsuario;
	} 
	
	public static InicioSesionUsuario iniciarSesion(String nombreUsuario, String contraseñaUsuario) {
		return Tasks.instrumented(InicioSesionUsuario.class, nombreUsuario, contraseñaUsuario);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(IniciarSesion.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(IniciarSesion.NOMBRE_USUARIO),
				Enter.theValue(contraseñaUsuario).into(IniciarSesion.CONTRASEÑA_USUARIO),
				Click.on(IniciarSesion.ENVIAR)
				);
		
	}

}
