package com.P1.ers.model;

import java.util.Objects;

public class User {
	private int userId;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String address;
	private String employment;
	

public User() {
	
	// TODO Auto-generated constructor stub
}
public User(int userId, String username, String password, String firstname, String lastname, String phone, String email, String address, String employment) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	this.firstname = firstname;
	this.lastname = lastname;
	this.phone = phone;
	this.email = email;
	this.address = address;
	this.employment = employment;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmployment() {
	return employment;
}
public void setEmployment(String employment) {
	this.employment = employment;
}
@Override
public int hashCode() {
	return Objects.hash(address, email, employment, firstname, lastname, password, phone, userId, username);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return Objects.equals(address, other.address) && Objects.equals(email, other.email)
			&& Objects.equals(employment, other.employment) && Objects.equals(firstname, other.firstname)
			&& Objects.equals(lastname, other.lastname) && Objects.equals(password, other.password)
			&& Objects.equals(phone, other.phone) && userId == other.userId && Objects.equals(username, other.username);
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", firstname=" + firstname
			+ ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", address=" + address
			+ ", employment=" + employment + "]";
}







}

