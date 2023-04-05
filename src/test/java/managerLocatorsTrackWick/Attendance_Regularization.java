package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.Utils;

public class Attendance_Regularization {
	
		WebDriver driver;
		public Attendance_Regularization(){
			this.driver = Utils.driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		//Clicking on Attendance regularization Link
		@FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]/tr[7]/td/div[1]/div/a")
		public WebElement attRegularizationLink;
		
		
		//Getting first text when we enter the report
		@FindBy(xpath = "//p[text()='Report does not found any data']")
		public WebElement repFirstText;
		
}
