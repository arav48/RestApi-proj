package com.example.clownstars.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class login {
	@Id
	private String username;
	private String password;
	private String email;
	private String gender;
	private String firstname;
	private String lastname;
	private String dob;
	private String contact;
	private String city;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "login [username=" + username + ", password=" + password + ", email=" + email + ", gender=" + gender
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", dob=" + dob + ", contact=" + contact
				+ ", city=" + city + "]";
	}
	
	
	
	


}
