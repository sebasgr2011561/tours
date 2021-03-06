package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.IniciarSesion;

public class InicioSesionUsuario implements Task{

	private String nombreUsuario;
	private String contraseņaUsuario;
	
	public InicioSesionUsuario(	String nombreUsuario, String contraseņaUsuario) {
		
		this.nombreUsuario=nombreUsuario;
		this.contraseņaUsuario=contraseņaUsuario;
	} 
	
	public static InicioSesionUsuario iniciarSesion(String nombreUsuario, String contraseņaUsuario) {
		return Tasks.instrumented(InicioSesionUsuario.class, nombreUsuario, contraseņaUsuario);
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Click.on(IniciarSesion.DESLOGEO), 
				Enter.theValue(nombreUsuario).into(IniciarSesion.NOMBRE_USUARIO),
				Enter.theValue(contraseņaUsuario).into(IniciarSesion.CONTRASEŅA_USUARIO),
				Click.on(IniciarSesion.ENVIAR)
				);
		
	}

}
