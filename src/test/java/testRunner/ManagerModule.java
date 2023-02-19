package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import commons.Commons;
import managerActions.LoginTrackWick;
import managerActions.*;

public class ManagerModule {

	@BeforeTest
	public void login() {
		LoginTrackWick.preRequisite();
	}
	
	
/*======================================== Team Task ==========================================*/
	CreateTask CreateTask = new CreateTask();
	UpdateTask UpdateTask = new UpdateTask();
	
	
	
	@Test (priority = 0, groups = {"task", "sanity"})
	public void teamTask() throws InterruptedException {
		Commons.softassert.assertEquals(CreateTask.createTask(), "s", "Team Task Created Failed");
		Commons.softassert.assertEquals(UpdateTask.updateTask(), "s", "Task did not updated");
		Commons.softassert.assertAll();
		
	}
	
/*========================================= Lead ========================================*/	
	CreateLead cl = new CreateLead();
	
	@Test (priority = 1, groups = {"lead","sanity"})
	public void lead() throws InterruptedException {
		Commons.softassert.assertEquals(cl.createLead(), "s", "Lead Creation Failed");
		Commons.softassert.assertAll();
	}
	
	
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		LoginTrackWick.closeBrowser();
	}
	
}
