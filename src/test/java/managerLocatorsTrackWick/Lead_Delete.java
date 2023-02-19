package managerLocatorsTrackWick;

import org.openqa.selenium.By;

import managerActions.LoginTrackWick;

public class Lead_Delete {
	Thread.sleep(5000);
	//click on lead link
	LoginTrackWick.driver.findElement(By.xpath("//a[text()= 'Lead'][1]")).click();
			
			
	//Clicking on lead
	LoginTrackWick.driver.findElement(By.xpath("(//a)[29]")).click();
	
	//Clicking on delete button
	LoginTrackWick.driver.findElement(By.xpath("(//img)[2]")).click();
	Thread.sleep(2000);
	
	//Clicking on yes button
	LoginTrackWick.driver.findElement(By.xpath("//div[@role='tooltip']//button[2]")).click();

}
