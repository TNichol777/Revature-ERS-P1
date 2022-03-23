package com.P1.ers.model;

import java.util.Objects;

public class UpdateInfo {
	private int userId;
	private String password;
	private String firstname;
	private String lastname;
	private String phone;
	private String email;
	private String address;
	public UpdateInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UpdateInfo(int userId, String password, String firstname, String lastname, String phone, String email,
			String address) {
		super();
		this.userId = userId;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	@Override
	public int hashCode() {
		return Objects.hash(address, email, firstname, lastname, password, phone, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UpdateInfo other = (UpdateInfo) obj;
		return Objects.equals(address, other.address) && Objects.equals(email, other.email)
				&& Objects.equals(firstname, other.firstname) && Objects.equals(lastname, other.lastname)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone)
				&& userId == other.userId;
	}
	@Override
	public String toString() {
		return "UpdateInfo [userId=" + userId + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", phone=" + phone + ", email=" + email + ", address=" + address + "]";
	}

	
}
