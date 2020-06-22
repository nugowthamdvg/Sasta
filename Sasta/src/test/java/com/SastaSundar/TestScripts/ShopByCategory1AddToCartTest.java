package com.SastaSundar.TestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.ShopByCategoryAddToCart;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;

public class ShopByCategory1AddToCartTest extends Base
{
	ShopByCategoryAddToCart addToCart;
	FileLib fl = new FileLib();

	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("shopByCategory");
	}
	
	@Test(dataProvider = "readData")
	public void AddProductToCartTest(String houseHoldSupplies,String subCategory,String prodName,String verify) throws Exception
	{
		addToCart = PageFactory.initElements(driver, ShopByCategoryAddToCart.class);

		Thread.sleep(3000);
		addToCart.getShopByCategoryLink().click();
		Reporter.log("clicked on Shop By Category link",true);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText(""+houseHoldSupplies+"")).click();
		Reporter.log("clicked -->"+houseHoldSupplies,true);
		
//		Set<String> setStr = driver.getWindowHandles();
//		System.out.println(setStr.size());
//		Iterator<String> itr = setStr.iterator();
//		String pid = itr.next();
//		String cid1 = itr.next();
//		driver.switchTo().window(cid1);
		Thread.sleep(2000);
		driver.findElement(By.linkText(""+subCategory+"")).click();
		Reporter.log("clicked on -->"+subCategory,true);
		
		Set<String> setStr1 = driver.getWindowHandles();
		System.out.println(setStr1.size());
		Iterator<String> itr1 = setStr1.iterator();
		String pid1 = itr1.next();
//		String maskcid1 = itr1.next();
		String maskcid2 = itr1.next();
		
		driver.switchTo().window(maskcid2);
		Thread.sleep(2000);
//		addToCart.getAddButton().click();
		driver.findElement(By.xpath("//div[contains(@class,'col-md-')]/a[@displayname='"+prodName+"']")).click();
		Reporter.log("clicked on add button",true);
		
		addToCart.getCartLink().click();
		Reporter.log("clicked on cart link",true);
		
//		Thread.sleep(400);
//		addToCart.getCheckOutButton().click();
//		Reporter.log("clicked on check out button",true);
		
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//a[text()='"+verify+"']")).getText();
		System.out.println(actual);
//		Assert.assertEquals(actual, " Venus Face Mask Yellow V-44++ FFP1S Stapled Flat Fold C 1 Piece ");
		Reporter.log("product added to cart successfully",true);
		
		
		
//		driver.findElement(By.xpath("(//img[contains(@title,'Face Mask')])[1]")).click();
//		Reporter.log("clicked on Face Mask & Shield image",true);
//		Thread.sleep(5000);
//		addToCart.getAddToCartButton().click();
//		Reporter.log("clicked on add to cart button",true);
//		
//		addToCart.getCartLink().click();
//		Reporter.log("Clicked on cart link",true);
//		
//		String actul = driver.findElement(By.xpath("//a[contains(text(),'Face Mask')]")).getText();
//		
//		Assert.assertTrue(actul.contains("Face Mask"));
//		Reporter.log("Item is added to cart successfully ",true);
	}
}
