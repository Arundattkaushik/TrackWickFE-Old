package managerLocatorsTrackWick;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import managerActions.LoginTrackWick;

public class Customers {
	
	@BeforeTest
	public void login() {
		LoginTrackWick.preRequisite();
	}
	
	
	
	@Test (priority = 0, groups = {"sanity","customer"})
	public void createCustomer() throws InterruptedException {
		LoginTrackWick.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Clicking on customers link from the top menu
		LoginTrackWick.driver.findElement(By.xpath("(//a[text()='Customers'])")).click();
		
		Thread.sleep(1000);
		
		//Clicking on + icon
		LoginTrackWick.driver.findElement(By.xpath("(//i[@class=\"anticon add-icons_S2Eit\"])/../..")).click();
		
		
		//Dialog box opens to create a customer.
		Thread.sleep(3000);
		
		//Company Name
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Cust 001");
		
		//Phone 
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9756412003");
		
		
		//Email
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("priya@beachfront.com");
		
		
		//Owner
		LoginTrackWick.driver.findElement(By.xpath("(//div/div[text()=\"Select Owner\"])/..")).click();
		
		//Scrolling down till cancel button
		JavascriptExecutor js = (JavascriptExecutor) LoginTrackWick.driver;
		js.executeScript("window.scrollBy(0,3000)");
		
		LoginTrackWick.driver.findElement(By.xpath("//ul/li[1][@role=\"option\"]")).click();
		
		
		//Clicking create button
		LoginTrackWick.driver.findElement(By.xpath("(//button[text()=\"Create\"])")).click();
		
		//Cancel Button
		//LoginTrackWick.driver.findElement(By.xpath("//div/form/div[2]/button[text()='Cancel']"));	
		
		Thread.sleep(5000);
	}
	
	
	
	@Test (priority = 1, groups = {"sanity","customer"})
	public void customerUpdate() throws InterruptedException {
		Thread.sleep(1000);
		
		//Clicking on customers tab
		LoginTrackWick.driver.findElement(By.xpath("(//a[text()='Customers'])")).click();
		
		Thread.sleep(2000);
		
		//Clicking customer from the list
		LoginTrackWick.driver.findElement(By.xpath("(//a[1][@class=\"semibold\"])")).click();
		
		//Clicking edit button in customer details
		LoginTrackWick.driver.findElement(By.xpath("//button/span[text()='Edit']/../..")).click();
		
		
		Thread.sleep(1000);
		//updating mobile
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(1000);
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys(Keys.BACK_SPACE);
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9756562003");
		
		
		//email
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(Keys.CONTROL+"a");
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(Keys.BACK_SPACE);
		LoginTrackWick.driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("priya@beachfnt.com");
		
		
		//owner
		LoginTrackWick.driver.findElement(By.xpath("//div/div[text()='Select Owner']/../..")).click();
		LoginTrackWick.driver.findElement(By.xpath("//ul[@role=\"listbox\"]/li[2][@role=\"option\"]/../..")).click();
		
		
		//Filling tag
		LoginTrackWick.driver.findElement(By.xpath("//input[@id=\"63cfde254d40c64ccad48181\"]")).sendKeys("Hello");
		LoginTrackWick.driver.findElement(By.xpath("//div/div[text()='Please select list']")).click();
		LoginTrackWick.driver.findElement(By.xpath("//div/ul/li[text()=\"1\"]")).click();
		
		
		//Clicking on Update button
		LoginTrackWick.driver.findElement(By.xpath("//button[text()='Update']")).click();
			
		
		//Clicking on cancel button to close the update dialog box
		LoginTrackWick.driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		
	}
	
	
	
	@Test (priority = 2, groups = {"sanity","customer"})
	public void customerDelete() throws InterruptedException {
		
		Thread.sleep(3000);
		
		//Clicking on customers tab
		LoginTrackWick.driver.findElement(By.xpath("(//a[text()='Customers'])")).click();
				
		Thread.sleep(2000);
				
		//Clicking customer from the list
		LoginTrackWick.driver.findElement(By.xpath("(//a[1][@class=\"semibold\"])")).click();
		
		Thread.sleep(1000);
		
		//Clicking on delete icon
		LoginTrackWick.driver.findElement(By.xpath("//span/img")).click();
		
		Thread.sleep(1000);
		
		//Clicking on delete button
		LoginTrackWick.driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
	}
	
	
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		LoginTrackWick.closeBrowser();
	}	
}
