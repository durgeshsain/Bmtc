package com.bmtc.app.vo;

public class BmtcRequest {
	private Traveller traveller;
	private String busBooked;
	private int seatBooked;
	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	public String getBusBooked() {
		return busBooked;
	}
	public void setBusBooked(String busBooked) {
		this.busBooked = busBooked;
	}
	public int getSeatBooked() {
		return seatBooked;
	}
	public void setSeatBooked(int seatBooked) {
		this.seatBooked = seatBooked;
	}
}
