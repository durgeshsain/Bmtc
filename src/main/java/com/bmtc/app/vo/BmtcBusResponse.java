package com.bmtc.app.vo;

import org.springframework.stereotype.Component;

@Component
public class BmtcBusResponse {
	
	private String busName;
	private String busNo;
	
	
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	
	

}
