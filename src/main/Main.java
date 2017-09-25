package main;

import calculations.Calculator;

public class Main {

	public static void main(String[] args) {
		
		String calc = "(2 + 2)(4 + 3)";
		
		System.out.println(Calculator.getAnswer(calc));
	}

}
