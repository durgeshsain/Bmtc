package com.bmtc.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bmtc.app.dao.BmtcDAO;
import com.bmtc.app.vo.BmtcRequest;
import com.bmtc.app.vo.BmtcResponse;
import com.bmtc.app.vo.Traveller;

@Controller
public class BmtcController {
	private static final Logger logg = LogManager.getLogger(BmtcController.class);
	@Autowired
	private BmtcDAO bmtcDao;
	@Autowired
	private Traveller traveller;
	@RequestMapping("/")
	@ResponseBody
	public ResponseEntity<String> works() {
		return new ResponseEntity<String>("It Works", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<BmtcResponse> book(@RequestBody BmtcRequest bookingDetails) throws Exception {
		logg.info("Inside book Method");
		if(bookingDetails.getTraveller().getAge() < 0) {
			throw new Exception("Enter proper age");
		}
		logg.info("My dad's name is " + bookingDetails.getTraveller().getName());
		traveller = bookingDetails.getTraveller();
		String busNo = bookingDetails.getBusBooked();
		int numOfSeats = bookingDetails.getSeatBooked();
		int tktId = bmtcDao.bookTicket(traveller, busNo, numOfSeats);
		BmtcResponse resp = new BmtcResponse();
		resp.setTicketid(tktId);
		return new ResponseEntity<BmtcResponse>(resp, HttpStatus.CREATED);
	}
	
	@RequestMapping(value= "/showTicket", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String showTicket(int travellerId) {
		
		return null;
	}

}
