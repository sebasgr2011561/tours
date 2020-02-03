package exceptios;

public class ErrorLogin extends AssertionError {

	public ErrorLogin() {
		super("Error no se pudo logear");
	}
}
