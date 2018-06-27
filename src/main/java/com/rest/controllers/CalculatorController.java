package com.rest.controllers;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rest.beans.ApiResponse;
import com.rest.beans.Calculator;
import com.rest.constants.RestAPIConstants;

/**
 * @author Anish
 * These REST services take two parameters from the request and provide the sum of numbers
 * Available as GET & POST
 */
@RestController
public class CalculatorController {
	
	@GetMapping("/math/add")
	public ApiResponse getSumOfNumbers(@RequestParam("n1") double number1, 
			@RequestParam("n2") double number2) {		
		return new ApiResponse(RestAPIConstants.STATUS_SUCCESS, 
				getCalculatorMap(new Calculator(number1, number2)));
	}
	
	@PostMapping("/math/add")
	public ApiResponse postSumOfNumbers(@ModelAttribute Calculator calculator) {
		// Some post action to take place here to process calculator
		return new ApiResponse(RestAPIConstants.STATUS_SUCCESS, 
				getCalculatorMap(calculator));
	}
	
	private Map<String, String> getCalculatorMap(Calculator calculator){
		Map<String, String> calcMap = new TreeMap<>();
		calcMap.put("number1", String.valueOf(calculator.getFirstNumber()));
		calcMap.put("number2", String.valueOf(calculator.getSecondNumber()));
		calcMap.put("sum", String.valueOf(calculator.getSum()));
		return calcMap;
	}
	
}
