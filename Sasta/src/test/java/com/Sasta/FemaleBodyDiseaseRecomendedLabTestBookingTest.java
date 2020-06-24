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

public class FemaleBodyDiseaseRecomendedLabTestBookingTest extends Base
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
		Thread.sleep(3000);

		sc.getSelectInternalOrgansLink().click();
		Reporter.log("Selected Internal organs", true);
		
		sc.getFemaleBodyPartsLink().click();
		Thread.sleep(3000);
		
		sc.getHeart().click();
		Reporter.log("clicked on heart organ", true);
		Thread.sleep(3000);
		
		sc.getANheartrhythmCheckbox().click();
		Reporter.log("clicked on symptom checkbox", true);
		Thread.sleep(3000);
		
		sc.getShowDiseaseButton().click();
		Reporter.log("clicked on Show Disease Button", true);
		
		sc.getCongenitalheartdiseaseLink().click();
		Reporter.log("clicked on Disease link", true);
		
		sc.getLabtestLink().click();
		Reporter.log("clicked on LabTest", true);
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		
		lt.getECGlabtestLink().click();
		Reporter.log("clicked on ECG Test", true);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String pids = itr.next();
		String coneids = itr.next();
		String ctwoids = itr.next();
		
		driver.switchTo().window(ctwoids);
		
		lt.getBooknowButton().click();
		Reporter.log("clicked on Book Now button", true);
		Thread.sleep(3000);
		
		lt.getSelectdate().click();
		Reporter.log("Date is Selected", true);
		Thread.sleep(10000);
		
		lt.getSelecttestLink().click();
		Thread.sleep(3000);
		
		lt.getDeleteIcon().click();
		
		lt.getYesButton().click();
		
		driver.switchTo().window(pids);
	}
}
