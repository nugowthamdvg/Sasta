package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class CreateOrgaPage 
{
	@FindBy(name="accountname")
	private WebElement organisationName;
	
	@FindBy(name="website")
	private WebElement organisationWeb;
	
	@FindBy(name="phone")
	private WebElement organisationPhone;
	
	@FindBy(name="bill_city")
	private WebElement billCity;
	
	@FindBy(name="industry")
	private WebElement orgnisationIndustry;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveOrg;
	

	public WebElement getOrganisationName() {
		return organisationName;
	}
	
	public WebElement getOrganisationWeb() {
		return organisationWeb;
	}

	public WebElement getOrganisationPhone() {
		return organisationPhone;
	}

	public WebElement getBillCity() {
		return billCity;
	}

	public WebElement getOrgnisationIndustry() {
		return orgnisationIndustry;
	}
	
	public WebElement getsaveOrg() {
		return saveOrg;
	}
	
	
	public void industry(String value)
	{
		Utility.dropDown(orgnisationIndustry, value);
	}
}
