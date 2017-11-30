package com.spring.ex2;

public class MyCalculator {
	
	public Calculator calculator;
	private int firstNumber;
	private int secondNumber;
	
	
	public int getFirstNumber() {
		return firstNumber;
	}
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	public int getSecondNumber() {
		return secondNumber;
	}
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	public void add() {
		System.out.println("add()");
		calculator.addition(firstNumber, secondNumber);
	}
	
	public void sub() {
		System.out.println("sub()");
		calculator.subtraction(firstNumber, secondNumber);
	}
	
	public void multi() {
		System.out.println("multi()");
		calculator.multiplication(firstNumber, secondNumber);
	}
	
	public void div() {
		System.out.println("div()");
		calculator.division(firstNumber, secondNumber);
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
}
