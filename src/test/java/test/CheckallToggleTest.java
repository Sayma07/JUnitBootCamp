package test;



import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import page.ListOfCheckBoxPage;
import util.BrowserFactory;

public class CheckallToggleTest {

WebDriver driver;
ListOfCheckBoxPage listOfCheckBox;


// Q1.Validate when the toggle all check box is CHECKED, all check boxes for list items are also CHECKED ON.



@Test
public void checkBoxValidationTest() throws Exception {
	driver=BrowserFactory.init();
	 
	listOfCheckBox=PageFactory.initElements(driver, ListOfCheckBoxPage.class);
	//listOfCheckBox.clickingToggleBox();

	//listOfCheckBox.toggleBoxIsselected();
	listOfCheckBox.toggoleAllAndRemove();//first remove everything 
	listOfCheckBox.addNewData();          //then generate 2 new checkBox
	listOfCheckBox.clickingToggleBox();     //select those 2 checkbox
	
	listOfCheckBox.validateToggleall();    //validating checkbox by using isselected method
	
}
/*@Test
public void singleItemRemoveValidation() throws Exception {
	
	driver=BrowserFactory.init();
	 
	listOfCheckBox=PageFactory.initElements(driver, ListOfCheckBoxPage.class);
	listOfCheckBox.clickingToggleBox();
	listOfCheckBox.singleCheckBoxSelectAndRemove();
	//listOfCheckBox.validatingSingleDataRemove();
	
	
}*/


/*@Test
public void AllCheckBoxRemoveValidation() throws Exception {
	
	driver=BrowserFactory.init();
	 
	listOfCheckBox=PageFactory.initElements(driver, ListOfCheckBoxPage.class);
	listOfCheckBox.allcheckBoxRemoveAndAddData();
	listOfCheckBox.clickingToggleBox();
	listOfCheckBox.removeToggole();


}*/






}
