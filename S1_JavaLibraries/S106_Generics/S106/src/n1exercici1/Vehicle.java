package n1exercici1;

public class Vehicle<T> {

	private T valor1;
	private T valor2;
	private T valor3;

	public Vehicle(T valor1, T valor2, T valor3) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}

	public T getValor1() {
		return valor1;
	}

	public void setValor1(T valor1) {
		this.valor1 = valor1;
	}

	public T getValor2() {
		return valor2;
	}

	public void setValor2(T valor2) {
		this.valor2 = valor2;
	}

	public T getValor3() {
		return valor3;
	}

	public void setValor3(T valor3) {
		this.valor3 = valor3;
	}

	@Override
	public String toString() {
		return "Vehicle [valor1=" + valor1 + ", valor2=" + valor2 + ", valor3=" + valor3 + "]";
	}

}
