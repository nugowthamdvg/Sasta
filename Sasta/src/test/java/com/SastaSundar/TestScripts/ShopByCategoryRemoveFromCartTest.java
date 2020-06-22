package com.SastaSundar.TestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.ShopByCategory2AddToCart;
import SastaSundar.Pagerepository.ShopByCategoryAddToCart;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

public class ShopByCategoryRemoveFromCartTest extends Base {
	
	ShopByCategoryAddToCart addToCart;
	FileLib fl = new FileLib();

	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("shopByCategoryDelete");
	}
	
	@Test(dataProvider = "readData")
	public void AddProductToCartTest(String houseHoldSupplies,String subCategory,String prodName,String verify) throws Exception
	{
		addToCart = PageFactory.initElements(driver, ShopByCategoryAddToCart.class);

		Thread.sleep(3000);
		addToCart.getShopByCategoryLink().click();
		Reporter.log("clicked on Shop By Category link",true);

		driver.findElement(By.linkText(""+houseHoldSupplies+"")).click();
		Reporter.log("clicked Face Mask, Sanitizers & Essentials",true);

		//		Set<String> setStr = driver.getWindowHandles();
		//		System.out.println(setStr.size());
		//		Iterator<String> itr = setStr.iterator();
		//		String pid = itr.next();
		//		String cid1 = itr.next();
		//		driver.switchTo().window(cid1);

		driver.findElement(By.linkText(""+subCategory+"")).click();
		Reporter.log("clicked on Face Mask & Shield",true);

		Set<String> setStr1 = driver.getWindowHandles();
		System.out.println(setStr1.size());
		Iterator<String> itr1 = setStr1.iterator();
		String pid1 = itr1.next();
		//		String maskcid1 = itr1.next();
		String maskcid2 = itr1.next();

		driver.switchTo().window(maskcid2);

		Thread.sleep(4000);
		//		addToCart.getAddButton().click();
		driver.findElement(By.xpath("//div[contains(@class,'col-md-')]/a[@displayname='"+prodName+"']")).click();
		Reporter.log("clicked on add button",true);

		addToCart.getCartLink().click();
		Reporter.log("clicked on cart link",true);

		String actual = driver.findElement(By.xpath("//a[text()='"+verify+"']")).getText();
		System.out.println(actual);
		//		Assert.assertEquals(actual, " Venus Face Mask Yellow V-44++ FFP1S Stapled Flat Fold C 1 Piece ");
		Reporter.log("product added to cart successfully",true);

		driver.findElement(By.xpath("//a[text()='"+verify+"']/../../../..//div[@class='removeSFL']/a[text()='Remove']")).click();
		Reporter.log("clicked on remove link",true);

		addToCart.getOkButton().click();
		Reporter.log("clicked on ok button",true);

		String text = addToCart.getConfig().getText();
		System.out.println(text);

	}
}
