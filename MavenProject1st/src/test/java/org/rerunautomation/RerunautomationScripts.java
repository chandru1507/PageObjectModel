package org.rerunautomation;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunautomationScripts implements IRetryAnalyzer{
	
	
	private int retrycount=0;
	private static final int maxcount=5;
	

	public boolean retry(ITestResult arg0) {
		
		if(retrycount<maxcount) {
			retrycount++;
			return true;
		}
		return false;
	}
	

}
