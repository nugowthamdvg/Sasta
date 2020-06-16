package com.Sasta;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.HomePage;
import SastaSundar.genericLib.Base;

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
