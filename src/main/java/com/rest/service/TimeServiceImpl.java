package com.rest.service;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.beans.CurrentTime;

@Service
public class TimeServiceImpl implements TimeService{
	
	private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
	private static final String TIMEZONE = "MDT";

	@Override
	public CurrentTime getCurrentTime() {
		RestTemplate restTemplate = new RestTemplate();
        // CurrentTime currentTime = restTemplate.getForObject("https://waittime.api.aero/waittime/v1/current/YYC", CurrentTime.class);
		// The API was not working without the API key, so creating a mock object
		ZoneId zoneId = ZoneId.of("Canada/Mountain");
	    LocalTime localTime=LocalTime.now(zoneId);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMAT);
	    String formattedTime=localTime.format(formatter);	
		
		CurrentTime currentTime = new CurrentTime(TIMEZONE, formattedTime);
		return currentTime;
	}
}
