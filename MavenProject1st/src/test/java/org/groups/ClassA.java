package org.groups;

import org.testng.annotations.Test;

public class ClassA {
	
	
	@Test(groups= {"sanity","smoke"})
	private void tc_1() {
		
		System.out.println("ClassA tc_1");

	}
	@Test(groups="smoke")
	private void tc_2() {
		
		System.out.println("ClassA tc_2");

	}
	@Test(groups="sanity")
	private void tc_3() {
		
		System.out.println("ClassA tc_3");

	}
	@Test(groups="smoke")
	private void tc_4() {
		
		System.out.println("ClassA tc_4");

	}
	@Test(groups="reg")
	private void tc_5() {
		
		System.out.println("ClassA tc_5");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
