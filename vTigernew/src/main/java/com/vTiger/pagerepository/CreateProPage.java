package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class CreateProPage 
{

	@FindBy(name="productname")
	private WebElement productName;
	
	@FindBy(name="productcategory")
	private WebElement productCate;

	@FindBy(name="website")
	private WebElement productWeb;
	
	@FindBy(name="glacct")
	private WebElement productGL;
	
	@FindBy(name="serial_no")
	private WebElement productSN;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement savePro;
	
	
	

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductCate() {
		return productCate;
	}

	public WebElement getProductWeb() {
		return productWeb;
	}

	public WebElement getProductGL() {
		return productGL;
	}

	public WebElement getProductSN() {
		return productSN;
	}

	public WebElement getSavePro() {
		return savePro;
	}
	
	
	
	
	
	public void category(String value)
	{
		Utility.dropDown(productCate, value);
	}
	
	public void pgl(String value)
	{
		Utility.dropDown(productGL, value);
	}
}
