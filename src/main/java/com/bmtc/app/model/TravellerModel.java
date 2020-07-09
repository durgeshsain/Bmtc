package com.bmtc.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "bmtc_traveller")
public class TravellerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "traveller_id")
	private int travellerId;
	@Column(name = "name")
	private String travellerName;
	@Column(name = "email")
	private String email;
	@Column(name = "age")
	private int age;
	@Column(name = "aadhar_number")
	private String aadhar;
	
	public int getTravellerId() {
		return travellerId;
	}
	public void setTravellerId(int travellerId) {
		this.travellerId = travellerId;
	}
	public String getTravellerName() {
		return travellerName;
	}
	public void setName(String travellerName) {
		this.travellerName = travellerName;
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
	/*public BmtcTicketModel getBmtcTicketModel() {
		return bmtcTicketModel;
	}
	public void setBmtcTicketModel(BmtcTicketModel bmtcTicketModel) {
		this.bmtcTicketModel = bmtcTicketModel;
	}*/
	@Override
	public String toString() {
		return "Traveller [travellerName=" + travellerName + ", email=" + email + ", age=" + age + ", aadhar=" + aadhar + "]";
	}
}
