package exceptios;

public class ErrorRegistro extends AssertionError{

	public ErrorRegistro() {
		super("Error no se pudo registar");
	}
}
