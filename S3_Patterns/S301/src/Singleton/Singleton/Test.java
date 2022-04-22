package n1exercici1.Singleton;

public class Test {

	public static void main(String[] args) {

		Undo comando = Undo.getInstancia();

		comando.add("a");
		comando.add("b");
		comando.add("c");
		comando.add("d");
		comando.add("e");
		comando.add("f");
		comando.add("g");
		comando.add("h");
		comando.add("i");

		comando.remove(2);

		System.out.println(comando.getComandos());

		System.out.println("Els darrers tres comandos són: " + comando.getLastComandos());

	}

}
