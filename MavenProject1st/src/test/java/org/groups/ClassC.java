package org.groups;

import org.testng.annotations.Test;

public class ClassC {
	
	
	
	
	
	
	@Test(groups="smoke",dependsOnGroups="sanity")
	private void tc_1() {
		
		System.out.println("ClassC tc_1");

	}
	@Test(groups="sanity",dependsOnGroups="reg")
	private void tc_2() {
		
		System.out.println("ClassC tc_2");

	}

	@Test(groups="reg")
	private void tc_3() {
		
		System.out.println("ClassC tc_3");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
