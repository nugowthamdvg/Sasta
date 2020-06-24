package com.Sasta;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.DietClinicPage;
import SastaSundar.Pagerepository.HomePage;
import SastaSundar.Pagerepository.LabTestPage;
import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

@Listeners(SastaSundar.genericLib.ListenerImp.class)

public class FemaleBodydiseaseLabTestBooking extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	LabTestPage lt;
	
	@Test
	public void labBookingTest() throws Exception
	{
		home = PageFactory.initElements(driver, HomePage.class);
		dc = PageFactory.initElements(driver, DietClinicPage.class);
		sc = PageFactory.initElements(driver, SymptomsChecker.class);
		lt = PageFactory.initElements(driver, LabTestPage.class);
		
		home.getDietclinicLink().click();
		Reporter.log("clicked on Dietclinic link", true);
		
		dc.getHealtharticlesLink().click();
		Reporter.log("clicked on health article link", true);
		
		dc.getSymptomcheckerLink().click();
		Reporter.log("clicked on symptom checker link", true);
		Thread.sleep(3000);
		
		sc.getFemaleBodyPartsLink().click();
		Reporter.log("clicked on female body Icon", true);
		
		sc.getMouthPart().click();
		Reporter.log("clicked on Mouth part", true);
		
		sc.getSorethatdoesnthealCheckbox().click();
		Reporter.log("clicked on symptom checkbox", true);
		
		sc.getShowDiseaseButton().click();
		Reporter.log("clicked on show disease button", true);
		
		sc.getOralcancerdiseaseLink().click();
		Reporter.log("clicked on Disease", true);
		
		sc.getLabclickhereLink().click();
		Reporter.log("clicked on Click here button", true);
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		
		sc.getLipidprofileTest().click();
		Reporter.log("clicked on Lipid profile Test", true);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String pids = itr.next();
		String coneids = itr.next();
		String ctwoids = itr.next();
		
		driver.switchTo().window(ctwoids);
		
		lt.getBooknowButton().click();
		Reporter.log("clicked on Book Now button", true);
		
		lt.getDaydd().click();
		Reporter.log("clicked on day dropdown", true);
		
		lt.getSelectdddate().click();
		Reporter.log("Date is Selected", true);
		
		lt.getSelecttimeslot().click();
		Reporter.log("Time slot is selected", true);
		
		lt.getSelecttestLink().click();
		Thread.sleep(3000);
		
		lt.getDeleteIcon().click();
		
		lt.getYesButton().click();
		
		driver.switchTo().window(pids);
		
	}
}
