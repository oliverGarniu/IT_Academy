package n1exercici3;

public class GenericMethods {

	private String a;
	private String b;
	private int c;

	public GenericMethods(String a, String b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	@SafeVarargs
	public static <T> String valorLletres(T a, T b, T ... c) {

		return "El contingut de les variables és: a= " + a + "; b= " + b + "; c= " + c;

	}

	@Override
	public String toString() {
		return "GenericMethods [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
