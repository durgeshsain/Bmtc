package com.bmtc.app.vo;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	private String busNo;
	private String busName;
	private String source;
	private String destinition;
	private int noOfSeat;
	private int remainingSeats;
	public Bus() {
	}
	public Bus(String busNo, String busName, String source, String destinition, int noOfSeat, int remainingSeats) {
		super();
		this.busNo = busNo;
		this.busName = busName;
		this.source = source;
		this.destinition = destinition;
		this.noOfSeat = noOfSeat;
		this.remainingSeats = remainingSeats;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinition() {
		return destinition;
	}
	public void setDestinition(String destinition) {
		this.destinition = destinition;
	}
	public int getNoOfSeat() {
		return noOfSeat;
	}
	public void setNoOfSeat(int noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public int getRemainingSeats() {
		return remainingSeats;
	}
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}
	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busName=" + busName + ", source=" + source + ", destinition=" + destinition
				+ ", noOfSeat=" + noOfSeat + ", remainingSeats=" + remainingSeats + "]";
	}
}
