package com.spring.ex2;

public class Calculator {

	public void addition(int i, int j) {
		System.out.println("addition()");
		System.out.println(i+"+"+j+"="+(i+j));
	}
		
	public void subtraction(int i, int j) {
		System.out.println("subtraction()");
		System.out.println(i+"-"+j+"="+(i-j));
		
	}
	public void multiplication(int i, int j) {
		System.out.println("multiplication()");
		System.out.println(i+"*"+j+"="+(i*j));
		
	}
	public void division(int i, int j) {
		System.out.println("division()");
		System.out.println(i+"/"+j+"="+(i/j));
		
	}
	
}
