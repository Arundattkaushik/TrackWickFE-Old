package commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attendance {
	
	WebDriver driver;
	public Attendance(){
		this.driver = Utils.driver;
		PageFactory.initElements(driver, this);
	}
	
			// Capturing 3 dots to expand menu 
			@FindBy(xpath = "//ul[@class=\"ant-menu ant-menu-light ant-menu-root ant-menu-horizontal\"]/li[25]/div")
			public WebElement threeDots;
			
			
			/*
			Actions crsr = new Actions(LoginTrackWick.driver);
			
			Thread.sleep(2000);
			// Hovering mouse on 3 dots
			crsr.moveToElement(threeDots).perform();
			*/

			
			// Clicking on Reports Link
			@FindBy(xpath = "(//a[@title='Reports'])[2]")
			public WebElement reportLink;
			/*
			crsr.moveToElement(rprt).click().perform();
			*/
			
			//Clicking on Filter Icon 
			@FindBy(xpath = "//button[@class=\"ant-btn button-margin_2l4GQ\"]/i/..")
			public WebElement reportFilter;
			
			
			//Clicking on Date/Data Type field 
			@FindBy(xpath = "//div/div[text()='Yesterday']|//div/div[text()='Today']|//div/div[text()='Last 7 Days']")
			public WebElement reprtDateType;
			
			
			//Selecting an option from the list
			@FindBy(xpath = "//li[text()='Last 14 Days']")
			public WebElement selReprtDate;
			//crsr.moveToElement(selection).click().perform();
			
			
			//Clicking on Employee fields
			@FindBy(xpath = "(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")
			public WebElement clickReprtEmptFiled;
			
			
			/*---------------------------------- Selecting employee from the dropdown ------------------------------*/
			@FindBy (xpath = "//div[text()='Date of Joining']")
			public WebElement dOJEmpFiled;
			
			
			@FindBy (xpath = "//div[text()='Date of Birth']")
			public WebElement dOBEmpFiled;
			

			@FindBy (xpath = "//div[text()='Type']")
			public WebElement typeEmpField;
			
			@FindBy (xpath = "//div[text()='Team']")
			public WebElement teamEmpField;
			
			
			@FindBy (xpath = "//div[text()='Identifier']")
			public WebElement identifierEmpField;
			
			
			@FindBy (xpath = "//div[text()='Leave Profile']")
			public WebElement leaveProfileEmpField;
			
			
			@FindBy (xpath = "//div[text()='Email']")
			public WebElement emailEmpField;
			
			
			@FindBy (xpath = "//div[text()='Mobile']")
			public WebElement moblileEmpField;
			
			
			@FindBy (xpath = "//div[text()='Designation']")
			public WebElement destinationEmpField;
			
			
			@FindBy (xpath = "//div[text()='Work Location']")
			public WebElement workLocationEmpField;
			
			
			@FindBy (xpath = "//div[text()='Experience']")
			public WebElement experienceEmpField;
			
			
			@FindBy (xpath = "//div[text()='Reporting Manager 1']")
			public WebElement repManOneEmpField;
			
			
			@FindBy (xpath = "//div[text()='Reporting Manager 2']")
			public WebElement RepManTwoEmpField;
			
			
			//Clicking on Employee Filed again to close dropdown
			@FindBy (xpath = "(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")
			public WebElement closeEmpField;
			
			
			/*----------------------------------- Clicking On Report Filter Field -------------------------------------*/
			
			//Click Report Filter Field
			@FindBy (xpath = "(//span/div/div/div[@role='combobox'])[3]")
			public WebElement filterFiledOne;
			
			
			//Selecting Employee option from filter field
			@FindBy (xpath = "//li[@title='Employee']")
			public WebElement empReportFiled;
			
			
			//Clicking on condition field.
			@FindBy (xpath = "//div[@class='form-table_1rFp4']//\"\r\n"
					+ "						+ \"div[@class='ant-row']//div[@class='field_1rg0k']//div[@class='field_1rg0k']//\"\r\n"
					+ "						+ \"div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']\"\r\n"
					+ "						+ \"//div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']\"\r\n"
					+ "						+ \"//div[@class='ant-col ant-form-item-control-wrapper']//\"\r\n"
					+ "						+ \"div[@class='ant-form-item-control']//span[@class='ant-form-item-children']//\"\r\n"
					+ "						+ \"div//div[@class='ant-select-selection__placeholder']\"\r\n"
					+ "						+ \"[normalize-space()='Please select']")
			
			
			public WebElement condFiledOne;
			
			
			
			//Selecting a condition
			@FindBy (xpath = "//li[@title='IN']")
			public WebElement selCondReportField;
			
			
			//Clicking on value field
			@FindBy (xpath = "(//div[@role='combobox'])[5]")
			public WebElement valFieldOne;
			
			
			//Selecting values
			@FindBy (xpath = "//li[text()='Karan Singh']")
			public WebElement valOne1;
			
			
			@FindBy (xpath = "//li[text()='Durgesh Singh']")
			public WebElement valOne2;
			
			
			@FindBy (xpath = "//li[text()='Geeta Fogart']")
			public WebElement valOne3;
			
			
			//Clicking On Add More Button to add more filters //button[text()='Add More']
			@FindBy (xpath = "//button[text()='Add More']")
			public WebElement addMoreButtonReport;
			
			
			//Clicking on filer filed to show option list.
			@FindBy (xpath = "(//div[@class=\\\"ant-select-selection__rendered\\\"])[6]")
			public WebElement filterFieldTwo;
			
			
			//Selecting Team option from filter field
			@FindBy (xpath = "//li[@title='Team']")
			public WebElement selOptTeam;
			
			
			//Clicking on condition field
			@FindBy (xpath = "//body/div[@class='portal_3km03']/\"\r\n"
					+ "						+ \"div[@class='ReactModal__Overlay ReactModal__Overlay--after-open overlay_RRpTk']/\"\r\n"
					+ "						+ \"div[@role='dialog']/div[@class='body_2-4a5']/div/\"\r\n"
					+ "						+ \"div[@class='inner-container-without-shadow_3_jq8 detail_2G1an']/\"\r\n"
					+ "						+ \"div[@class='detail-form_3iRDZ']/form/div[@class='form-container_2XvJX']/\"\r\n"
					+ "						+ \"div[@class='ant-row']/div[@class='ant-col ant-col-24']/div[@class='ant-row']/\"\r\n"
					+ "						+ \"div[@class='ant-col ant-col-24']/div[@class='ant-row']/div[@class='field_1rg0k']/\"\r\n"
					+ "						+ \"div[@class='field_1rg0k']/div[@class='ant-col ant-col-24']/\"\r\n"
					+ "						+ \"div[@class='ant-col gutter-row ant-col-sm-24 ant-col-md-24 ant-col-lg-24 ant-col-xl-24']/\"\r\n"
					+ "						+ \"div[@class='form-table_1rFp4']/div[@class='ant-row']/div[@class='field_1rg0k']/\"\r\n"
					+ "						+ \"div[@class='field_1rg0k']/div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']/\"\r\n"
					+ "						+ \"div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']/\"\r\n"
					+ "						+ \"div[@class='ant-col ant-form-item-control-wrapper']/div[@class='ant-form-item-control']\"\r\n"
					+ "						+ \"/span[@class='ant-form-item-children']/div/div[@class='select-component_1vIyr ant-select ant-select-enabled']/\"\r\n"
					+ "						+ \"div[@role='combobox']/div[@class='ant-select-selection__rendered']/div[1]")
			
			public WebElement conFieldTwo;
			
			
			//Clicking in the value field
			@FindBy (xpath = "(//span//div[@class=\"ant-select-selection__rendered\"])[8]")
			public WebElement valFieldTwo;
			
			
			//Selecting values
			@FindBy (xpath = "//li[text()='Team Shift 1']")
			public WebElement valTwo1;
			
			
			//Clicking on apply button
			@FindBy (xpath = "//button[@type='submit']")
			public WebElement submitButton;		
			
}		
			