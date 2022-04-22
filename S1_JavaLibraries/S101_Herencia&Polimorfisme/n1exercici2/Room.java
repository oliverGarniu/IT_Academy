package n1exercici2;

public class Room {

	private String nomHab;

	public Room(String nomHab) {
		super();
		this.nomHab = nomHab;
	}

	public String getNomHab() {
		return nomHab;
	}

	public void setNomHab(String nomHab) {
		this.nomHab = nomHab;
	}

	@Override
	public String toString() {
		return "Room [nomHab=" + nomHab + "]";
	}

}