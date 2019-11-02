package com.bmtc.app.service;

import com.bmtc.app.vo.BmtcBusResponse;

import org.springframework.stereotype.Component;

import com.bmtc.app.vo.BmtcBusRequest;
@Component
public interface BmtcAdminService {

	public BmtcBusResponse addBmtcBus(BmtcBusRequest bmtcBusRequest);
	
	

}
