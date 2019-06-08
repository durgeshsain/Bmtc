package com.bmtc.app.vo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Ticket implements Serializable {
	private static final long serialVersionUID = -4557777481340982619L;
	private int ticketNumber;
	private Traveller traveller;
	private Bus bus;
	private int seatsBooked;
	
	
	
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	public Bus getBus() {
		return bus;
	}
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	public int getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
	

}
