package n1Patterns2;

public class AgenciaBorsa {

	private String nom;
	private double valor;

	public AgenciaBorsa(String nom) {
		super();
		this.nom = nom;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getValor() {
		return valor;
	}

	public double setValor(double valor) {
		return this.valor = valor;
	}

	void avisar() {

		System.out.println(nom + " ha sigut notificat dels canvis en els valors borsàtils");

	}

}
