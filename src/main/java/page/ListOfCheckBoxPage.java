package page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListOfCheckBoxPage {
	WebDriver driver;
	boolean singleCheck;

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")WebElement allToggleCheckBox;

	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")WebElement removeCheckBox;

	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")WebElement allcheckBox0;

	@FindBy(how = How.XPATH, using = "//input[@name='todo[1]']")WebElement allcheckBox1;

	@FindBy(how = How.XPATH, using = "//input[@name='data']")WebElement addData;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']")WebElement submitButton;

	
	public ListOfCheckBoxPage(WebDriver driver) {
		this.driver = driver;

	}

	public void clickingToggleBox() throws Exception {

		allToggleCheckBox.click();
	}

	public void toggoleAllAndRemove() {

		allToggleCheckBox.click();
		removeCheckBox.click();

	}

	public void addNewData() {
		addData.sendKeys("JUNIT");
		submitButton.click();
		addData.sendKeys("TESTNG");
		submitButton.click();
	}

	public void validateToggleall() {

		if (allcheckBox1.isSelected() && allcheckBox0.isSelected()) {
			System.out.println("Toggle all is working");
		} else {
			System.out.println("toggle all is not working");
		}
	}

	public void singleCheckBoxSelectAndRemove() {
		if (allToggleCheckBox.isSelected()) {

			allToggleCheckBox.click();

		}

		allcheckBox0.click();
		removeCheckBox.click();

	}

	public void validatingSingleDataRemove() {

		try {
			if (allcheckBox0.isDisplayed()) {
				System.out.println("Single Remove is working");
			} else {
				System.out.println("Single Remove is not working");

			}
		} catch (Exception e) {
			System.out.println("single remove is working");
       //e.printStackTrace();
		}

	}

	public void allcheckBoxRemoveAndAddData() {
		
		/*String Before_Xpath="//input[@name='todo[";
		String After_Xpath="]']";*/
		
		
		
		
		if (!allToggleCheckBox.isSelected()) {

			allToggleCheckBox.click();

		}
		removeCheckBox.click();

		addData.sendKeys("JUNIT");
		submitButton.click();
		addData.sendKeys("TESTNG");
		submitButton.click();

	}

	public void removeToggole() {
		removeCheckBox.click();

	}

}
