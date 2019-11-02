package com.bmtc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bmtc.app.service.BmtcAdminService;
import com.bmtc.app.vo.BmtcBusRequest;
import com.bmtc.app.vo.BmtcBusResponse;

@Controller
public class BmtcAdminController {
	@Autowired
	BmtcAdminService bmtcAdminService;
	@Autowired
	BmtcBusResponse bmtcBusResponse;
	
	@RequestMapping(value = "/addBmtcBus", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BmtcBusResponse> addBmtcBus(@RequestBody BmtcBusRequest bmtcBusRequest) {
		
		bmtcBusResponse = bmtcAdminService.addBmtcBus(bmtcBusRequest);
		
		return new ResponseEntity<BmtcBusResponse>(bmtcBusResponse, HttpStatus.CREATED);
		
	}
	public void removeBus() {
		
	}
}
