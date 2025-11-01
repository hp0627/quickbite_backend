package quick.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity @Table
public class Users {

	public static final int USER = 0;
	public static final int ADMIN = 1;
	public static final int RESTAURANT = 2;

	
@Column
String fullname;

@Column @Id
String email;

@Column
String password;

@Column
String role; // values: "USER", "ADMIN", "RESTAURANT"



public String getFullname() {
	return fullname;
}

public void setFullname(String fullname) {
	this.fullname = fullname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}


public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Users [fullname=" + fullname + ", email=" + email + ", role=" + role + ", password=" + password + "]";
}



}
