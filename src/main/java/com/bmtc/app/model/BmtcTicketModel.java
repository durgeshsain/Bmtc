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
@Table(name = "bmtc_ticket")
public class BmtcTicketModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Long ticket_id;
	@Column(name = "name")
	private String passengerName;
	@Column(name = "seats_booked")
	private int numSeatsBooked;
	@Column(name = "bus_number")
	String busNo;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "traveller_id")
	private TravellerModel traveller;
	
	
	public Long getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(Long ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public int getNumSeatsBooked() {
		return numSeatsBooked;
	}
	public void setNumSeatsBooked(int numSeatsBooked) {
		this.numSeatsBooked = numSeatsBooked;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public TravellerModel getTraveller() {
		return this.traveller;
	}
	public void setTraveller(TravellerModel traveller) {
		this.traveller = traveller;
	}
	
	@Override
	public String toString() {
		return "BmtcTicketModel [ticket_id=" + ticket_id + ", passengerName=" + passengerName + ", numSeatsBooked="
				+ numSeatsBooked + ", busNo=" + busNo + "]";
	}
	
	

}
