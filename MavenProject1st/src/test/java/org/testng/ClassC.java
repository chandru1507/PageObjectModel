package org.testng;

import org.dayone.BaseClass;
import org.testng.annotations.Test;

public class ClassC extends BaseClass{
	
    @Test
	private void tc_1() {
    	browserlaunch("https://rahulshettyacademy.com/blog/index.php/automation-testing-interview-questions/");
		System.out.println("ClassC tc_1");

	}
    @Test
	private void tc_2() {
		System.out.println("ClassC tc_2");

	}
    @Test
	private void tc_3() {
		System.out.println("ClassC tc_3");

	}
	
	
}
