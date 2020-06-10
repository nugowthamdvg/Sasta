package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class Opportunities 
{
	//elements
		@FindBy(xpath="//img[@title = 'Create Opportunity...']")
		private WebElement createOpp;
		
		@FindBy(xpath="//img[@title = 'Search in Opportunities...']")
		private WebElement searchOpp;
		
		@FindBy(linkText="Opportunity Name")
		private WebElement oppName;
		
		@FindBy(linkText="Related To")
		private WebElement oppRT;
		
		@FindBy(linkText="Sales Stage")
		private WebElement oppSS;
		
		@FindBy(linkText="Assigned To")
		private WebElement oppAT;
		
		@FindBy(id="viewname")
		private WebElement oppFilter;
		
	//getter methods
		
		public WebElement getCreateOpp() {
			return createOpp;
		}

		public WebElement getSearchOpp() {
			return searchOpp;
		}

		public WebElement getOppName() {
			return oppName;
		}

		public WebElement getOppRT() {
			return oppRT;
		}

		public WebElement getOppSS() {
			return oppSS;
		}

		public WebElement getOppAT() {
			return oppAT;
		}

		public WebElement getOppFilter() {
			return oppFilter;
		}

	//bussiness logic
		
		public void orgFilter(String value)
		{
			Utility.dropDown(oppFilter, value);
		}

}
