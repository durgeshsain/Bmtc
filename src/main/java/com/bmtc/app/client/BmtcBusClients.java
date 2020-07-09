package com.bmtc.app.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bmtc.app.vo.Bus;

import io.jsonwebtoken.lang.Collections;

@FeignClient("bmtc-bus")
public interface BmtcBusClients {

	@GetMapping(value = "/bmtc/bus/getBusByName/{busNo}")
	List<Bus> getBus(@PathVariable("busNo") String busNo);
	
	

}
