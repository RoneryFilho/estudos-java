package entities;

public class Tenants {
	
	private String name;
	private String email;
	public int roomNumber;
	
	

	public Tenants(String name, String email, int roomNumber) {
		this.name = name;
		this.email = email;
		this.roomNumber = roomNumber;
	}

	public int getRoomNumber() {
		return roomNumber;
	}
	
	public String toString() {
		return String.format("%d: ",roomNumber) + name + ", " + email;
	}
}
