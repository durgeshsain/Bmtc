package com.bmtc.app.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bmtc.app.vo.Bus;
import com.bmtc.app.vo.Tickets;
import com.bmtc.app.vo.Traveller;

@Repository
public class BmtcDAO {
	private List<Bus> busList = new ArrayList<Bus>();
	private List<Tickets> ticket = new ArrayList<Tickets>();
	@Autowired
	private Tickets tickets;
	private static AtomicInteger ticketNumber = new AtomicInteger(0);
	
	private static final Logger logg = LogManager.getLogger(BmtcDAO.class);
	
	public BmtcDAO() {
		Bus bus1 = new Bus("500D", "Tapan limited", "Silk board", "Hebbala", 10, 10);
		Bus bus2 = new Bus("500CA", "Kunal limited", "Silk board", "ITPL", 10, 10);
		busList.add(bus1);
		busList.add(bus2);
	}
	
	public int bookTicket(Traveller traveller, String busNo, int numOfSeats) throws Exception {
		
		logg.info("Inside dao: " + traveller);
		Bus bus = getBus(busNo);
		logg.warn("Bus returned : " + bus);
		if(null==bus) {
			throw new Exception("Invalid Bus number");
		}
		synchronized (bus) {
			if(null != bus && bus.getNoOfSeat() - numOfSeats > 0) {
				bus.setRemainingSeats(bus.getRemainingSeats() - numOfSeats);
				tickets.setTicketNumber(ticketNumber.get());
				tickets.setBus(bus);
				tickets.setTraveller(traveller);
				tickets.setSeatsBooked(numOfSeats);
				ticket.add(tickets);
				logg.info("Tickets booked"+tickets.toString());
				ticketNumber.getAndAdd(1);
			}
		}
		logg.info("Bus: " + bus);
		return tickets.getTicketNumber();
	}
	
	private Bus getBus(String busNo) {
		for(Bus bus : busList) {
			if(bus.getBusNo().equals(busNo)) {
				return bus;
			}
		}
		return null;
	}
}
