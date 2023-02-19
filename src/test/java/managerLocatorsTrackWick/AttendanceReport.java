package managerLocatorsTrackWick;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import managerActions.LoginTrackWick;

public class AttendanceReport {
	
	@BeforeTest
	public void login() {
		LoginTrackWick.preRequisite();
	}
	
	
	@Test (priority = 1, groups = {"sanity"})
	public void attendanceRegularization() throws InterruptedException {
		
		LoginTrackWick.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Capturing 3 dots to expand menu 
		WebElement el = LoginTrackWick.driver.findElement(By.xpath("//ul[@class=\"ant-menu ant-menu-light ant-menu-root ant-menu-horizontal\"]/li[25]/div"));
		
		
		Actions crsr = new Actions(LoginTrackWick.driver);
		
		Thread.sleep(2000);
		// Hovering mouse on 3 dots
		crsr.moveToElement(el).perform();

		
		Thread.sleep(2000);
		// Clicking on Reports tab
		WebElement rprt = LoginTrackWick.driver.findElement(By.xpath("(//a[@title='Reports'])[2]"));
		crsr.moveToElement(rprt).click().perform();
		System.out.println("Attendance Regularization Report is clicked");
		
		
		//Clicking on Attendance regularization tab
		LoginTrackWick.driver.findElement(By.xpath("//tbody[@class=\"ant-table-tbody\"]/tr[7]/td/div[1]/div/a")).click();
		
		
		if (LoginTrackWick.driver.findElement(By.xpath("//p[text()='Report does not found any data']")).getText().equals("Report does not found any data")) {
			
			
				//Clicking on Filter Icon 
				LoginTrackWick.driver.findElement(By.xpath("//button[@class=\"ant-btn button-margin_2l4GQ\"]/i/..")).click();
				
				
				Thread.sleep(2000);
				//Clicking on Data Type field 
				LoginTrackWick.driver.findElement(By.xpath("//div/div[text()='Yesterday']|//div/div[text()='Today']|//div/div[text()='Last 7 Days']")).click();
				
				
				//Selecting an option from the list
				WebElement selection = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Last 14 Days']"));
				crsr.moveToElement(selection).click().perform();
				
				
				//Clicking on Employee fields
				LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")).click();
				
				
				//Getting list of employee fields 
				WebElement l1 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Date of Joining']"));
				crsr.moveToElement(l1).click().perform();
				WebElement l2 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Date of Birth']"));
				crsr.moveToElement(l2).click().perform();
				WebElement l3 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Type']"));
				crsr.moveToElement(l3).click().perform();
				WebElement l4 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Team']"));
				crsr.moveToElement(l4).click().perform();
				WebElement l5 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Identifier']"));
				crsr.moveToElement(l5).click().perform();
				WebElement l6 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Leave Profile']"));
				crsr.moveToElement(l6).click().perform();
				WebElement l7 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Email']"));
				crsr.moveToElement(l7).click().perform();
				WebElement l8 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Mobile']"));
				crsr.moveToElement(l8).click().perform();
				WebElement l9 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Designation']"));
				crsr.moveToElement(l9).click().perform();
				WebElement l10 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Work Location']"));
				crsr.moveToElement(l10).click().perform();
				WebElement l11 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Experience']"));
				crsr.moveToElement(l11).click().perform();
				WebElement l12 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Reporting Manager 1']"));
				crsr.moveToElement(l12).click().perform();
				WebElement l13 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Reporting Manager 2']"));
				crsr.moveToElement(l13).click().perform();
				
				LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")).click();
				
				
				
				//Clicking on filer filed to show option list.
				LoginTrackWick.driver.findElement(By.xpath("(//span/div/div/div[@role=\"combobox\"])[3]")).click();
				
				
				
				//Selecting Employee option from filter field
				WebElement fltr = LoginTrackWick.driver.findElement(By.xpath("//li[@title='Employee']"));
				crsr.moveToElement(fltr).click().perform();
					
				
				//Clicking on condition field.
				LoginTrackWick.driver.findElement(By.xpath("//div[@class='form-table_1rFp4']//"
						+ "div[@class='ant-row']//div[@class='field_1rg0k']//div[@class='field_1rg0k']//"
						+ "div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']"
						+ "//div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']"
						+ "//div[@class='ant-col ant-form-item-control-wrapper']//"
						+ "div[@class='ant-form-item-control']//span[@class='ant-form-item-children']//"
						+ "div//div[@class='ant-select-selection__placeholder']"
						+ "[normalize-space()='Please select']")).click();
				
				
				//Selecting a condition
				WebElement c1 = LoginTrackWick.driver.findElement(By.xpath("//li[@title='IN']"));
				crsr.moveToElement(c1).click().perform();
				
				
				//Clicking on value field
				LoginTrackWick.driver.findElement(By.xpath("(//div[@role='combobox'])[5]")).click();
				
				
				//Selecting values
				WebElement v1 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Karan Singh']"));
				crsr.moveToElement(v1).click().perform();
				
				WebElement v2 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Durgesh Singh']"));
				crsr.moveToElement(v2).click().perform();
				
				WebElement v4 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Geeta Fogart']"));
				crsr.moveToElement(v4).click().perform();
				
				
				WebElement v5 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Seeta Fogart']"));
				crsr.moveToElement(v5).click().perform();
				
				
			
				//Clicking On Add More Button to add more filters //button[text()='Add More']
				LoginTrackWick.driver.findElement(By.xpath("//button[text()='Add More']")).click();
				
				
				//Clicking on filer filed to show option list.
				LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\"ant-select-selection__rendered\"])[6]")).click();
				
				
				//Selecting Team option from filter field
				WebElement team = LoginTrackWick.driver.findElement(By.xpath("//li[@title='Team']"));
				crsr.moveToElement(team).click().perform();
				
				
				//Clicking on condition field
				LoginTrackWick.driver.findElement(By.xpath("//body/div[@class='portal_3km03']/"
						+ "div[@class='ReactModal__Overlay ReactModal__Overlay--after-open overlay_RRpTk']/"
						+ "div[@role='dialog']/div[@class='body_2-4a5']/div/"
						+ "div[@class='inner-container-without-shadow_3_jq8 detail_2G1an']/"
						+ "div[@class='detail-form_3iRDZ']/form/div[@class='form-container_2XvJX']/"
						+ "div[@class='ant-row']/div[@class='ant-col ant-col-24']/div[@class='ant-row']/"
						+ "div[@class='ant-col ant-col-24']/div[@class='ant-row']/div[@class='field_1rg0k']/"
						+ "div[@class='field_1rg0k']/div[@class='ant-col ant-col-24']/"
						+ "div[@class='ant-col gutter-row ant-col-sm-24 ant-col-md-24 ant-col-lg-24 ant-col-xl-24']/"
						+ "div[@class='form-table_1rFp4']/div[@class='ant-row']/div[@class='field_1rg0k']/"
						+ "div[@class='field_1rg0k']/div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']/"
						+ "div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']/"
						+ "div[@class='ant-col ant-form-item-control-wrapper']/div[@class='ant-form-item-control']"
						+ "/span[@class='ant-form-item-children']/div/div[@class='select-component_1vIyr ant-select ant-select-enabled']/"
						+ "div[@role='combobox']/div[@class='ant-select-selection__rendered']/div[1]")).click();
				
				
				//Selecting a condition
				WebElement c2 = LoginTrackWick.driver.findElement(By.xpath("//li[@title='IN']"));
				crsr.moveToElement(c2).click().perform();
				
				
				//Clicking in the value field
				LoginTrackWick.driver.findElement(By.xpath("(//span//div[@class=\"ant-select-selection__rendered\"])[8]")).click();
				
				
				//Selecting values
				WebElement t1 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Team Shift 1']"));
				crsr.moveToElement(t1).click().perform();
				
			
				//Clicking on apply button
				LoginTrackWick.driver.findElement(By.xpath("//button[@type='submit']")).click();
				
				
					
				}
		
		else 
		{
				throw new NullPointerException("Something went wrong..");
		}
		
}
	
	
	
	@Test (priority = 2, groups = {"sanity"})
	public void monthlyAttendance() throws InterruptedException {
		LoginTrackWick.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Capturing 3 dots to expand menu 
		WebElement el = LoginTrackWick.driver.findElement(By.xpath("//ul[@class=\"ant-menu ant-menu-light ant-menu-root ant-menu-horizontal\"]/li[25]/div"));
		
		
		Actions crsr = new Actions(LoginTrackWick.driver);
		
		Thread.sleep(2000);
		// Hovering mouse on 3 dots
		crsr.moveToElement(el).perform();

		
		Thread.sleep(2000);
		// Clicking on Reports tab
		WebElement rprt = LoginTrackWick.driver.findElement(By.xpath("(//a[@title='Reports'])[2]"));
		crsr.moveToElement(rprt).click().perform();
		System.out.println("Monthly Attendance Report is clicked");
		
		
		//Clicking on Monthly Attendance report link
		LoginTrackWick.driver.findElement(By.xpath("//tbody[@class=\"ant-table-tbody\"]/tr[6]/td[1]/div/div/a")).click();
		
		
		if (LoginTrackWick.driver.findElement(By.xpath("//tbody/tr[1]/td[3]/div/div")).getText().equalsIgnoreCase("AB")) {
			System.out.println("I Am here in monthly attendance");
			
			
			
			//Clicking on Filter Icon 
			LoginTrackWick.driver.findElement(By.xpath("//button[@class=\"ant-btn button-margin_2l4GQ\"]/i/..")).click();
			
			
			Thread.sleep(2000);
			//Clicking on Data Type field 
			LoginTrackWick.driver.findElement(By.xpath("//div/div[text()='Yesterday']|//div/div[text()='Today']|//div/div[text()='Last 7 Days']")).click();
			
			
			//Selecting an option from the list
			WebElement selection = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Last 14 Days']"));
			crsr.moveToElement(selection).click().perform();
			
			
			//Clicking on Employee fields
			LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")).click();
			
			
			//Getting list of employee fields 
			WebElement l1 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Date of Joining']"));
			crsr.moveToElement(l1).click().perform();
			WebElement l2 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Date of Birth']"));
			crsr.moveToElement(l2).click().perform();
			WebElement l3 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Type']"));
			crsr.moveToElement(l3).click().perform();
			WebElement l4 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Team']"));
			crsr.moveToElement(l4).click().perform();
			WebElement l5 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Identifier']"));
			crsr.moveToElement(l5).click().perform();
			WebElement l6 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Leave Profile']"));
			crsr.moveToElement(l6).click().perform();
			WebElement l7 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Email']"));
			crsr.moveToElement(l7).click().perform();
			WebElement l8 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Mobile']"));
			crsr.moveToElement(l8).click().perform();
			WebElement l9 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Designation']"));
			crsr.moveToElement(l9).click().perform();
			WebElement l10 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Work Location']"));
			crsr.moveToElement(l10).click().perform();
			WebElement l11 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Experience']"));
			crsr.moveToElement(l11).click().perform();
			WebElement l12 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Reporting Manager 1']"));
			crsr.moveToElement(l12).click().perform();
			WebElement l13 = LoginTrackWick.driver.findElement(By.xpath("//div[text()='Reporting Manager 2']"));
			crsr.moveToElement(l13).click().perform();
			
			LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\" css-65knlb\"]/div/div[1]/..)[1]")).click();
			
			
			
			//Clicking on filer filed to show option list.
			LoginTrackWick.driver.findElement(By.xpath("(//span/div/div/div[@role=\"combobox\"])[3]")).click();
			
			
			
			//Selecting Employee option from filter field
			WebElement fltr = LoginTrackWick.driver.findElement(By.xpath("//li[@title='Employee']"));
			crsr.moveToElement(fltr).click().perform();
				


//Need to check here
			//Clicking on condition field.
			LoginTrackWick.driver.findElement(By.xpath("//div[@class='form-table_1rFp4']//"
					+ "div[@class='ant-row']//div[@class='field_1rg0k']//div[@class='field_1rg0k']//"
					+ "div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']"
					+ "//div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']"
					+ "//div[@class='ant-col ant-form-item-control-wrapper']//"
					+ "div[@class='ant-form-item-control']//span[@class='ant-form-item-children']//"
					+ "div//div[@class='ant-select-selection__placeholder']"
					+ "[normalize-space()='Please select']")).click();
			
			
			//Selecting a condition
			WebElement c1 = LoginTrackWick.driver.findElement(By.xpath("//li[@title='IN']"));
			crsr.moveToElement(c1).click().perform();
			
			
			//Clicking on value field
			LoginTrackWick.driver.findElement(By.xpath("(//div[@role='combobox'])[5]")).click();
			
			
			//Selecting values
			WebElement v1 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Karan Singh']"));
			crsr.moveToElement(v1).click().perform();
			
			WebElement v2 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Durgesh Singh']"));
			crsr.moveToElement(v2).click().perform();
			
			WebElement v4 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Geeta Fogart']"));
			crsr.moveToElement(v4).click().perform();
			
			
			WebElement v5 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Seeta Fogart']"));
			crsr.moveToElement(v5).click().perform();
			
			
		
			//Clicking On Add More Button to add more filters //button[text()='Add More']
			LoginTrackWick.driver.findElement(By.xpath("//button[text()='Add More']")).click();
			
			
			//Clicking on filer filed to show option list.
			LoginTrackWick.driver.findElement(By.xpath("(//div[@class=\"ant-select-selection__rendered\"])[6]")).click();
			
			
			//Selecting Team option from filter field
			WebElement team = LoginTrackWick.driver.findElement(By.xpath("//li[@title='Team']"));
			crsr.moveToElement(team).click().perform();
			
			
			//Clicking on condition field
			LoginTrackWick.driver.findElement(By.xpath("//body/div[@class='portal_3km03']/"
					+ "div[@class='ReactModal__Overlay ReactModal__Overlay--after-open overlay_RRpTk']/"
					+ "div[@role='dialog']/div[@class='body_2-4a5']/div/"
					+ "div[@class='inner-container-without-shadow_3_jq8 detail_2G1an']/"
					+ "div[@class='detail-form_3iRDZ']/form/div[@class='form-container_2XvJX']/"
					+ "div[@class='ant-row']/div[@class='ant-col ant-col-24']/div[@class='ant-row']/"
					+ "div[@class='ant-col ant-col-24']/div[@class='ant-row']/div[@class='field_1rg0k']/"
					+ "div[@class='field_1rg0k']/div[@class='ant-col ant-col-24']/"
					+ "div[@class='ant-col gutter-row ant-col-sm-24 ant-col-md-24 ant-col-lg-24 ant-col-xl-24']/"
					+ "div[@class='form-table_1rFp4']/div[@class='ant-row']/div[@class='field_1rg0k']/"
					+ "div[@class='field_1rg0k']/div[@class='ant-col gutter-row ant-col-sm-6 ant-col-md-6 ant-col-lg-6 ant-col-xl-6']/"
					+ "div[@class='ant-row ant-form-item dynamic-select-field_3cBPz']/"
					+ "div[@class='ant-col ant-form-item-control-wrapper']/div[@class='ant-form-item-control']"
					+ "/span[@class='ant-form-item-children']/div/div[@class='select-component_1vIyr ant-select ant-select-enabled']/"
					+ "div[@role='combobox']/div[@class='ant-select-selection__rendered']/div[1]")).click();
			
			
			//Selecting a condition
			WebElement c2 = LoginTrackWick.driver.findElement(By.xpath("//li[@title='IN']"));
			crsr.moveToElement(c2).click().perform();
			
			
			//Clicking in the value field
			LoginTrackWick.driver.findElement(By.xpath("(//span//div[@class=\"ant-select-selection__rendered\"])[8]")).click();
			
			
			//Selecting values
			WebElement t1 = LoginTrackWick.driver.findElement(By.xpath("//li[text()='Team Shift 1']"));
			crsr.moveToElement(t1).click().perform();
			
		
			//Clicking on apply button
			LoginTrackWick.driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		}
		
		else 
		{
				throw new NullPointerException("Something went wrong..");
		}
		

	}
	

	@AfterTest
	public void quitBrowser() throws InterruptedException {
		LoginTrackWick.closeBrowser();
	}
	
}
