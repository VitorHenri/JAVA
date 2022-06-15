package entities;

import java.util.Date;
import java.util.Objects;

public class Users {
	private String name;
	private Date loggedIn;
	
	public Users(String name, Date loggedIn) {
		super();
		this.name = name;
		this.loggedIn = loggedIn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Date loggedIn) {
		this.loggedIn = loggedIn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
	
}
