package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Update_Customer{
	//Declaring driver at this line only
		WebDriver driver;
		
		
		public Update_Customer(WebDriver driver) {
			// Initializing driver
			this.driver = driver;
			PageFactory.initElements(driver, this);
			
		}
		
		
		/*------------------------------------ Customer Update ------------------------------*/
		
		//Click on customer locator to be imported from Create customer locator class
		
		//Clicking customer from the list
		@FindBy (xpath = "(//a[1][@class=\"semibold\"])")
		WebElement clickCustFromList;
		
		
		//Clicking edit button in customer details
		@FindBy(xpath = "//button/span[text()='Edit']/../..")
		WebElement editCustButton;
		
		
		//updating mobile use (Keys.CONTROL+"a")
		@FindBy (xpath = "//input[@name=\"mobile\"]")
		WebElement updateCustMobile;
		
		
		//email use (Keys.CONTROL+"a")
		@FindBy(xpath = "//input[@name=\"email\"]")
		WebElement updateCustEmail;
		
		
		//Click owner field
		@FindBy (xpath = "//div/div[text()='Select Owner']/../..")
		WebElement clickCustOwnrField;
		
		
		//Selecting owner from the list
		@FindBy (xpath = "//ul[@role=\"listbox\"]/li[2][@role=\"option\"]/../..")
		WebElement clickCustOwnerFromList;
		
		
		//Filling text tag (use send keys)
		@FindBy (xpath = "//input[@id=\"63cfde254d40c64ccad48181\"]")
		WebElement custTextTag;
		
		
		//Handling List Tag
		@FindBy (xpath = "//div/div[text()='Please select list']")
		WebElement clickCustListTag;
		
		
		//Selecting value from list tag
		@FindBy (xpath = "//div/ul/li[text()=\"1\"]")
		WebElement selOptFromCustList;
		
		
		
		//Clicking on Update button
		@FindBy(xpath = "//button[text()='Update']")
		WebElement clickCustUpdateButton;
		
		
		//Clicking on cancel button to close the update dialog box
		@FindBy(xpath = "//button[text()='Cancel']")
		WebElement clickCustCancelButton;
				
}
