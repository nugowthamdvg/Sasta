package com.SastaSundar.TestScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SastaSundar.Pagerepository.ShopByCategory2AddToCart;
import SastaSundar.Pagerepository.ShopByCategoryAddToCart;
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;
import SastaSundar.genericLib.Utility;

public class ShopByCategory2AddToCartTest extends Base 
{
	ShopByCategory2AddToCart add;
	FileLib fl = new FileLib();

	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("shopByCategory2");
	}
	
	@Test(dataProvider = "readData")
	public void addToCart(String category,String subCategory,String requiredProduct,String imgTitle,String verify) throws Exception
	{
		add = PageFactory.initElements(driver, ShopByCategory2AddToCart.class);
		
		Thread.sleep(2000);
		add.shopByCategoryMouseHover(driver);
		Reporter.log("mouse hovered on shop by category",true);
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Baby']/..//span[text()='Baby']/../..//a[text()='Soap & Shampoo']")).click();
		WebElement element = driver.findElement(By.xpath("//li[contains(@class,'add-plus mob-plus ')]/a[text()='"+category+"']"));
		Utility.mouseAction(driver, element);
		Reporter.log("mouse hovered on the product",true);
		
		driver.findElement(By.xpath("//div[contains(@class,'ss-sub')]//a[text()='"+subCategory+"']")).click();
		Reporter.log("clicked on sub product",true);
		
//		add.getViewAllLink().click();
		driver.findElement(By.xpath("//a[text()='View All']/..//h3[text()='"+requiredProduct+"']")).click();
		Reporter.log("clicked on the view all link",true);
		
		Set<String> setStr = driver.getWindowHandles();
		Iterator<String> itr = setStr.iterator();
		String pid = itr.next();
		String cid = itr.next();
		driver.switchTo().window(cid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='group-serch-box']//img[@title='"+imgTitle+"']")).click();
		Reporter.log("clicked on image",true);
		driver.switchTo().window(pid);
		Set<String> setStr1 = driver.getWindowHandles();
		Iterator<String> itr1 = setStr1.iterator();
		String currentPid = itr1.next();
		String currentCid = itr1.next();
		String currentCid1 = itr1.next();
		driver.switchTo().window(currentCid1);
		add.getAddToCartButton().click();
		Reporter.log("clicked on add to cart button",true);
		
		add.getCartLink().click();
		Reporter.log("clicked on cart link",true);
		
		String cartItem = driver.findElement(By.xpath("//a[text()='"+verify+"']")).getText();
		System.out.println(cartItem);
//		Assert.assertEquals(cartItem, " Johnsons Baby Soap 50 g ");
		Reporter.log("product added to cart successfully",true);
		
	}
}
