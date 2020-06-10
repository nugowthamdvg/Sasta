package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class Organisation 
{
	//elements
		@FindBy(xpath="//img[@title = 'Create Organization...']")
		private WebElement createOrg;
		
		@FindBy(xpath="//img[@title = 'Search in Organizations...']")
		private WebElement searchOrg;
		
		@FindBy(linkText="Organization Name")
		private WebElement orgName;
		
		@FindBy(linkText="Billing City")
		private WebElement orgBC;
		
		@FindBy(linkText="Website")
		private WebElement orgWeb;
		
		@FindBy(linkText="Phone")
		private WebElement orgPhone;
		
		@FindBy(linkText="Assigned To")
		private WebElement orgAT;
		
		@FindBy(id="viewname")
		private WebElement orgFilter;
		

	//getter methods
		public WebElement getcreateOrg() {
			return createOrg;
		}

		public WebElement getsearchOrg() {
			return searchOrg;
		}

		public WebElement getorgName() {
			return orgName;
		}

		public WebElement getorgBC() {
			return orgBC;
		}

		public WebElement getorgWeb() {
			return orgWeb;
		}

		public WebElement getorgPhone() {
			return orgPhone;
		}

		public WebElement getorgAT() {
			return orgAT;
		}

		public WebElement getorgFilter() {
			return orgFilter;
		}

	
	//bussiness logic
		
		public void orgFilter(String value)
		{
			Utility.dropDown(orgFilter, value);
		}
	
}
