package com.rest.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rest.beans.CurrentTime;

@Service
public class TimeServiceImpl implements TimeService{

	@Override
	public CurrentTime getCurrentTime() {
		RestTemplate restTemplate = new RestTemplate();
        // CurrentTime currentTime = restTemplate.getForObject("https://waittime.api.aero/waittime/v1/current/YYC", CurrentTime.class);
		// The API was not working without the API key, so creating a mock object
		CurrentTime currentTime = new CurrentTime("MST", LocalDateTime.now().toString());
		return currentTime;
	}
}
