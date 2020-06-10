package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class CreateOppPage 
{
	@FindBy(name="potentialname")
	private WebElement opportunityName;
	
	@FindBy(name="opportunity_type")
	private WebElement opportunityType;

	@FindBy(name="sales_stage")
	private WebElement opportunitySale;
	
	@FindBy(name="amount")
	private WebElement opportunityAmount;
	
	@FindBy(xpath="//img[contains(@src,'select.gif')]")
	private WebElement addOrg;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOppo;

	
	
	public WebElement getopportunityName() {
		return opportunityName;
	}

	public WebElement getopportunityType() {
		return opportunityType;
	}

	public WebElement getopportunitySale() {
		return opportunitySale;
	}

	public WebElement getopportunityAmount() {
		return opportunityAmount;
	}
	
	public WebElement getaddOrg() {
		return addOrg;
	}

	public WebElement getSaveOppo() {
		return saveOppo;
	}
	
	
	
	
	public void type(String value)
	{
		Utility.dropDown(opportunityType, value);
	}
	
	public void sStage(String value)
	{
		Utility.dropDown(opportunitySale, value);
	}
}
