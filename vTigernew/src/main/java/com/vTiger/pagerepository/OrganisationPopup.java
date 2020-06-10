package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrganisationPopup 
{
	@FindBy(xpath="//a[@class='listFormHeaderLinks']/ancestor::tr/following-sibling::tr/td/a")
	private WebElement orgName;

	public WebElement getOrgName() {
		return orgName;
	}
	
	
}
