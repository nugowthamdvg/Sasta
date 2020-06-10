package com.vTiger.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.vTiger.genericLib.Utility;

public class Home 
{
	// elements
		@FindBy(xpath="//img[contains(@src,'Home.PNG')]")
		private WebElement homeIcon;
	
		@FindBy(linkText="Organizations")
		private WebElement orgLink;
		
		@FindBy(linkText="Contacts")
		private WebElement contactLink;
		
		@FindBy(linkText="Opportunities")
		private WebElement oppoLink;
		
		@FindBy(linkText="Products")
		private WebElement productLink;
		
		@FindBy(linkText="More")
		private WebElement moreLink;
		
		@FindBy(linkText="Vendors")
		private WebElement vendorsLink;
		
		@FindBy(xpath="//img[contains(@src,'user.PNG')]")
		private WebElement userIcon;
		
		@FindBy(linkText="Sign Out")
		private WebElement logoutLink;

	
	
	
	// getter methods
		public WebElement gethomeIcon() {
			return homeIcon;
		}
		
		public WebElement getorgLink() {
			return orgLink;
		}
	
		public WebElement getcontactLink() {
			return contactLink;
		}
	
		public WebElement getoppoLink() {
			return oppoLink;
		}
	
		public WebElement getproductLink() {
			return productLink;
		}
	
		public WebElement getmoreLink() {
			return moreLink;
		}
	
		public WebElement getvendorsLink() {
			return vendorsLink;
		}
	
		public WebElement getuserIcon() {
			return userIcon;
		}
	
		public WebElement getlogoutLink() {
			return logoutLink;
		}

	
	
	//business logic
		
		public void signout(WebDriver driver)
		{
			Utility.mouseAction(driver, userIcon);
			logoutLink.click();
		}

		public void goToVendor(WebDriver driver)
		{
			Utility.mouseAction(driver, moreLink);
			vendorsLink.click();
		}
	
	
}
