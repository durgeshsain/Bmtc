package com.bmtc.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bmtc.app.model.BmtcTicketModel;
import com.bmtc.app.repository.BmtcTicketModelRepository;
import com.bmtc.app.vo.Bus;
import com.bmtc.app.vo.ShowTicket;
import com.bmtc.app.vo.Tickets;
import com.bmtc.app.vo.Traveller;

@Repository
public class BmtcDAO {
	private List<Bus> busList = new ArrayList<Bus>();
	private List<Tickets> ticket = new ArrayList<Tickets>();
	@Autowired
	private Tickets tickets;
	@Autowired
	private ShowTicket showTicket;
	@Autowired
	private BmtcTicketModelRepository bmtcTicketModelRepository;
	@Autowired
	private static AtomicInteger ticketNumber = new AtomicInteger(0);
	
	private static final Logger logg = LogManager.getLogger(BmtcDAO.class);
	
	public BmtcDAO() {
		Bus bus1 = new Bus(1, "500D", "Tapan limited", "Silk board", "Hebbala", 10);
		Bus bus2 = new Bus(2, "500CA", "Kunal limited", "Silk board", "ITPL", 10);
		busList.add(bus1);
		busList.add(bus2);
		//Tickets ticket1 = new Tickets(4, "");
	}
	
	public BmtcTicketModel bookTicket(Traveller traveller, String busNo, int numOfSeats) throws Exception {

		logg.info("Inside dao: " + traveller);
		Bus bus = getBus(busNo);
		logg.warn("Bus returned : " + bus);
		if (null == bus) {
			throw new Exception("Invalid Bus number");
		}
		synchronized (bus) {
			/*
			 * if(null != bus && bus.getNoOfSeat() - numOfSeats > 0) {
			 * bus.setRemainingSeats(bus.getRemainingSeats() - numOfSeats);
			 */
			BmtcTicketModel bmtcTicketModel = new BmtcTicketModel();
			bmtcTicketModel.setPassengerName(traveller.getName());
			bmtcTicketModel.setNumSeatsBooked(numOfSeats);
			bmtcTicketModel.setBusNo(bus.getBusNo());
			System.out.println(bmtcTicketModel);
			logg.info("Tickets booked");
			return bmtcTicketModel = bmtcTicketModelRepository.save(bmtcTicketModel);
		}
		//return bmtcTicketModel;
	}
	
	private Bus getBus(String busNo) {
		for(Bus bus : busList) {
			if(bus.getBusNo().equals(busNo)) {
				return bus;
			}
		}
		return null;
	}

	public ShowTicket showTicket(String travellerName) {
		// TODO Auto-generated method stub
		for(Tickets tickets: ticket) {
			
			if(tickets.getTraveller().getName().equals(travellerName)) {
				
				showTicket.setBusNo(tickets.getBus().getBusNo());
				showTicket.setTravellerName(travellerName);
				showTicket.setSeatsBooked(tickets.getSeatsBooked());
				//showTicket.setTicketId(tickets.g);
				return showTicket;
			}
		}
		return null;
		
	}
}
