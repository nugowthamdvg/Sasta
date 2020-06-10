package com.vTiger.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import com.vTiger.genericLib.Base;
import com.vTiger.genericLib.FileLib;
import com.vTiger.pagerepository.CreateOrgaPage;
import com.vTiger.pagerepository.Home;
import com.vTiger.pagerepository.Organisation;

@Listeners(com.vTiger.genericLib.ListenerImp.class)
public class TestScript1 extends Base
{
	
	FileLib lib = new FileLib();
	Home home;
	Organisation org;
	CreateOrgaPage corg;  
	
	@Test
	public void createOrganisationTest1() throws InterruptedException
	{
		home = PageFactory.initElements(driver, Home.class);
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);
		
		org = PageFactory.initElements(driver, Organisation.class);
		org.getcreateOrg().click();
		Reporter.log("Clicked on Create Organisation Icon",true);
		
		corg = PageFactory.initElements(driver, CreateOrgaPage.class);
		corg.getOrganisationName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 1, 0));
		Reporter.log("Organisation Name is Entered",true);
		
		corg.getOrganisationWeb().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),1, 1));
		Reporter.log("Organisation Website is Entered",true);
		
		corg.getOrganisationPhone().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 1, 2));
		Reporter.log("Organisation Phone Number is Entered",true);
		
		corg.getBillCity().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 1, 3));
		Reporter.log("Organisation Billing City is Entered",true);
		
		corg.industry(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),1, 4));
		Reporter.log("Organisation Industry Type is Selected",true);
		
		corg.getsaveOrg().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);
		
	}
	
	@Test
	public void createOrganisationTest2() throws InterruptedException
	{
		
		home = PageFactory.initElements(driver, Home.class);
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);
		
		org = PageFactory.initElements(driver, Organisation.class);
		org.getcreateOrg().click();
		Reporter.log("Clicked on Create Organisation Icon",true);
		
		corg = PageFactory.initElements(driver, CreateOrgaPage.class);
		corg.getOrganisationName().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 2, 0));
		Reporter.log("Organisation Name is Entered",true);
		
		corg.getOrganisationWeb().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),2, 1));
		Reporter.log("Organisation Website is Entered",true);
		
		corg.getOrganisationPhone().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 2, 2));
		Reporter.log("Organisation Phone Number is Entered",true);
		
		corg.getBillCity().sendKeys(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"), 2, 3));
		Reporter.log("Organisation Billing City is Entered",true);
		
		corg.industry(lib.getSpecifiedDataFromExcelFile(lib.getDataFromPrpoertyFile("Sheet1"),2, 4));
		Reporter.log("Organisation Industry Type is Selected",true);
		
		corg.getsaveOrg().click();
		Reporter.log("Clicked on Save Button",true);
		Thread.sleep(10000);
		
		home.getorgLink().click();
		Reporter.log("Clicked on Organisation Link",true);

	}
		
	
	
}
