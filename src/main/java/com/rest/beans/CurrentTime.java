package com.rest.beans;

public class CurrentTime {
	
	private String timeZone;
	private String currentTime;
	
	public CurrentTime(String timeZone, String currentTime) {
		super();
		this.timeZone = timeZone;
		this.currentTime = currentTime;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	
	

}
