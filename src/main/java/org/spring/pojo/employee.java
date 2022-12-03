package org.spring.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentpojoo")
public class employee {
	@Id
public int id;
public String name;

public String city;
public String Email;
public String Password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public employee(int id,String email, String password, String city, String name ) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	Email = email;
	Password = password;
}
public employee() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "employee [id=" + id + ", name=" + name + ", city=" + city + ", Email=" + Email + ", Password=" + Password
			+ "]";
}


}
