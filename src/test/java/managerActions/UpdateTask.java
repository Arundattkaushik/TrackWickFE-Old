package managerActions;

import org.openqa.selenium.Keys;

import commons.Commons;
import managerLocatorsTrackWick.Update_Task;


public class UpdateTask {
	Update_Task ut = new Update_Task(Commons.driver);
	
	public String updateTask() throws InterruptedException {
		
		Thread.sleep(1000);
		ut.TeamTaskTab.click();
		
		Thread.sleep(500);
		//Getting Old Assignee
				Thread.sleep(1000);
				String oldAssignee = ut.oldAssignee.getText();
		
		Thread.sleep(500);
		String oldTitle = ut.updateTask.getText();
		ut.updateTask.click();
		
		
		Thread.sleep(200);
		ut.editButton.click();
		
		Thread.sleep(200);
		ut.clicklead.click();
		
		Thread.sleep(200);
		ut.selcetLead.click();
		
		Thread.sleep(200);
		ut.UpdateTitle.sendKeys(Keys.CONTROL+"a");
		ut.UpdateTitle.sendKeys(Keys.BACK_SPACE);
		ut.UpdateTitle.sendKeys("Test Task 1");
		
		
		Thread.sleep(200);
		ut.PriorityField.click();
		
		
		Thread.sleep(200);
		Commons.crsr.moveToElement(ut.SelectPriority).click().perform();
		
		Thread.sleep(200);
		String oldAssigne = ut.AssigneeField.getText();
		ut.AssigneeField.click();
		
		Thread.sleep(200);
		Commons.crsr.moveToElement(ut.SelectAssignee).click().perform();
		
		Thread.sleep(200);
		ut.NameField.sendKeys("Automation Sanity");
		
		Thread.sleep(200);
		ut.ValueField.sendKeys("123");
		
		Thread.sleep(200);
		ut.UpdateButton.click();
		
		Thread.sleep(500);
		ut.TeamTaskTab.click();
		
		Thread.sleep(200);
		String newTitle = ut.updateTask.getText();
		
		Thread.sleep(200);
		String newAssignee = ut.oldAssignee.getText();
		
//		System.out.println(oldAssigne);
//		System.out.println(newAssignee);
		
		try {
			if(oldTitle.equals(newTitle)) {
	
				//System.out.println("1st condition is clear");
				
				if(oldAssigne.equals(newAssignee)) {
					
					//System.out.println("2nd condition is clear");
					
					return "s";
					
				}
			}
			else 
			{
				return "f";
			}
		}
		catch(Exception e){
			return "f";
		}
		
		return "f";
	}
}
