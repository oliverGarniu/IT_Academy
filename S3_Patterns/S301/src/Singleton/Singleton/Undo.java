package n1exercici1.Singleton;

import java.util.ArrayList;

public class Undo {

//	private String newComando;
	private ArrayList<String> comandos;
	private ArrayList<String> lastComandos;
//	private int comandoPosition;

	private static Undo instancia = new Undo();

	private Undo() {

		this.comandos = new ArrayList<String>();
		this.lastComandos = new ArrayList<String>();
	}

	public static Undo getInstancia() {
		if (instancia == null) {
			instancia = new Undo();

		}
		return instancia;
	}

	public void add(String newComando) {
		comandos.add(newComando);

	}

	public void remove(int comandoPosition) {
		comandos.remove(comandoPosition);

	}

	public ArrayList<String> getComandos() {

		return comandos;

	}

	public ArrayList<String> getLastComandos() {
		for (int i = comandos.size(); i > (comandos.size() - 3); i--) {
			lastComandos.add(comandos.get(i - 1));

		}
		return lastComandos;

	}

}
