package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class Contacts 
{
	//elements
		@FindBy(xpath="//img[@title = 'Create Contact...']")
		private WebElement createCon;
		
		@FindBy(xpath="//img[@title = 'Search in Contacts...']")
		private WebElement searchCon;
		
		@FindBy(linkText="First Name")
		private WebElement conFName;
		
		@FindBy(linkText="Last Name")
		private WebElement conLName;
		
		@FindBy(linkText="Title")
		private WebElement conTitle;
		
		@FindBy(linkText="Phone")
		private WebElement conPhone;
		
		@FindBy(linkText="Assigned To")
		private WebElement conAT;
		
		@FindBy(id="viewname")
		private WebElement conFilter;
	
	//getter methods	
		public WebElement getCreateCon() {
			return createCon;
		}

		public WebElement getSearchCon() {
			return searchCon;
		}

		public WebElement getConFName() {
			return conFName;
		}

		public WebElement getConLName() {
			return conLName;
		}

		public WebElement getConTitle() {
			return conTitle;
		}

		public WebElement getConPhone() {
			return conPhone;
		}

		public WebElement getConAT() {
			return conAT;
		}

		public WebElement getConFilter() {
			return conFilter;
		}



	//bussiness logic
		
		public void orgFilter(String value)
		{
			Utility.dropDown(conFilter, value);
		}
	
}
