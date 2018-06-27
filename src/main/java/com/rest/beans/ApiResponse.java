package com.rest.beans;

import java.util.Map;

public class ApiResponse {
	
	private String status;
	private Map<String, String> result;
	
	public ApiResponse(String status, Map<String, String> result) {
		super();
		this.status = status;
		this.result = result;
	}	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Map<String, String> getResult() {
		return result;
	}

	public void setResult(Map<String, String> result) {
		this.result = result;
	}
}
