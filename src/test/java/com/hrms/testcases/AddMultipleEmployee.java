package com.hrms.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class AddMultipleEmployee extends CommonMethods {

	@Test (dataProvider = "getData", groups = "regression")
	public void addMultipleEmployee(String empFirstN, String empMiddleN, String empLastN, String empUserName, String ePassword, String rePassword) {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToAddEmp();
        addEmp.addEmployeeInHMR(empFirstN, empMiddleN, empLastN);
        addEmp.createLoginDetails(empUserName, ePassword, rePassword);
        
        
        String actFirstName = addEmp.empFirstName.getAttribute("value");
        Assert.assertEquals(actFirstName, empFirstN, "Name Mismatched");
        takeScreenshot("Screenshots","Hrm2",empFirstN,empLastN);
	}
	
	@DataProvider
	public Object [][] getData (){
		return ExcelUtility.excelIntoArray(Constants.TEST_DATA_FILEPATH, "Sheet1");
	}
	
	
	
	
	
	
	
}
