package managerLocatorsTrackWick;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lead_Update {
	WebDriver driver;
	public Lead_Update(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*--------------------------------------- Lead Update ----------------------------------------*/

	//click on lead link
	@FindBy(xpath ="//a[text()= 'Lead'][1]")
	WebElement clickLeadLLink;
			
			
	//Clicking on lead from the list
	@FindBy(xpath = "(//a)[29]")
	WebElement clickLead;
	
	
	//Clicking on edit button in lead details to open edit dialog box.
	@FindBy(xpath = "(//button[@type='button'])[4]")
	WebElement clickEditBtton;
	
	
	//Clicking Lead Type field
	@FindBy(xpath = "(//div)[236]")
	WebElement clickLeadTypeField;
	
	//Selecting a lead type from the list
	@FindBy(css = "li[title='WARM']")
	WebElement clickLeadType;
	

	//Selecting mobile number field, clearaing & updating new number
	@FindBy(css = "#mobile-number-02")
	WebElement leadMobileField;
	
	
	//Clicking owner
	@FindBy(xpath = "(//div)[246]")
	WebElement clickLeadOwnerField;
	
	//Selecting an owner from the list
	@FindBy(css = "li[title='Durgesh Singh']")
	WebElement selectLeadOwner;


			
	//Clicking on update button in model
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement clickLeadUpdateButton;

}
