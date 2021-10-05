package com.cts.sonarhandson;

import static org.junit.Assert.*;

import org.junit.Test;

public class BasicCalculatorTest {

	@Test
	public void addTest() 
	{
		BasicCalculator calc=new BasicCalculator();
		assertEquals(10, calc.add(3, 7));
	}
	
	@Test
	public void subTest() 
	{
		BasicCalculator calc=new BasicCalculator();
		assertEquals(0, calc.sub(9, 9));
	}
	

}
