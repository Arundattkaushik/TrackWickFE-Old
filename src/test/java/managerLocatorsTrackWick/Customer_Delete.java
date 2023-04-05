package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Customer_Delete {
	WebDriver driver;
	public Customer_Delete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*-------------------------------- Customer Delete -----------------------------------*/
	
	//Clicking on customers tab - Import this from customer create class.
	
	//Clicking customer from the list - Import this from customer update class.
	
	//Clicking on delete icon
	@FindBy(xpath = "//span/img")
	WebElement clickCustDelIcon;
	
	
	
	
}
