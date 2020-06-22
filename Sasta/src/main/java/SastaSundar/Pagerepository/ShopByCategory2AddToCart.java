package SastaSundar.Pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import SastaSundar.genericLib.Utility;

public class ShopByCategory2AddToCart 
{
	@FindBy(xpath = "//span[text()='Shop by Category']")
	WebElement shopByCategory;

	@FindBy(linkText = "View All")
	WebElement viewAllLink;
	
	@FindBy(xpath = "//a[text()='Add to Cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath = "//a[@id='js_cartlink']")
	WebElement cartLink;
	
	@FindBy(xpath = "//a[text()=' Johnsons Baby Soap 50 g ']/../../../..//div[@class='removeSFL']/a[text()='Remove']")
					//a[text()=' Johnsons Baby Shampoo 100 ml ']/../../../..//div[@class='removeSFL']/a[text()='Remove']
	WebElement removeLink;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;
	
	

	public WebElement getOkButton() {
		return okButton;
	}

	public WebElement getRemoveLink() {
		return removeLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	public WebElement getViewAllLink() {
		return viewAllLink;
	}

	public WebElement getShopByCategory() {
		return shopByCategory;
	}
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	//business logic
	public void shopByCategoryMouseHover(WebDriver driver)
	{
		Utility.mouseAction(driver, getShopByCategory());
	}
	
}
