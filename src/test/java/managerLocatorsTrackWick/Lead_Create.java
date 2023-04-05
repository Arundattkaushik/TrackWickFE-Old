package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commons.Utils;


public class Lead_Create {
	
	WebDriver driver;
	public Lead_Create() {
		this.driver = Utils.driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy (xpath = "//a[text()= 'Lead'][1]")
		public
		WebElement LeadTab;
		
		
		//click on + icon
		@FindBy (xpath = "//*[@id=\"root\"]/section/div/div[1]/div[2]/div/div/div[3]/div")
		public
		WebElement NewLeadCreateButton;
		
		
		//Filling details in lead model
		
		//Enter Lead Name
		@FindBy (xpath = "//input[@placeholder='Please enter lead name']")
		public
		WebElement EnterLeadName;
		
		
		//Clicking lead source Field
		@FindBy (xpath = "//div[text()='Select Lead Source']")
		public
		WebElement LeadSourceField;
		
		//Selecting a lead source
		@FindBy (xpath = "//li[@title='Office']")
		public
		WebElement SelectLeadSource;
		        
		
		//Clicking Lead Type Field
		@FindBy (xpath = "//div[text()='Select Lead Type']")
		public
		WebElement LeadTypeField;
		
		//Selecting Lead Type
		@FindBy (xpath = "//li[@title='COLD']")
		public
		WebElement LeadType;
		
		
		// Entering Email in lead model
		@FindBy (xpath = "//input[@placeholder=\"Please enter email\"]")
		public
		WebElement LeadEmail;
	
		
		//Entering Mobile in lead model
		@FindBy (id = "mobile-number-01")
		public
		WebElement LeadMobile;
		
		
		//Clicking Lead workflow field
		@FindBy (xpath = "(//div[@role='combobox'])[8]")
		public
		WebElement LeadWorkflowField;
		

		@FindBy (css = "li[title='Lead ']")
		public
		WebElement SelectLeadWorkflow;
		
		
		
		//Clicking owner Field
		@FindBy (xpath = "(//div[@role='combobox'])[9]")
		public
		WebElement OwnerField;

		
		//Selecting owner from list
		@FindBy (css = "li[title='Nishant Dev']")
		public
		WebElement SelectLeadOwner;
		
		
		//Clicking Create button
		@FindBy (xpath = "//button[@type=\"submit\"]")
		public
		WebElement LeadCreateButton;
	
}
