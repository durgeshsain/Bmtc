package com.bmtc.app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bmtc.app.repository.BmtcBusRepository;
import com.bmtc.app.vo.BmtcBusRequest;
import com.bmtc.app.vo.BmtcBusResponse;
import com.bmtc.app.vo.Bus;

@Repository
public class BmtcAdminDAO {

	@Autowired
	private BmtcBusRepository bmtcBusRepository;
	@Autowired
	private BmtcBusResponse bmtcBusResponse; 
	
	public BmtcBusResponse addBmtcBus(BmtcBusRequest bmtcBusRequest) {
		// DAO class for saving Bus
		Bus bus = new Bus();
		try {
		bus.setBusNo(bmtcBusRequest.getBus().getBusNo());
		bus.setBusName(bmtcBusRequest.getBus().getBusName());
		bus.setSource(bmtcBusRequest.getBus().getSource());
		bus.setDestinition(bmtcBusRequest.getBus().getDestinition());
		bus.setNoOfSeat(bmtcBusRequest.getBus().getNoOfSeat());
		
		System.out.println(bus);
		bus = bmtcBusRepository.save(bus);
		} catch(Exception e) {
			e.printStackTrace();
		}
		bmtcBusResponse.setBusName(bus.getBusName());
		bmtcBusResponse.setBusNo(bus.getBusNo());
		return bmtcBusResponse;
	}

}
