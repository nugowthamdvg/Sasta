package com.SastaSundar.TestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

public class SymptomsChekerInternalOrgansFemaleTest extends Base
{
	SymptomsChecker organs;
	FileLib fl = new FileLib();
	
	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("IOFemale");
	}
	@Test(dataProvider = "readData")
	public void internalOrgansFemaleTest(String InternalOrgans,String Symptoms,String Diseases,String ReadMore,
			String Header,String LabTest,String DiagonosticCenter,String AppointmentTime) throws Exception
	{
		organs = PageFactory.initElements(driver, SymptomsChecker.class);
		
		organs.getHealthServicesLink().click();
		Reporter.log("clicked on health services link",true);
		
		organs.getSymptomsCheckerLink().click();
		Reporter.log("clicked on symptoms checker link",true);
		Thread.sleep(5000);
		organs.getBodypart().click();
		Reporter.log("clicked on body part",true);
		Thread.sleep(5000);
		organs.getInternalOrgans().click();
		Reporter.log("selected internal organs",true);
		
		driver.findElement(By.linkText(""+InternalOrgans+"")).click();
		Reporter.log("clicked on brains",true);
		Thread.sleep(5000);
		
		organs.getFemaleBodyPartsLink().click();
		Reporter.log("clicked on female image",true);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[text()='"+Symptoms+"']/span[@class='cr']")).click();
		Reporter.log("slecected symptoms",true);
		
		organs.getShowDiseaseButton().click();
		Reporter.log("clicked on show disease button",true);
		
		driver.findElement(By.xpath("//div[text()='"+Diseases+"']")).click();
		Reporter.log("clicked on disease",true);
		
//		organs.getArticlesLink().click();
//		Reporter.log("clicked on articles link",true);
		
		driver.findElement(By.xpath("//strong[text()='"+ReadMore+"']")).click();
		Reporter.log("clicked on read more",true);
		
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//h3[text()='"+Header+"']")).getText();
//		Assert.assertTrue(text.contains("Alcohol Abuse"));
		Reporter.log("read more page displayed",true);
		
		organs.getClose().click();
		Reporter.log("closed the read more popup",true);
		
		driver.findElement(By.xpath("//a[text()='"+LabTest+"']")).click();
		Reporter.log("clicked on the test",true);
		
		Set<String> setStr = driver.getWindowHandles();
		Iterator<String> itr = setStr.iterator();
		String pid = itr.next();
		String cid = itr.next();
		driver.switchTo().window(cid);
		
		organs.getBookNowButton().click();
		Reporter.log("clicked on book now button",true);
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' Friday, 19 June ']")).click();
		driver.findElement(By.xpath("//strong[text()='"+DiagonosticCenter+"']")).click();
		Reporter.log("selected the appointment date");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+AppointmentTime+"']")).click();
		Reporter.log("selected appointment time",true);
		
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'You have selected ')]")).getText();
		System.out.println(text2);
		Reporter.log("test date and time successfully added to cart",true);
	}
}
