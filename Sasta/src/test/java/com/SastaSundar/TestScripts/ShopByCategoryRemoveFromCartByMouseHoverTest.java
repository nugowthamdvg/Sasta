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
import SastaSundar.genericLib.Base;
import SastaSundar.genericLib.FileLib;
import SastaSundar.genericLib.Utility;

public class ShopByCategoryRemoveFromCartByMouseHoverTest extends Base
{

	ShopByCategory2AddToCart add;
	FileLib fl = new FileLib();

	@DataProvider
	public Object[][] readData()
	{
		return fl.getAllDataFromExcelFile("shopByCategoryMouseHoverDelete");
	}
	
	@Test(dataProvider = "readData")
	public void removeFromCartTest(String category,String subCategory,String requiredProduct,String imgTitle,String verify) throws Exception
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
//		Assert.assertTrue(cartItem.contains(" Johnsons Baby Soap 50 g "));
		Reporter.log("product added to cart successfully",true);
		
//		add.getRemoveLink().click();
		driver.findElement(By.xpath("//a[text()='"+verify+"']/../../../..//div[@class='removeSFL']/a[text()='Remove']")).click();
		Reporter.log("clicked on remove link",true);
		
		add.getOkButton().click();
		Reporter.log("product removed from the cart",true);
		
		String text = driver.findElement(By.xpath("//h2[text()='Search & Select Medicines you want to Order']")).getText();
		Assert.assertEquals(text, "Search & Select Medicines you want to Order");
		Reporter.log("product removed successfully from the cart",true);
	}
}
