package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name = "user")
@Entity
@Component
public class User {

@Id
@Column(name="UserId")
@GeneratedValue

private int userId;

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

private String userName;

private String emailId;

private String password;

private int phoneNumber;

private String address;

private int pincode;

private boolean enabled;




}
