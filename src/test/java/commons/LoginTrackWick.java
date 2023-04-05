package commons;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTrackWick {
	
	//Login Logic  
	public static void preRequisite() {

		Utils.driver.get("https://local.trackwick.com");
		Utils.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			
			Utils.driver.manage().window().maximize();
			Utils.driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("realme@realmeone.com");
			Utils.driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("mavericks@2023!!");
			Utils.driver.findElement(By.xpath("//button[@type=\"submit\"]")).sendKeys(Keys.ENTER);
			
			
			//If captcha field appears after hitting the submit button then 
			if(Utils.driver.findElement(By.xpath("//*[text()='Add Widgets']")).isDisplayed()) {
				
					System.out.println("Login is successful...");
			}
			
		}
		catch(Exception e){
			//If captcha field appears after hitting the submit button then 
			if(Utils.driver.findElement(By.xpath("//input[@name=\"captchaText\"]")).isDisplayed()) {
				System.out.println("Enter captcha....");
				String captch = Utils.sc.nextLine();
				Utils.driver.findElement(By.xpath("//input[@name=\"captchaText\"]")).sendKeys(captch);
				Utils.driver.findElement(By.xpath("//button[@type=\"submit\"]")).sendKeys(Keys.ENTER);
				
				if(Utils.driver.findElement(By.xpath("//*[text()='Add Widgets']")).isDisplayed()) {
					System.out.println("Login is successful...");
				}
			}
		}		
	}
	
	
	
	
	//Logout Logic
	public static void closeBrowser() throws InterruptedException {
		Thread.sleep(5000);
		Utils.driver.quit();
	}
	
	
}
