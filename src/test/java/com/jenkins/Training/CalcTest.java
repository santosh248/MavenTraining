package com.jenkins.Training;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void addTest() {
		MyCalculator myCalc=new MyCalculator();
		assertEquals(15, myCalc.addNumbers(10,5));
	}
	@Test
	public void subtractTest() {
		MyCalculator myCalc=new MyCalculator();
		assertEquals(10, myCalc.subtractNumbers(15,5));
	}
	@Test
	public void multiplyTest() {
		MyCalculator myCalc=new MyCalculator();
		assertEquals(30, myCalc.multiplyNumbers(15,2));
	}

}
