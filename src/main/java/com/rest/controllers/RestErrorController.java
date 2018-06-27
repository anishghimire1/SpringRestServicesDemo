package com.rest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.rest.beans.ApiResponse;
import com.rest.constants.RestAPIConstants;

/**
 * @author Anish
 * This Exception Controller class is created just for test to capture all exceptions in a single place
 * Ideally, we should have more specific Exception handling mechanism
 */
@RestControllerAdvice
public class RestErrorController {
	
	@ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse unknownException(Exception exception, WebRequest request) {
		Map<String, String> errorMap = new HashMap<>();
		errorMap.put("errormessage", exception.getMessage());
		return new ApiResponse(RestAPIConstants.STATUS_ERROR, errorMap);
    }
}
