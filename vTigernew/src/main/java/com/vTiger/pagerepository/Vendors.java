package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Vendors 
{
	//elements
		@FindBy(xpath="//img[@title = 'Create Vendor...']")
		private WebElement createVen;
		
		@FindBy(xpath="//img[@title = 'Search in Vendors...']")
		private WebElement searchVen;
		
		@FindBy(linkText="Vendor Name")
		private WebElement venName;
		
		@FindBy(linkText="Email")
		private WebElement venEmail;
		
		@FindBy(linkText="Phone")
		private WebElement venPhone;
		
		@FindBy(linkText="Category")
		private WebElement venCate;

		
	//getter methods
		public WebElement getCreateVen() {
			return createVen;
		}

		public WebElement getSearchVen() {
			return searchVen;
		}

		public WebElement getVenName() {
			return venName;
		}

		public WebElement getVenEmail() {
			return venEmail;
		}

		public WebElement getVenPhone() {
			return venPhone;
		}

		public WebElement getVenCate() {
			return venCate;
		}
	
}
