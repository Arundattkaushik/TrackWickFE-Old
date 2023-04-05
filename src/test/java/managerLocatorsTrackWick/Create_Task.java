package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Create_Task {

	//Declaring driver at this line only
	WebDriver driver;
	
	
	public Create_Task(WebDriver driver) {
		
		// Initializing driver
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
       /*--------------------------------------- Create Task --------------------------------*/	
	//Clicking on team task tab
	@FindBy (xpath = "(//a[@title=\"Team Task\"])[1]")
	public
	WebElement teamTaskTab;
	
	
	//Clicking on create task button
	@FindBy (xpath = "(//button[text()='Create Task'])")
	public
	WebElement creatTaskbutton;
	
	//Clicking on task type field
	@FindBy (xpath ="(//div[text()='Select Task Type'])")
	public
	WebElement taskTypeField;
	
	//Selecting form Lead/customer
	@FindBy (xpath ="(//li[text()='L30'])")
	public
	WebElement selectTaskForm;
	
	@FindBy (xpath = "(//div/div[text()='Select Lead'])")
	public
	WebElement leadField;
	
	@FindBy (xpath = "//li[@title='Automation Lead']")
	public
	WebElement selectLead;
	
	
	//Entering title of the lead task
	@FindBy (xpath = "//input[@name=\"title\"]")
	public
	WebElement title;
	
	//Clicking on employee field
	@FindBy (xpath = "(//div[text()='Select Employee'])")
	public
	WebElement empField;
	
	//Selecting employee/task assignee
	@FindBy (xpath = "(//li[text()='Karan Singh'])")
	public
	WebElement selectEmp;
	
	
	//Clicking on submit button
	@FindBy (xpath = "//button[@type='submit']")
	public
	WebElement submitButton;
	
	//Getting title of created task
	@FindBy (xpath = "//tbody/tr[1]/td[2]/div/div/a/span")
	public
	WebElement createdTaskTitle;

//--------------------------------------------------------------------------------
		
}
