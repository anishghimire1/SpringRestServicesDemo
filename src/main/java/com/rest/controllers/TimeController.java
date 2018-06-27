package com.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.beans.ApiResponse;
import com.rest.beans.CurrentTime;
import com.rest.constants.RestAPIConstants;
import com.rest.service.TimeService;

@RestController
public class TimeController {
	
	@Autowired
	private TimeService service;
	
	@GetMapping("/time/now")
	public ApiResponse getCurrentTime() {
		return new ApiResponse(RestAPIConstants.STATUS_SUCCESS, getTimeMap(service.getCurrentTime()) );
	}
	
	private Map<String, String> getTimeMap(CurrentTime currentTime){
		Map<String, String> timeMap = new HashMap<>();
		timeMap.put("timezone", currentTime.getTimeZone()+"");
		timeMap.put("currentTime", currentTime.getCurrentTime()+"");
		return timeMap;
	}
}
