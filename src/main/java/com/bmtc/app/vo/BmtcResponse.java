package com.bmtc.app.vo;

public class BmtcResponse {
	
	private Long ticketid;
	private String passsengerName;
	private String busNo;
	private int noOfSeatsBooked;
	

	public Long getTicketid() {
		return ticketid;
	}

	public void setTicketid(Long ticketid) {
		this.ticketid = ticketid;
	}

	public String getPasssengerName() {
		return passsengerName;
	}

	public void setPasssengerName(String passsengerName) {
		this.passsengerName = passsengerName;
	}

	public String getBusNo() {
		return busNo;
	}

	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}

	public int getNoOfSeatsBooked() {
		return noOfSeatsBooked;
	}

	public void setNoOfSeatsBooked(int noOfSeatsBooked) {
		this.noOfSeatsBooked = noOfSeatsBooked;
	}
	
	
}
