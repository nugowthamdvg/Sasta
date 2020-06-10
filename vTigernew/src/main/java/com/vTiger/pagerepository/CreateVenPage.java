package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class CreateVenPage 
{
	@FindBy(name="vendorname")
	private WebElement vendorName;
	
	@FindBy(name="email")
	private WebElement vendorMail;

	@FindBy(name="phone")
	private WebElement vendorPhone;
	
	@FindBy(name="website")
	private WebElement vendorWeb;
	
	@FindBy(name="glacct")
	private WebElement vendorGL;
	
	@FindBy(name="pobox")
	private WebElement vendorPO;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveVen;

	public WebElement getVendorName() {
		return vendorName;
	}

	public WebElement getVendorMail() {
		return vendorMail;
	}

	public WebElement getVendorPhone() {
		return vendorPhone;
	}

	public WebElement getVendorWeb() {
		return vendorWeb;
	}

	public WebElement getVendorGL() {
		return vendorGL;
	}

	public WebElement getVendorPO() {
		return vendorPO;
	}

	public WebElement getSaveVen() {
		return saveVen;
	}
	
	
	
	public void vgl(String value)
	{
		Utility.dropDown(vendorGL, value);
	}
}
