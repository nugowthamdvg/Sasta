package com.Sasta;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.DnavitaPage;
import SastaSundar.Pagerepository.DnvaitaProfile;
import SastaSundar.Pagerepository.HomePage;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

public class EditDnavitaHealthProfileTest extends Base
{
	FileLib lib = new FileLib();
	HomePage home;
	DnavitaPage dp;
	DnvaitaProfile dpro;
	
	@Test
	public void EditTest() throws Exception
	{
		home = PageFactory.initElements(driver, HomePage.class);
		home.dnavitaHP(driver);
		Reporter.log("Dnavita Health Profile page opened", true);
		
		dp = PageFactory.initElements(driver, DnavitaPage.class);
		dp.getAddNewInput().click();
		Reporter.log("clicked on Add new Input button", true);
		
		dp.getSearchFmem().sendKeys(lib.getDataFromPrpoertyFile("Fmemb"));
		Reporter.log("Searched for familymember", true);
		
		dp.getSelFmem().click();
		Reporter.log("Selected the required family member", true);
		
		dp.getCmCheckbox().click();
		Reporter.log("clicked on Centimeter checkbox", true);
		
		dp.selectHgt(lib.getSpecifiedDataFromExcelFile("Data", 1, 0));
		Reporter.log("Height is entered", true);
		
		dp.getWeight().clear();
		dp.getWeight().sendKeys(lib.getDataFromPrpoertyFile("KG"));
		Reporter.log("Kg is entered", true);
		
		dp.getAcptPro().click();
		Reporter.log("clicked on submit profile Button", true);
		
		List<WebElement> ele = dp.getNoneCheck();
		for (WebElement we : ele) 
		{
			we.click();
			Thread.sleep(2000);
		}
		Reporter.log("clicked on none checkboxes", true);
		
		List<WebElement> ele1 = dp.getNextButton();
		for (WebElement we : ele1) 
		{
			we.click();
			Thread.sleep(5000);
		}
		Reporter.log("clicked on next buttons", true);
		
		dp.selectFh(lib.getSpecifiedDataFromExcelFile("Data", 3, 1));
		Thread.sleep(5000);
		Reporter.log("selected the Food habit", true);
		
		dp.getSubmit().click();
		Reporter.log("clicked on Submit button", true);
		
		dpro = PageFactory.initElements(driver, DnvaitaProfile.class);
		dpro.getEdit().click();
		Reporter.log("clicked on Edit buttons", true);
		Thread.sleep(10000);
		
	}
}
