package com.bmtc.app.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bmtc.app.vo.Bus;

@Service
public class BmtcBusClient {
	
	@Autowired
	private RestTemplate getRestTemplate;

	public Bus getBus(String busNo) {
		// TODO Auto-generated method stub
		String uri = "http://192.168.0.113:bmtc-bus:8090/bmtc/bus/getBusByName";
		//getRestTemplate.getForObject(uri+busNo, Bus.class);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		Map<String, String> requestMap = new HashMap<String, String>();
		requestMap.put("busName", busNo);
		System.out.println("uri is "+uri);
		HttpEntity<Map<String, String>> entity = new HttpEntity<>(requestMap, headers);
		ResponseEntity<Bus> bus = getRestTemplate.exchange(uri, HttpMethod.GET, entity, Bus.class);
		System.out.println(bus.getBody().getBusId());
		return new Bus();
	}
	
	

}
