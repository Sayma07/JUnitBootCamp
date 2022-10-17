package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class CheckSingleRemoveButtonTest {
	
	//Q3.Validate that a single list item could be removed using the remove button when a single checkbox is selected.
	
	WebDriver driver;
	ListOfCheckBoxPage listOfCheckBox;





	@Test
	public void singleItemRemoveValidation() throws Exception {
		
		driver=BrowserFactory.init();
		 
		listOfCheckBox=PageFactory.initElements(driver, ListOfCheckBoxPage.class);
		listOfCheckBox.toggoleAllAndRemove();    //first removing everything
		listOfCheckBox.addNewData();             //then adding 2 data
		listOfCheckBox.singleCheckBoxSelectAndRemove();   // then select  specific checkbox between them 
		listOfCheckBox.validatingSingleDataRemove();    //validating
		
		
	}
}







