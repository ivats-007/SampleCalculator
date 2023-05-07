package com.infy;

import org.junit.jupiter.api.Test;

class TestCase1 {
	
	private Calculator calculator = new Calculator();

	@Test
	void test1() {
		System.out.println("Sum " + calculator.add(1, 2));
	}
	
	@Test
	void test2() {
		System.out.println("Sub " + calculator.sub(1, 2));
	}
	
	@Test
	void test3() {
		System.out.println("Mul " + calculator.mul(1, 2));
	}
	
	@Test
	void test4() {
		System.out.println("Div " + calculator.div(1, 2));
	}

}
