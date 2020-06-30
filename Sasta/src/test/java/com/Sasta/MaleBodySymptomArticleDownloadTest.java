package com.Sasta;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.DietClinicPage;
import SastaSundar.Pagerepository.HomePage;
import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

@Listeners(SastaSundar.genericLib.ListenerImp.class)

public class MaleBodySymptomArticleDownloadTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	
	@Test
	public void ArticleDownloadTest() throws Exception
	{
		home = PageFactory.initElements(driver, HomePage.class);
		dc = PageFactory.initElements(driver, DietClinicPage.class);
		sc = PageFactory.initElements(driver, SymptomsChecker.class);
		
		home.getDietclinicLink().click();
		Reporter.log("clicked on Dietclinic link", true);
		
		dc.getHealtharticlesLink().click();
		Reporter.log("clicked on health article link", true);
		
		dc.getSymptomcheckerLink().click();
		Reporter.log("clicked on symptom checker link", true);
		Thread.sleep(3000);
		
		sc.getFingerPart().click();
		Reporter.log("clicked on Finger part", true);
		Thread.sleep(3000);
		
		sc.getSwellingCheckbox().click();
		Reporter.log("clicked on symptom Swelling", true);
		Thread.sleep(3000);
		
		sc.getShowDiseaseButton().click();
		Reporter.log("clicked on Show Disease Button", true);
		
		sc.getCongenitalheartdiseaseLink().click();
		Reporter.log("clicked on Disease link", true);
		
		sc.getReadmoreLink().click();
		Reporter.log("clicked on Read more button", true);
		Thread.sleep(5000);
		
		sc.getDownloadpdfLink().click();
		Reporter.log("clicked on pdf icon to download", true);
		Thread.sleep(10000);
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		Thread.sleep(3000);
		
		driver.close();
		
		driver.switchTo().window(pid);
		
		sc.getClosepopupicon().click();
		Reporter.log("clicked on close popup icon", true);
		
	}
		
}
