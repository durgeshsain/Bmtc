package com.bmtc.app.vo;

import org.springframework.stereotype.Component;

@Component
public class Traveller {
	private int travellerId;
	private String name;
	private String email;
	private int age;
	private String aadhar;
	
	
	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "Traveller [name=" + name + ", email=" + email + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
}
