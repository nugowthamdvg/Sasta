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
import SastaSundar.Pagerepository.RecomProPage;
import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

@Listeners(SastaSundar.genericLib.ListenerImp.class)

public class AddingProductToCartTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	LabTestPage lt;
	RecomProPage pro;
	
	@Test
	public void addProducttoCartTest() throws Exception
	{
		home = PageFactory.initElements(driver, HomePage.class);
		dc = PageFactory.initElements(driver, DietClinicPage.class);
		sc = PageFactory.initElements(driver, SymptomsChecker.class);
		lt = PageFactory.initElements(driver, LabTestPage.class);
		pro = PageFactory.initElements(driver, RecomProPage.class);
		
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
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		
		pro.getNourushtrapro().click();
		Reporter.log("clicked on Nourushtra product", true);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String pids = itr.next();
		String coneids = itr.next();
		String ctwoids = itr.next();
		
		driver.switchTo().window(ctwoids);
		
		pro.getAddtocartButton().click();
		Reporter.log("clicked on Add to Cart button", true);
		Thread.sleep(5000);
		
		pro.getAddmoreButton().click();
		Reporter.log("Increased the number of product", true);
		Thread.sleep(3000);
	
		home.getCartLink().click();
		Reporter.log("clicked on Cart link", true);
		Thread.sleep(10000);
		
		driver.switchTo().window(pid);
		
	}
}
