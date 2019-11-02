package com.bmtc.app.vo;

import org.springframework.stereotype.Component;

@Component
public class ShowTicket {
	
	private int ticketId;
	private String travellerName;
	private String busNo;
	private int seatsBooked;
	
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getTravellerName() {
		return travellerName;
	}
	public void setTravellerName(String travellerName) {
		this.travellerName = travellerName;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public int getSeatsBooked() {
		return seatsBooked;
	}
	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}
	
	

}
