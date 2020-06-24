package com.Sasta;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.DietClinicPage;
import SastaSundar.Pagerepository.DocAppoPage;
import SastaSundar.Pagerepository.HomePage;
import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

@Listeners(SastaSundar.genericLib.ListenerImp.class)

public class BookingDoctorAppointmentTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DietClinicPage dc;
	SymptomsChecker sc;
	DocAppoPage dp;
	
	@Test
	public void BookAppointmentTest() throws Exception
	{
		home = PageFactory.initElements(driver, HomePage.class);
		dc = PageFactory.initElements(driver, DietClinicPage.class);
		sc = PageFactory.initElements(driver, SymptomsChecker.class);
		dp = PageFactory.initElements(driver, DocAppoPage.class);
		
		home.getDietclinicLink().click();
		Reporter.log("clicked on Dietclinic link", true);
		
		dc.getHealtharticlesLink().click();
		Reporter.log("clicked on health article link", true);
		
		dc.getSymptomcheckerLink().click();
		Reporter.log("clicked on symptom checker link", true);
		Thread.sleep(3000);
		
		sc.getNosePart().click();
		Reporter.log("clicked on Nose part", true);
		Thread.sleep(3000);
		
		sc.getCongestionCheckbox().click();
		Reporter.log("clicked on symptom checkbox", true);
		Thread.sleep(3000);
		
		sc.getShowDiseaseButton().click();
		Reporter.log("clicked on show disease button", true);
		
		sc.getSinusitisLink().click();
		Reporter.log("clicked on disease", true);
		Thread.sleep(3000);
		
		sc.getDoctorIcon().click();
		Reporter.log("clicked on Doctor icon", true);
		Thread.sleep(3000);
		
		sc.getDocclickhereLink().click();
		Reporter.log("clicked on Click here button", true);
		
		Set<String> id = driver.getWindowHandles();
		Iterator<String> i = id.iterator();
		String pid = i.next();
		String coneid = i.next();
		
		driver.switchTo().window(coneid);
		
		dp.getSearchSpecialist().sendKeys(lib.getDataFromPrpoertyFile("SearchFor"),Keys.ENTER);
		Reporter.log("Searched for specialist", true);
		Thread.sleep(5000);
		
		dp.getSearchLoc().sendKeys(lib.getDataFromPrpoertyFile("Location"),Keys.ENTER);
		Reporter.log("searched for location", true);
		Thread.sleep(5000);
		
		dp.getAmrimedInfo().click();
		Reporter.log("clicked on view more button", true);
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for (int j = 0; j < 8; j++) 
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);
		}
		Thread.sleep(3000);
		
		dp.getBookAppointment().click();
		Reporter.log("clicked on Book Appointment button", true);
		
		dp.getSelectDate().click();
		Reporter.log("Date is selected", true);
		Thread.sleep(3000);
		
		dp.getSelectTime().click();
		Reporter.log("Time slot selected", true);
		
		dp.getCancel().click();
		Reporter.log("clicked on cancel button", true);
		Thread.sleep(10000);
		
		
		driver.switchTo().window(pid);
	}
}
