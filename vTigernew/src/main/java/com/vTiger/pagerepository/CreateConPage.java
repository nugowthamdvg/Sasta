package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class CreateConPage 
{
	@FindBy(name="salutationtype")
	private WebElement contactSalutation;
	
	@FindBy(name="firstname")
	private WebElement contactFN;

	@FindBy(name="lastname")
	private WebElement contactLN;
	
	@FindBy(name="mobile")
	private WebElement contactMobile;
	
	@FindBy(name="mailingpobox")
	private WebElement contactPO;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveCon;

	public WebElement getContactSalutation() {
		return contactSalutation;
	}

	public WebElement getContactFN() {
		return contactFN;
	}

	public WebElement getContactLN() {
		return contactLN;
	}

	public WebElement getContactMobile() {
		return contactMobile;
	}

	public WebElement getContactPO() {
		return contactPO;
	}

	public WebElement getSaveCon() {
		return saveCon;
	}
	
	
	public void salutation(String value)
	{
		Utility.dropDown(contactSalutation, value);
	}
}
