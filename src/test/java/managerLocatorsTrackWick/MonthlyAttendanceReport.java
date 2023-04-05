package managerLocatorsTrackWick;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MonthlyAttendanceReport {
	
	WebDriver driver;
	MonthlyAttendanceReport(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
			// Capturing 3 dots to expand menu 
			
			// Hovering mouse on 3 dots

			// Clicking on Reports Link
			
			
			//Clicking on Monthly Attendance report link
			@FindBy(xpath = "//tbody[@class=\"ant-table-tbody\"]/tr[6]/td[1]/div/div/a")
			WebElement monthlyAtReport;
			
			
			
			
			//if (LoginTrackWick.driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div")).getText().equalsIgnoreCase("AB")) {
			//System.out.println("I Am here in monthly attendance");
				
				
				
			//Clicking on Filter Icon 
				
				
			//Clicking on Data Type field 
				

			//Selecting an option from the list
				
					
			//Clicking on Employee fields
			
				
			//Getting list of employee fields 
				
				
			//Clicking on filer filed to show option list.
				
				
			//Selecting Employee option from filter field
				
					
			//Clicking on condition field.
				
				
			//Selecting a condition
				
				
			//Clicking on value field
				
			
			//Selecting values
					
			
			//Clicking On Add More Button to add more filters //button[text()='Add More']
				
				
			//Clicking on filer filed to show option list.
				
				
			//Selecting Team option from filter field
				
				
			//Clicking on condition field

				
			//Selecting a condition
				
				
			//Clicking in the value field
				
				
			//Selecting values
				
			
			//Clicking on apply button
				
	
}
