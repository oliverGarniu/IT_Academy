package n1exercici5;

public class MyException extends Exception {

	public MyException() {
		super();
	}

	public String getMessage() {

		return "Hem d´obtenir un número positiu";

	}

	@Override
	public String toString() {
		return "MyException []";
	}

}
