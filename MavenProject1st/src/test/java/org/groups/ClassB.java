package org.groups;

import org.testng.annotations.Test;

public class ClassB {
	
	@Test(groups= {"sanity","smoke"})
	private void tc_1() {
		
		System.out.println("ClassB tc_1");

	}
	@Test(groups="smoke")
	private void tc_2() {
		
		System.out.println("ClassB tc_2");

	}
	@Test(groups="sanity")
	private void tc_3() {
		
		System.out.println("ClassB tc_3");

	}

}
