package managerActions;

import commons.Utils;
import managerLocatorsTrackWick.Create_Task;

public class CreateTask {
	
	Create_Task ct = new Create_Task(Utils.driver);
	
public String createTask() throws InterruptedException {
		
		try {
		ct.teamTaskTab.click();;
		
		
		Thread.sleep(1000);
		ct.creatTaskbutton.click();
		
		
		ct.taskTypeField.click();
		
		Utils.crsr.moveToElement(ct.selectTaskForm).click().perform();
		
		
		ct.leadField.click();
		
		
		ct.selectLead.click();
		
		
		ct.title.sendKeys("Test Task");
		
		
		ct.empField.click();
		
		
		ct.selectEmp.click();
		
		
		ct.submitButton.click();
		
		if(ct.createdTaskTitle.getText().equals("Test Task")) {
			return "s";
		}
		else
		{
			return "f";
		}
		
	}
	catch(Exception e) 
		{
			return "f";
		}
	}
	

}
