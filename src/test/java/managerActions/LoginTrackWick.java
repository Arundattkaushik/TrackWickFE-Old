package managerActions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import commons.Commons;

public class LoginTrackWick {
	
	//Login Logic  
	public static void preRequisite() {
		Commons.driver.get("https://local.trackwick.com");
		Commons.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			
			Commons.driver.manage().window().maximize();
			Commons.driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("realme@realmeone.com");
			Commons.driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("987654321");
			Commons.driver.findElement(By.xpath("//button[@type=\"submit\"]")).sendKeys(Keys.ENTER);
			
			
			//If captcha field appears after hitting the submit button then 
			if(Commons.driver.findElement(By.xpath("//*[text()='Add Widgets']")).isDisplayed()) {
				
					System.out.println("Login is successful...");
			}
			
		}
		catch(Exception e){
			//If captcha field appears after hitting the submit button then 
			if(Commons.driver.findElement(By.xpath("//input[@name=\"captchaText\"]")).isDisplayed()) {
				System.out.println("Enter captcha....");
				String captch = Commons.sc.nextLine();
				Commons.driver.findElement(By.xpath("//input[@name=\"captchaText\"]")).sendKeys(captch);
				Commons.driver.findElement(By.xpath("//button[@type=\"submit\"]")).sendKeys(Keys.ENTER);
				
				if(Commons.driver.findElement(By.xpath("//*[text()='Add Widgets']")).isDisplayed()) {
					System.out.println("Login is successful...");
				}
			}
		}		
	}
	
	
	
	
	//Logout Logic
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		Commons.driver.quit();
	}
	
	
}
