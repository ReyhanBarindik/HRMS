package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DefinePredefinedReportPage extends CommonMethods{

	@FindBy (id = "report_report_name")
	public WebElement reportName;
	
	@FindBy (id = "report_criteria_list")
	public WebElement selectionCriteria;
	
	@FindBy (id = "report_include_comparision")
	public WebElement selectedCriteriaInclude;
	
	@FindBy (id = "report_display_groups")
	public WebElement displayFieldGroups;
	
	@FindBy (id = "report_display_field_list")
	public WebElement displayFields;
	
	@FindBy (id = "btnAddDisplayField")
	public WebElement AddDiplayFieldBtn;
	
	@FindBy (id = "display_group_1")
	public WebElement checkbox;
	
	@FindBy (id = "btnSave")
	public WebElement saveBtn;
	
	
	public DefinePredefinedReportPage () {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void saveReport (String rName, String selection,String selected, String displayFGroups, String display ) {
		sendText (reportName, rName);
		selectDdValue (selectionCriteria, selection);
		selectDdValue (selectedCriteriaInclude, selected);
		selectDdValue (displayFieldGroups,displayFGroups);
		selectDdValue (displayFields, display);
		waitAndClick (AddDiplayFieldBtn);
    	waitAndClick(saveBtn);
	}
	
	
	
	
}
