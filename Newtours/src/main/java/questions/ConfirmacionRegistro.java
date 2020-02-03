package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterfaces.RegistroNewtours.USUARIO_REGISTRADO;

public class ConfirmacionRegistro implements Question<Boolean> {
	
	@Override
	public Boolean answeredBy(Actor actor) {

		return USUARIO_REGISTRADO.resolveFor(actor).isVisible();
	}
	
	public static ConfirmacionRegistro usuario() {
		return new ConfirmacionRegistro();
	}

}
