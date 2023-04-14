package org.testng;

import org.testng.annotations.Test;

public class ClassB {
	

	@Test(priority=55)
	private void tc_1() {
		System.out.println("ClassB tc_1 @Test priority=55");

	}
	
	@Test(priority=-99 , invocationCount=2 ,enabled=true)
	private void tc_2() {
		System.out.println("ClassB tc_2 @Test priority=-99");

	}
	
	@Test
	private void tc_3() {
		System.out.println("ClassB tc_3 @Test");

	}
	
	@Test(priority=-9999)
	private void tc_4() {
		System.out.println("ClassB tc_4 @Test priority=-9999");

	}
	
	@Test(priority=867)
	private void tc_5() {
		System.out.println("ClassB tc_5 @Test priority=867");

	}
	
	@Test(priority=888888)
	private void tc_6() {
		System.out.println("ClassB tc_6 @Test priority=888888");

	}
	
	
	
	
	
	
	
	
	
	
	

}
