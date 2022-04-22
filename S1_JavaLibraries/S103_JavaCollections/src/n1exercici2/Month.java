package n1exercici2;

public class Month {

	private String name;

	public Month(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Month [name=" + name + "]";
	}

}
