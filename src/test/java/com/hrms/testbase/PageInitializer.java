package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashBoardPageElements;
import com.hrms.pages.DefinePredefinedReportPage;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.ViewDefinedPredefinedReportsPage;
import com.hrms.pages.PersonalDetailsPageElements;

// initializes all pages class and stores references in static variables 
// that will call called/used in test classes

public class PageInitializer extends BaseClass{

	// easily accesible --> make global 
	public static LoginPageElements login;
	public static DashBoardPageElements dashboard;
	public static AddEmployeePageElements addEmp;
	public static PersonalDetailsPageElements pdetails;
	public static ViewDefinedPredefinedReportsPage addReports;
	public static DefinePredefinedReportPage report;
	
	
	public static void initialize () {
		
	    login = new LoginPageElements();
	    dashboard = new DashBoardPageElements();
	    addEmp = new AddEmployeePageElements();
	    pdetails = new PersonalDetailsPageElements();
	    addReports = new ViewDefinedPredefinedReportsPage();
	    report = new DefinePredefinedReportPage();
	    
	}
	
	
	
	
}
