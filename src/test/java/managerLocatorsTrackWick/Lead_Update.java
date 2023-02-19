package managerLocatorsTrackWick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import junit.framework.Assert;
import managerActions.LoginTrackWick;

public class Lead_Update {
	LoginTrackWick.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	Thread.sleep(5000);
	//click on lead link
	LoginTrackWick.driver.findElement(By.xpath("//a[text()= 'Lead'][1]")).click();
			
			
	//Clicking on lead
	LoginTrackWick.driver.findElement(By.xpath("(//a)[29]")).click();
	
	
	Thread.sleep(3000);
	//Clicking on edit button in lead details to open edit dialog box.
	LoginTrackWick.driver.findElement(By.xpath("(//button[@type='button'])[4]")).sendKeys(Keys.ENTER);
	
	
	Thread.sleep(2000);
	
	//Updating Lead Type
	LoginTrackWick.driver.findElement(By.xpath("(//div)[236]")).click();
	LoginTrackWick.driver.findElement(By.cssSelector("li[title='WARM']")).click();
	
	Thread.sleep(1000);
	//Updating mobile number
	LoginTrackWick.driver.findElement(By.cssSelector("#mobile-number-02")).sendKeys(Keys.CONTROL+"a");
	LoginTrackWick.driver.findElement(By.cssSelector("#mobile-number-02")).sendKeys(Keys.DELETE);
	LoginTrackWick.driver.findElement(By.xpath("//input[@id='mobile-number-02']")).sendKeys("9756412005");
	
	
	//updating owner
	LoginTrackWick.driver.findElement(By.xpath("(//div)[246]")).click();
	
	LoginTrackWick.driver.findElement(By.cssSelector("li[title='Durgesh Singh']")).click();


			
	//Clicking on update button in model
	LoginTrackWick.driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
	String text = LoginTrackWick.driver.findElement(By.xpath("(//div[@title='Durgesh Singh'])[1]")).getText();
	System.out.println("I am here 2 "+text);
	//Asserting Owner
	Assert.assertEquals("Durgesh Singh",text);	

}
