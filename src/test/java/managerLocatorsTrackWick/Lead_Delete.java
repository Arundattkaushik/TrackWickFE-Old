package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_Delete {
	WebDriver driver;
	
	public Lead_Delete(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	//click on lead link
	@FindBy (xpath = "//a[text()= 'Lead'][1]")
	WebElement clickLeadLink;
			
			
	//Clicking on lead from the list
	@FindBy(xpath = "(//a)[29]")
	WebElement clickCreateLead;
	
	
	//Clicking on delete button
	@FindBy(xpath = "(//img)[2]")
	WebElement clickLeadDelButton;
	
	//Clicking on yes button
	@FindBy(xpath = "//div[@role='tooltip']//button[2]")
	WebElement clickConfirmDelLeadButton;

}
