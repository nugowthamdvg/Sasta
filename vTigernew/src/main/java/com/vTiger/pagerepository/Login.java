package com.vTiger.pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login 
{
	@FindBy(name="user_name")
	private WebElement usernameTF;
	
	@FindBy(name="user_password")
	private WebElement passwordTF;
	
	@FindBy(id="submitButton")
	private WebElement loginLink;

	public WebElement getusernameTF() 
	{
		return usernameTF;
	}

	public WebElement getpasswordTF() 
	{
		return passwordTF;
	}

	public WebElement getloginLink() 
	{
		return loginLink;
	}
	
	//Business logic	
	public void Loginpage(String username, String password)
	{
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginLink.click();
	}
}
