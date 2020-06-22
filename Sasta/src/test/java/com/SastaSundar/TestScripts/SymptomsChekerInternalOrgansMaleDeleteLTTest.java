package com.SastaSundar.TestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.SymptomsChecker;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

public class SymptomsChekerInternalOrgansMaleDeleteLTTest extends Base 
{
	SymptomsChecker organs;
	FileLib fl = new FileLib();
	
	@DataProvider()
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("IOMaleDelete");
	}
	
	
	@Test(dataProvider = "readData")
	public void internalOrgansMaleLabtestTest(String Symptoms,String Diseases,String ReadMore,
			String Header,String LabTest,String AppointmentDate,String AppointmentTime) throws Exception
	{
		organs = PageFactory.initElements(driver, SymptomsChecker.class);
		
		organs.getHealthServicesLink().click();
		Reporter.log("clicked on health services link",true);
		
		organs.getSymptomsCheckerLink().click();
		Reporter.log("clicked on symptoms checker link",true);
		Thread.sleep(3000);
		organs.getBodypart().click();
		Reporter.log("clicked on body part",true);
		Thread.sleep(3000);
		organs.getInternalOrgans().click();
		Reporter.log("selected internal organs",true);
		
		driver.findElement(By.linkText("Brain")).click();
		Reporter.log("clicked on brains",true);
		Thread.sleep(3000);
		
		organs.getMaleBodyPartsLink().click();
		Reporter.log("clicked on Male image",true);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='"+Symptoms+"']/span[@class='cr']")).click();
		Reporter.log("slecected symptoms-->"+Symptoms,true);
		
		organs.getShowDiseaseButton().click();
		Reporter.log("clicked on show disease button",true);
		
		driver.findElement(By.xpath("//div[text()='"+Diseases+"']")).click();
		Reporter.log("clicked on disease-->"+Diseases,true);
		
//		organs.getArticlesLink().click();
//		Reporter.log("clicked on articles link",true);
		
		driver.findElement(By.xpath("//strong[text()='"+ReadMore+"']")).click();
		Reporter.log("clicked on read more",true);
		
		String text = driver.findElement(By.xpath("//h3[text()='"+Header+"']")).getText();
//		Assert.assertTrue(text.contains("Alcohol Abuse"));
		Reporter.log("read more page displayed",true);
		
		Thread.sleep(500);
		organs.getClose().click();
		Reporter.log("closed the read more popup",true);
		
		driver.findElement(By.xpath("//a[text()='"+LabTest+"']")).click();
		Reporter.log("clicked on the test-->"+LabTest,true);
		
		Set<String> setStr = driver.getWindowHandles();
		Iterator<String> itr = setStr.iterator();
		String pid = itr.next();
		String cid = itr.next();
		driver.switchTo().window(cid);
		
		organs.getBookNowButton().click();
		Reporter.log("clicked on book now button",true);
		
//		Thread.sleep(2000);
//		organs.getSelectAppointmentDate().click();
//		Reporter.log("clicked on appointment date",true);
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("//span[text()=' Friday, 19 June ']")).click();
//		driver.findElement(By.xpath("//span[text()=' "+AppointmentDate+" ']")).click();
//		Reporter.log("selected the appointment date-->"+AppointmentDate,true);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+AppointmentTime+"']")).click();
		Reporter.log("selected appointment time-->"+AppointmentTime,true);
		
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'You have selected ')]")).getText();
		System.out.println(text2);
		Reporter.log("test date and time successfully added to cart",true);
		
//		driver.switchTo().window(pid);
//		Reporter.log("switched back to parent browser",true);
		
		organs.getRemoveButton().click();
		Reporter.log("clicked on remove button",true);
		
		organs.getYesbutton().click();
		Reporter.log("clicked on yes button",true);
		
		String text1 = driver.findElement(By.xpath("//h3[text()='Book Diagnostic and Pathology Tests']")).getText();
		System.out.println(text1);
		Reporter.log("successfully deleted lab test",true);
		
	}
}
