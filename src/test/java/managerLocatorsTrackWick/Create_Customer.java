package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Customer {
	
	//Declaring driver at this line only
	WebDriver driver;
	
	
	public Create_Customer(WebDriver driver) {
		
		// Initializing driver
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
       /*---------------------------------- Create Customer ---------------------------------*/
	
	
		
	//Clicking on customers tab from the top menu
	@FindBy (xpath ="(//a[text()='Customers'])")
	public static WebElement customerTab;
		
		
		
	//Clicking on + icon
	@FindBy (xpath = "(//i[@class=\"anticon add-icons_S2Eit\"])/../..")
	public WebElement clickCreateIcon;
		
		
	//Dialog box opens to create a customer.
		
	//Company Name
	@FindBy (xpath = "//input[@name=\"name\"]")
	public WebElement customerName;

		
	//Phone
	@FindBy (xpath = "//input[@name=\"mobile\"]")
	public WebElement customerPhone;
		
		
		
	//Email
	@FindBy (xpath = "//input[@name=\"email\"]")
	public WebElement customerEmail;
		
		
	//Owner
	@FindBy (xpath = "(//div/div[text()=\"Select Owner\"])/..")
	public WebElement customerOwner;
		
		/*Scrolling down till cancel button
		JavascriptExecutor js = (JavascriptExecutor) LoginTrackWick.driver;
		js.executeScript("window.scrollBy(0,3000)");
		*/
		
		
	@FindBy (xpath = "//ul/li[1][@role=\"option\"]")
	public WebElement cancelButton;
	
		
	//Clicking create button
	@FindBy (xpath = "(//button[text()=\"Create\"])")
	public WebElement createButton;
}
