package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static userinterfaces.IniciarSesion.USUARIO_LOGEADO;

public class ConfirmacionLogin implements Question<Boolean> {

	@Override
	public Boolean answeredBy(Actor actor) {
		return USUARIO_LOGEADO.resolveFor(actor).isVisible();
	}

	public static ConfirmacionLogin user() {
		return new ConfirmacionLogin();

	}
}
