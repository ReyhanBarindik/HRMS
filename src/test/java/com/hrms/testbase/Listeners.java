package com.hrms.testbase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.hrms.utils.CommonMethods;

public class Listeners implements ITestListener {

	
	@Override
	public void onTestStart(ITestResult result) {
	    System.out.println("Test started."+result.getName());
	    BaseClass.test=BaseClass.report.createTest(result.getName());
	  }

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed."+result.getName());
		BaseClass.test.pass("Test case pass "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("Passed\\"+result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	
	@Override
	 public void onTestFailure(ITestResult result) {
		System.out.println("Test failed."+result.getName());  
		BaseClass.test.fail("Test case pass "+result.getName());
		try {
			BaseClass.test.addScreenCaptureFromPath(CommonMethods.takeScreenshot("Failed\\"+result.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	
	
	
	
	
	
	
}
