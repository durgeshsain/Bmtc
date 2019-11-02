package com.bmtc.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bmtc.app.dao.BmtcAdminDAO;
import com.bmtc.app.service.BmtcAdminService;
import com.bmtc.app.vo.BmtcBusRequest;
import com.bmtc.app.vo.BmtcBusResponse;

@Component
public class BmtcBusServiceImpl implements BmtcAdminService {
	
	@Autowired
	BmtcBusResponse bmtcBusResponse;
	@Autowired
	BmtcAdminDAO bmtcAdminDAO;
	
	@Override
	public BmtcBusResponse addBmtcBus(BmtcBusRequest bmtcBusRequest) {
		// Add Bus in Bmtc Bus Bay
		return bmtcBusResponse = bmtcAdminDAO.addBmtcBus(bmtcBusRequest);
	}

}
