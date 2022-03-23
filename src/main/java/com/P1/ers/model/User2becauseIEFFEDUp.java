package com.P1.ers.model;

import java.util.Objects;

public class User2becauseIEFFEDUp {
	private int userId;
	private String username;
	private String password;
	private String phone;
	private String email;
	private String address;
	private String rank;
	private String gender;
	private String notifications;
	private String qualification;

public User2becauseIEFFEDUp() {
	
	// TODO Auto-generated constructor stub
}
public User2becauseIEFFEDUp(int userId, String username, String password,String phone, String email, String address, String rank, String gender, String notifications, String qualification) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	this.phone = phone;
	this.email = email;
	this.address = address;
	this.rank = rank;
	this.gender = gender;
	this.notifications= notifications;
	this.qualification = qualification;
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

public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getNotifications() {
	return notifications;
}
public void setNotifications(String notifications) {
	this.notifications = notifications;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
@Override
public int hashCode() {
	return Objects.hash(address, email, gender, notifications, password, phone, qualification, rank, userId, username);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User2becauseIEFFEDUp other = (User2becauseIEFFEDUp) obj;
	return Objects.equals(address, other.address) && Objects.equals(email, other.email)
			&& Objects.equals(gender, other.gender) && Objects.equals(notifications, other.notifications)
			&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone)
			&& Objects.equals(qualification, other.qualification) && Objects.equals(rank, other.rank)
			&& userId == other.userId && Objects.equals(username, other.username);
}
@Override
public String toString() {
	return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", phone=" + phone
			+ ", email=" + email + ", address=" + address + ", rank=" + rank + ", gender=" + gender + ", notifications="
			+ notifications + ", qualification=" + qualification + "]";
}




}

