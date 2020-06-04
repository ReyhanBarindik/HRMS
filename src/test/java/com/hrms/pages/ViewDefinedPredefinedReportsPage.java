package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ViewDefinedPredefinedReportsPage extends CommonMethods{

	@FindBy (id = "btnAdd")
	public WebElement addReportBtn;
	
	@FindBy (id = "search_search")
	public WebElement searchAddedReport;
	
	@FindBy (name = "_search")
	public WebElement searchBtn;
	
	
	@FindBy (xpath = "//td[contains(text(),'No Records Found')]")
	public WebElement notFound;
	
	
	public ViewDefinedPredefinedReportsPage () {
		
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void searchAddedReport (String reportName) {
		sendText(searchAddedReport, reportName);
		waitAndClick(searchBtn);
	}
	
	
	
	
	
	
}
