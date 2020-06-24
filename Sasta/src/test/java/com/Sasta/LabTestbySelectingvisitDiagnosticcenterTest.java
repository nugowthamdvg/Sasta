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

public class LabTestbySelectingvisitDiagnosticcenterTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	LabTestPage lt;
	
	@Test
	public void remoendedtestBookingTest() throws Exception
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
		
		sc.getBodypart().click();
		Reporter.log("Clicked on Body part", true);
		Thread.sleep(3000);

		sc.getSelectInternalOrgansLink().click();
		Reporter.log("Selected Internal organs", true);
		
		sc.getFemaleBodyPartsLink().click();
		Reporter.log("Clicked on Female body part Icon", true);
		Thread.sleep(3000);
		
		sc.getStomach().click();
		Reporter.log("clicked on stomach organ", true);
		Thread.sleep(3000);
		
		sc.getIntestinalbleedingCheckbox().click();
		
		sc.getShowDiseaseButton().click();
		
		sc.getIndigestionLink().click();
		
		sc.getHIVECLIAlabtestLink().click();
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		
		lt.getShowmoreLink().click();
		Reporter.log("Clicked on Show more", true);
		Thread.sleep(3000);
		
		lt.getViralscrrenLink().click();
		Reporter.log("clicked on Common Viral screen Test", true);
		Thread.sleep(3000);
		
		lt.getBooknowLink().click();
		Reporter.log("clicked on Book Now button", true);
		
		lt.getTimeslotButton().click();
		Reporter.log("Time slot is selected", true);
		Thread.sleep(5000);
		
		lt.getViewDiagonosticcenterButton().click();
		Reporter.log("Clicked on Diagnostic Center button", true);
		Thread.sleep(5000);
		
		lt.getSelectdate().click();
		Reporter.log("Date is Selected", true);
		Thread.sleep(10000);
		
		lt.getSelecttestLink().click();
		Thread.sleep(3000);
		
		lt.getDeleteIcon().click();
		
		lt.getYesButton().click();
		
		driver.switchTo().window(pid);
	}
}
