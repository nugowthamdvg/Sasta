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

public class SymptomsChekerBodyPartFemaleTest extends Base 
{
	SymptomsChecker symptoms;
	FileLib fl = new FileLib();
	
	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("BPFemale");
	}
	@Test(dataProvider = "readData")
	public void bodyPartFemaleTest(String BodyPart,String Symptom1,String Symptom2,String Symptom3,String Symptom4,String Symptom5,
			String Diseases,
			String LabTest,String AppointmentDate,String AppointmentTime,String LabTestPage) throws Exception
	{
		symptoms = PageFactory.initElements(driver, SymptomsChecker.class);
		Thread.sleep(2000);
		symptoms.getHealthServicesLink().click();
		Reporter.log("clicked on health services link",true);
		Thread.sleep(2000);
		symptoms.getSymptomsCheckerLink().click();
		Reporter.log("clicked on symptoms checker",true);
//		Thread.sleep(5000);
//		symptoms.getSelectBodyPartsLink().click();
//		Reporter.log("clicked on body parts link",true);
		Thread.sleep(2000);
		symptoms.getFemaleBodyPartsLink().click();
		Reporter.log("clicked on female body",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+BodyPart+"']")).click();
		Reporter.log("selected head part",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='"+Symptom1+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom1",true);
		driver.findElement(By.xpath("//label[text()='"+Symptom2+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom2",true);
		driver.findElement(By.xpath("//label[text()='"+Symptom3+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom3",true);
		driver.findElement(By.xpath("//label[text()='"+Symptom4+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom4",true);
		driver.findElement(By.xpath("//label[text()='"+Symptom5+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom5",true);
		
		symptoms.getShowDiseaseButton().click();
		Reporter.log("clicked on show diseases butyon",true);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='symptomDtls']//div[text()='"+Diseases+"']")).click();
		Reporter.log("clicked on disease",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'"+LabTest+"')]")).click();
		Reporter.log("clicked on lab test",true);
		Set<String> setStr = driver.getWindowHandles();
		Iterator<String> itr = setStr.iterator();
		String pid = itr.next();
		String cid1 = itr.next();
		driver.switchTo().window(cid1);
		Reporter.log("switched to child broser",true);
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='glucose-fasting-block']/h3[contains(text(),'"+LabTestPage+"')]")).getText();
		Assert.assertTrue(text.contains(""+LabTestPage+" "));
		Reporter.log("Labs home page is displayed",true);
		Thread.sleep(2000);
		symptoms.getBookNowButton().click();
//		driver.findElement(By.xpath("//div[@class='button-right']/a[@class='btn btn-default']/strong")).click();
		Reporter.log("clicked on book now button",true);
		String text1 = driver.findElement(By.xpath("//h4[text()='Book Diagnostic and Pathology Tests']")).getText();
		Assert.assertTrue(text1.contains("Book Diagnostic and Pathology Tests"));
		Reporter.log("Book Diagnostic and Pathology Tests page is displayed",true);
		Thread.sleep(2000);
		symptoms.getAppointmentDate().click();
		Reporter.log("clicked on appointment date",true);
		driver.findElement(By.xpath("//span[text()=' "+AppointmentDate+" ']")).click();
		Reporter.log("selected the appointment date");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+AppointmentTime+"']")).click();
		Reporter.log("selected appointment time",true);
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'You have selected ')]")).getText();
		System.out.println(text2);
		Reporter.log("test date and time successfully added to cart",true);
		
//		driver.switchTo().window(pid);
//		Reporter.log("switched back to parent browser",true);
	}
}
