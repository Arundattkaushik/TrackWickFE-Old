package managerActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import commons.Attendance;
import commons.Utils;
import managerLocatorsTrackWick.Attendance_Regularization;

public class AttendanceRegularization {
	
	Attendance at = new Attendance();
	Attendance_Regularization att = new Attendance_Regularization();

	public String attanceRegularization() {
		try {
			Utils.crsr.moveToElement(at.threeDots).perform();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(at.reportLink));
			Utils.crsr.moveToElement(at.reportLink).click().perform();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(att.attRegularizationLink));
			att.attRegularizationLink.click();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(att.repFirstText));
			at.reportFilter.click();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(at.reprtDateType));
			at.reprtDateType.click();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(at.selReprtDate));
			at.selReprtDate.click();
			
			at.clickReprtEmptFiled.click();
			
			Utils.crsr.moveToElement(at.dOBEmpFiled).click().perform();
			Utils.crsr.moveToElement(at.dOJEmpFiled).click().perform();
			Utils.crsr.moveToElement(at.experienceEmpField).click().perform();
			Utils.crsr.moveToElement(at.typeEmpField).click().perform();
			Utils.crsr.moveToElement(at.teamEmpField).click().perform();
			Utils.crsr.moveToElement(at.identifierEmpField).click().perform();
			Utils.crsr.moveToElement(at.leaveProfileEmpField).click().perform();
			Utils.crsr.moveToElement(at.emailEmpField).click().perform();
			Utils.crsr.moveToElement(at.moblileEmpField).click().perform();
			Utils.crsr.moveToElement(at.destinationEmpField).click().perform();
			Utils.crsr.moveToElement(at.workLocationEmpField).click().perform();
			Utils.crsr.moveToElement(at.repManOneEmpField).click().perform();
			Utils.crsr.moveToElement(at.RepManTwoEmpField).click().perform();
			
			at.clickReprtEmptFiled.sendKeys(Keys.ESCAPE);
			
			
			
			Utils.wait.until(ExpectedConditions.visibilityOf(at.filterFiledOne));
			Utils.crsr.moveToElement(at.filterFiledOne).click().perform();
			
			Utils.crsr.moveToElement(at.empReportFiled).click().perform();
			
			Utils.wait.until(ExpectedConditions.visibilityOf(at.condFiledOne));
			at.condFiledOne.click();
			
			Utils.crsr.moveToElement(at.selCondReportField).click().perform();
			
			at.valFieldOne.click();
			Utils.crsr.moveToElement(at.valOne1).click().perform();
			Utils.crsr.moveToElement(at.valOne2).click().perform();
			Utils.crsr.moveToElement(at.valOne3).click().perform();
			
			at.condFiledOne.sendKeys(Keys.ESCAPE);
			
			at.addMoreButtonReport.click();
			
			at.filterFieldTwo.click();
			
			Utils.crsr.moveToElement(at.selOptTeam).click().perform();
			Utils.wait.until(ExpectedConditions.visibilityOf(at.conFieldTwo));
			
			at.conFieldTwo.click();
			
			Utils.crsr.moveToElement(at.selCondReportField).click().perform();
			
			at.valFieldTwo.click();
			Utils.crsr.moveToElement(at.valTwo1).click().perform();
			
			at.valFieldTwo.sendKeys(Keys.ESCAPE);
			
			at.submitButton.click();
			
			
			return "s";
		}
		catch(Exception e) {
			return "f";
		}		
	}
}
