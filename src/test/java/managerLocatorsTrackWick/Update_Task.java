package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Update_Task {
	
	WebDriver driver;
	
	public Update_Task(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*------------------------------ Update Task ------------------------------------*/
	
		//Clicking on created task title
		@FindBy (xpath = "//tbody/tr[1]/td[2]/div/div/a/span")
		public
		WebElement updateTask;
		
		//Getting Old Assignee
				@FindBy (xpath = "(//tbody/tr/td[3]//child::span)[1]")
				public
				WebElement oldAssignee;
		
		
		//Wait, 2 Second & click on edit details
		@FindBy (xpath = "//button/span[text()='Edit']/..")
		public
		WebElement editButton;
		
		
		//Clicking on lead field to change lead.
		@FindBy (xpath = "(//div)[181]")
		public
		WebElement clicklead;
		
		//Selecting lead from the list
		@FindBy (xpath = "//ul[@role=\"listbox\"]/li[@role=\"option\"]")
		public
		WebElement selcetLead;
		
		//Updating Title
		@FindBy (xpath = "(//input[@name=\"title\"])[2]")
		public
		WebElement UpdateTitle;
		
		
		//Click Priority Field
		@FindBy (xpath = "//label[text()='Priority']//following-sibling::div//span/div/div/div")
		public
		WebElement PriorityField;
		
		
		//Select a priority
		@FindBy (xpath = "//ul/li[text()='High']")
		public
		WebElement SelectPriority;
		
		
		//Clicking Assignee Field
		@FindBy (xpath = "(//label[text()='Assign to employee']//following-sibling::div//child::div)[6]")
		public
		WebElement AssigneeField;
		
		
		//Select Assignee
		@FindBy(xpath = "//ul/li[text()='Durgesh Singh']")
		public
		WebElement SelectAssignee;
		
		
		//Selecting name field in Additional fields
		@FindBy (xpath = "//input[@name=\"additionalField.name1\"]")
		public
		WebElement NameField;
		
		
		//Selecting value field in Additional Fields
		@FindBy (xpath = "//input[@name=\"additionalField.value1\"]")
		public
		WebElement ValueField;
		
		
		//Clicking on submit button
		@FindBy (xpath = "//button[text()='Update']")
		public
		WebElement UpdateButton;
		
		
		//Now Wait until Team task appears and click once come into view
		@FindBy (xpath = "(//ul/li/a[text()='Team Task'])[1]")
		public
		WebElement TeamTaskTab;
		
		
		//Get updated title
		@FindBy (xpath = "(//tbody/tr/td[2]//span")
		public
		WebElement GetUpdatedTaskTitle;
		
		
		//Get Updated Assignee
		@FindBy (xpath = "//tbody/tr/td[3]//span")
		public
		WebElement UpdatedAssignee;

}
