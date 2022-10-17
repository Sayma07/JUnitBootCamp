package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class AllCheckboxRemove {


	WebDriver driver;
	ListOfCheckBoxPage listOfCheckBox;


	
	// Q2.Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	@Test
	public void AllCheckBoxRemoveValidation() throws Exception {
		
		driver=BrowserFactory.init();
		 
		listOfCheckBox=PageFactory.initElements(driver, ListOfCheckBoxPage.class);
		listOfCheckBox.allcheckBoxRemoveAndAddData();   //first remove all data then add data
		Thread.sleep(2000);
		listOfCheckBox.clickingToggleBox();          //then select all
		Thread.sleep(2000);
		listOfCheckBox.removeToggole();              //then remove again


	}
}