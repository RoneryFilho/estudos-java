package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	private String name;
	private String email;
	private Date birthDate;

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Client(String name, String email, Date birthDate) {
		super();
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "Client: " + name + "(" + sdf.format(birthDate) + ") - " + email;
	}

}
