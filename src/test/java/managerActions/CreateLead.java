package managerActions;

import commons.Utils;
import managerLocatorsTrackWick.Lead_Create;

/*
 * common abbrivatives
 * lc - Object of lead create class
 * s - success
 * 
 */

public class CreateLead {
	Lead_Create lc = new Lead_Create();
	
	public String createLead() throws InterruptedException {
		try {
		lc.LeadTab.click();
		
		Thread.sleep(400);
		lc.NewLeadCreateButton.click();
		
		//WebDriverWait wait = new WebDriverWait(Utils.driver,10);
		
		lc.EnterLeadName.sendKeys("Test Lead");
		
		
		lc.LeadSourceField.click();
		Utils.crsr.moveToElement(lc.SelectLeadSource).click().perform();
		
		Thread.sleep(300);
		lc.LeadTypeField.click();
		Utils.crsr.moveToElement(lc.LeadType).click().perform();
		
		lc.LeadEmail.sendKeys("sanity@automation.com");
		
		
		lc.LeadMobile.sendKeys("9720166306");
		System.out.println("I am here");
		
		
	
		lc.LeadWorkflowField.click();
		Utils.crsr.moveToElement(lc.SelectLeadWorkflow).click().perform();
		
		
		lc.OwnerField.click();
		Utils.crsr.moveToElement(lc.SelectLeadOwner).click().perform();
		
		
		lc.LeadCreateButton.click();
		
		
		return "s";
		}
		catch(Exception e) {
			return "f";
		}	
	}
}
