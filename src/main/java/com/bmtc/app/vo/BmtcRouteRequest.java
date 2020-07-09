package com.bmtc.app.vo;

public class BmtcRouteRequest {
	
	private String routeName;
	private String source;
	private String destination;
	private int numOfBus;
	private int busCapacity;
	
	
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNumOfBus() {
		return numOfBus;
	}
	public void setNumOfBus(int numOfBus) {
		this.numOfBus = numOfBus;
	}
	public int getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}

}
