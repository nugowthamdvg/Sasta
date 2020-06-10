package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Products 
{
	//elements
		@FindBy(xpath="//img[@title = 'Create Product...']")
		private WebElement createPro;
		
		@FindBy(xpath="//img[@title = 'Search in Products...']")
		private WebElement searchPro;
		
		@FindBy(linkText="Product Name")
		private WebElement proName;
		
		@FindBy(linkText="Part Number")
		private WebElement partNum;
		
		@FindBy(linkText="Qty. in Stock")
		private WebElement proQuantity;
		
		@FindBy(linkText="Qty/Unit")
		private WebElement proQpU;
		
		@FindBy(linkText="Unit Price")
		private WebElement proUP;

		
	//getter methods
		public WebElement getCreatePro() {
			return createPro;
		}

		public WebElement getSearchPro() {
			return searchPro;
		}

		public WebElement getProName() {
			return proName;
		}

		public WebElement getPartNum() {
			return partNum;
		}

		public WebElement getProQuantity() {
			return proQuantity;
		}

		public WebElement getProQpU() {
			return proQpU;
		}

		public WebElement getProUP() {
			return proUP;
		}


		
		
}
