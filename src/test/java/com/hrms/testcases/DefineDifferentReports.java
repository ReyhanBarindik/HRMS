package com.hrms.testcases;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class DefineDifferentReports extends CommonMethods {

	@Test (dataProvider = "getData")
	public void addDifferentReports(String reportname, String selectioncriteria, String selectedcriteriainclude,
			String displayfieldgroups, String displayfields) {
		test.info("Entering Valid Admin credentials");
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		test.info("navigating to reports");
		dashboard.navigateToReports();
		waitAndClick(addReports.addReportBtn);
		test.info("Define different reports");
		report.saveReport(reportname, selectioncriteria, selectedcriteriainclude, displayfieldgroups, displayfields);
        
		scrollDown(250);
		
	}

	@DataProvider
	public Object [][] getData (){
		return ExcelUtility.excelIntoArray(Constants.TEST_DATA_FILEPATH, "AddReport");
	}
	
	
	
	
	
	
}
