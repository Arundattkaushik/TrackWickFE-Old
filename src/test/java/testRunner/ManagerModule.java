package testRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commons.LoginTrackWick;
import commons.Utils;
import managerActions.*;

public class ManagerModule {

	@BeforeTest
	public void login() {
		LoginTrackWick.preRequisite();
	}
	
	
    /*--------------------------------- Team Task ------------------------------------*/
	//Objects of action classes
	CreateTask ct = new CreateTask();
	UpdateTask ut = new UpdateTask();
	
	
	
	@Test (priority = 0, groups = {"task", "sanity"})
	public void teamTask() throws InterruptedException {
		Utils.softassert.assertEquals(ct.createTask(), "s", "Team Task Created Failed");
		Utils.softassert.assertEquals(ut.updateTask(), "s", "Task did not updated");
		Utils.softassert.assertAll();
		
	}
	
    /*------------------------------------ Lead ---------------------------------------*/	
	//Objects of action classes
	CreateLead cl = new CreateLead();
	
	@Test (priority = 1, groups = {"lead","sanity"})
	public void lead() throws InterruptedException {
		Utils.softassert.assertEquals(cl.createLead(), "s", "Lead Creation Failed");
		Utils.softassert.assertAll();
	}
	
	

    /*----------------------------------- Customer ------------------------------------*/
	//Objects of action classes
	
	
	
	/*----------------------------------- Reports -------------------------------------*/
	AttendanceRegularization attReg = new AttendanceRegularization();
	@Test (priority = 2, groups = {"reports","sanity"})
	public void reports() {
		Utils.softassert.assertEquals(attReg.attanceRegularization(), "s", "Something went wrong");
		Utils.softassert.assertAll();
	}
	
	
	@AfterTest
	public void quitBrowser() throws InterruptedException {
		LoginTrackWick.closeBrowser();
	}
	
}
