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

public class SymptomsChekerBodyPartMaleDeleteLabTTest extends Base
{
	SymptomsChecker symptoms;
	FileLib fl = new FileLib();

	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("BPMaleDelete");
	}
	@Test(dataProvider = "readData")
	public void bodyPartMaleDeleteLabTest(String BodyPart,String Symptom1,
			String Diseases,String LabTest,String AppointmentDate,String AppointmentTime,String LabTestPage) throws Exception
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
		symptoms.getMaleBodyPartsLink().click();
		Reporter.log("clicked on male body",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//area[@title='"+BodyPart+"']")).click();
		Reporter.log("selected head part",true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='"+Symptom1+"']/span[@class='cr']")).click();
		Reporter.log("selected symptom-->"+Symptom1,true);
		
		
		symptoms.getShowDiseaseButton().click();
		Reporter.log("clicked on show diseases butyon",true);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@id='symptomDtls']//div[text()='"+Diseases+"']")).click();
		Reporter.log("clicked on disease-->"+Diseases,true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'"+LabTest+"')]")).click();
		Reporter.log("clicked on lab test-->"+LabTest,true);
		Set<String> setStr = driver.getWindowHandles();
		Iterator<String> itr = setStr.iterator();
		String pid = itr.next();
		String cid1 = itr.next();
		driver.switchTo().window(cid1);
		Reporter.log("switched to child broser",true);
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[@class='glucose-fasting-block']/h3[contains(text(),'"+LabTestPage+"')]")).getText();
		Assert.assertTrue(text.contains(""+LabTestPage+" "));
		Reporter.log("Labs home page is displayed-->"+LabTestPage,true);
		Thread.sleep(2000);
		symptoms.getBookNowButton().click();
//		driver.findElement(By.xpath("//div[@class='button-right']/a[@class='btn btn-default']/strong")).click();
		Reporter.log("clicked on book now button",true);
		String text1 = driver.findElement(By.xpath("//h4[text()='Book Diagnostic and Pathology Tests']")).getText();
		Assert.assertTrue(text1.contains("Book Diagnostic and Pathology Tests"));
		Reporter.log("Book Diagnostic and Pathology Tests page is displayed",true);
//		Thread.sleep(4000);
//		symptoms.getAppointmentDate().click();
//		Reporter.log("clicked on appointment date",true);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()='"+AppointmentDate+"']")).click();
//		Reporter.log("selected the appointment date-->"+AppointmentDate,true);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+AppointmentTime+"']")).click();
		Reporter.log("selected appointment time-->"+AppointmentTime,true);
		Thread.sleep(2000);
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'You have selected ')]")).getText();
		System.out.println(text2);
		Reporter.log("test date and time successfully added to cart",true);
		
		symptoms.getRemoveButton().click();
		Reporter.log("clicked on remove button",true);
		
		symptoms.getYesbutton().click();
		Reporter.log("clicked on yes button",true);
		
//		String text3 = driver.findElement(By.xpath("//h3[text()='Book Diagnostic and Pathology Tests']")).getText();
		String text3 = driver.getTitle();
		System.out.println(text3);
		Assert.assertTrue(text3.equals("Diagnostic & Pathology Tests, Book Online, Free Home Collection, Centre Visit"));
		Reporter.log("successfully deleted lab test",true);
	}
}
