package com.bmtc.app.controller;

import javax.websocket.server.PathParam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.logging.Param;
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
import com.bmtc.app.model.BmtcTicketModel;
import com.bmtc.app.vo.BmtcRequest;
import com.bmtc.app.vo.BmtcResponse;
import com.bmtc.app.vo.ShowTicket;
import com.bmtc.app.vo.Tickets;
import com.bmtc.app.vo.Traveller;

@Controller
public class BmtcController {
	private static final Logger logg = LogManager.getLogger(BmtcController.class);
	@Autowired
	private BmtcDAO bmtcDao;
	@Autowired
	private Traveller traveller;
	@Autowired
	private Tickets tickets;
	@Autowired
	private ShowTicket showTicket;
	@Autowired
	private BmtcTicketModel bmtcTicketModel;
	@RequestMapping("/")
	@ResponseBody
	public ResponseEntity<String> works() {
		return new ResponseEntity<String>("It Works", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	//@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<BmtcTicketModel> book(@RequestBody BmtcRequest bookingDetails) throws Exception {
		logg.info("Inside book Method");
		if(bookingDetails.getTraveller().getAge() < 0) {
			throw new Exception("Enter proper age");
		}
		logg.info("My dad's name is " + bookingDetails.getTraveller().getName());
		traveller = bookingDetails.getTraveller();
		String busNo = bookingDetails.getBusBooked();
		int numOfSeats = bookingDetails.getSeatBooked();
		bmtcTicketModel = bmtcDao.bookTicket(traveller, busNo, numOfSeats);
		/*BmtcResponse bmtcResponse = new BmtcResponse();
		bmtcResponse.setTicketid(bmtcTicketModel.getTicket_id());
		bmtcResponse.setPasssengerName(bmtcTicketModel.getPassengerName());
		bmtcResponse.setNoOfSeatsBooked(bmtcTicketModel.getNumSeatsBooked());
		bmtcResponse.setBusNo(bmtcTicketModel.getBusNo());*/
		return new ResponseEntity<BmtcTicketModel>(bmtcTicketModel, HttpStatus.CREATED);
	}
	
	@RequestMapping(value= "/showTicket", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ShowTicket showTicket(@PathParam("travellerName") String travellerName) {
		
		showTicket = bmtcDao.showTicket(travellerName);
		System.out.println("Tickets are :"+tickets.toString());
		return null;
	}
	

}
