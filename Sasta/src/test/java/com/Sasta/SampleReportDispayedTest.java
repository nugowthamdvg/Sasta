package com.Sasta;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import SastaSundar.Pagerepository.DietClinicPage;
import SastaSundar.Pagerepository.HomePage;
import SastaSundar.Pagerepository.LabTestPage;
import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

@Listeners(SastaSundar.genericLib.ListenerImp.class)

public class SampleReportDispayedTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	LabTestPage lt;
	
	@Test
	public void reportDisplyTest() throws Exception
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
		Reporter.log("clicked on Female body part Icon", true);
		
		sc.getFingerPart().click();
		Reporter.log("clicked on Finger part", true);
		
		sc.getSwellingCheckbox().click();
		Reporter.log("clicked on symptom checkbox", true);
		
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
		
		sc.getViewsamplereportLink().click();
		Reporter.log("clicked on View sample report", true);
		Thread.sleep(10000);
	
		String s = driver.getTitle();
		System.out.println(s);
		
		SoftAssert sft = new SoftAssert(); // for major and minor bugs
		sft.assertEquals(s, "CARDIAC_PROFILE.pdf");
		
		
		driver.switchTo().window(pid);
		
		sft.assertAll();
	}
}
