package com.SastaSundar;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SastaSundar.Pagerepository.HomePage;
import com.SastaSundar.genericLib.Base;

public class Ts1 extends Base
{
	HomePage home;
	
	@Test
	public void test()
	{
		home = PageFactory.initElements(driver, HomePage.class);
		home.dnavitaHP(driver);
	}
}
