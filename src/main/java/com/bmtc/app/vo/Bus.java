package com.bmtc.app.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "BmtcBus")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bus_id")
	private int busId;
	@Column(name = "bus_no")
	private String busNo;
	@Column(name = "bus_name")
	private String busName;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destinition;
	@Column(name = "number_of_seats")
	private int noOfSeat;
	/*@Transient
	private int remainingSeats;*/
	public Bus() {
		
	}
	
	public Bus(int busId, String busNo, String busName, String source, String destinition, int noOfSeat) {
		
		super();
		this.busId = busId;
		this.busNo = busNo;
		this.busName = busName;
		this.source = source;
		this.destinition = destinition;
		this.noOfSeat = noOfSeat;
		//this.remainingSeats = remainingSeats;
	}
	
	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
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
	/*public int getRemainingSeats() {
		return remainingSeats;
	}
	public void setRemainingSeats(int remainingSeats) {
		this.remainingSeats = remainingSeats;
	}*/
	
	@Override
	public String toString() {
		return "Bus [busNo=" + busNo + ", busName=" + busName + ", source=" + source + ", destinition=" + destinition
				+ ", noOfSeat=" + noOfSeat + "]";
	}
}
