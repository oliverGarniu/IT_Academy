package n1exercici4;

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
	public static <T> void numArgs(T ... t) {

		System.out.println("Número d´args: " + t.length);
		
		for (int i = 0; i < t.length; i++) {
			System.out.println("arg " + i + ": " + t);
			
		}

	}

	@Override
	public String toString() {
		return "GenericMethods [a=" + a + ", b=" + b + ", c=" + c + "]";
	}

}
