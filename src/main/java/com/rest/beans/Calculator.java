package com.rest.beans;

public class Calculator {
	
	private double firstNumber;
	private double secondNumber;
	private double sum;
	
	public Calculator(double number1, double number2) {
		super();
		this.firstNumber=number1;
		this.secondNumber=number2;
		this.sum=number1+number2;
	}
	
	public double getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	public double getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}	
}
