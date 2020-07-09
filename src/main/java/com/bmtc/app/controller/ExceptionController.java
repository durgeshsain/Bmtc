package com.bmtc.app.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.bmtc.app.vo.ErrorResponse;

@ControllerAdvice
public class ExceptionController {
	
	private static Logger logg = LogManager.getLogger(ExceptionController.class);
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED)
	public ResponseEntity<ErrorResponse> handleException(Exception e) {
		logg.info("Inside Exceptionnn: " + e.getMessage());
		
		ErrorResponse resp = new ErrorResponse();
		resp.setCode(HttpStatus.BAD_GATEWAY.value());
		resp.setReason(e.getMessage());
		return new ResponseEntity<ErrorResponse>(resp, HttpStatus.EXPECTATION_FAILED);
	}
}
