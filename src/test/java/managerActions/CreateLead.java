package managerActions;

import commons.Commons;
import managerLocatorsTrackWick.Lead_Create;

public class CreateLead {
	Lead_Create lc = new Lead_Create();
	
	public String createLead() throws InterruptedException {
		try {
		lc.LeadTab.click();
		
		Thread.sleep(400);
		lc.NewLeadCreateButton.click();
		
		Thread.sleep(300);
		lc.EnterLeadName.sendKeys("Test Lead");
		
		
		lc.LeadSourceField.click();
		Commons.crsr.moveToElement(lc.SelectLeadSource).click().perform();
		
		Thread.sleep(300);
		lc.LeadTypeField.click();
		Commons.crsr.moveToElement(lc.LeadType).click().perform();
		
		lc.LeadEmail.sendKeys("sanity@automation.com");
		
		
		lc.LeadMobile.sendKeys("9720166306");
		System.out.println("I am here");
		
		
	
		lc.LeadWorkflowField.click();
		Commons.crsr.moveToElement(lc.SelectLeadWorkflow).click().perform();
		
		
		lc.OwnerField.click();
		Commons.crsr.moveToElement(lc.SelectLeadOwner).click().perform();
		
		
		lc.LeadCreateButton.click();
		
		
		return "s";
		}
		catch(Exception e) {
			return "f";
		}	
	}
}
