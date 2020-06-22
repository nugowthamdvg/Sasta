package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopByCategoryAddToCart
{
	@FindBy(xpath = "//span[text()='Shop by Category']")
	WebElement shopByCategoryLink;
	
	@FindBy(linkText = " ADD")
	WebElement addButton;
	
	@FindBy(linkText = "Add to Cart")
	WebElement addToCartButton;
	
	@FindBy(id = "shopping_cart_item_count")
	WebElement carItemCounttLink;

	@FindBy(xpath = "//a[text()='  Cart']")
	WebElement cartLink;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;
	
	@FindBy(xpath = "//h2[text()='Search & Select Medicines you want to Order']")
	WebElement config;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement checkOutButton;
	
	
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	public WebElement getConfig() {
		return config;
	}
	public WebElement getOkButton() {
		return okButton;
	}
	
	public WebElement getShopByCategoryLink() {
		return shopByCategoryLink;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getCarItemCounttLink() {
		return carItemCounttLink;
	}

	public WebElement getCartLink() {
		return cartLink;
	}

	
	
	
//	@FindBy(linkText = "Face Mask, Sanitizers & Essentials")
//	WebElement face;
//	
//	@FindBy(linkText = "Face Mask & Shield")
//	WebElement faceMask;
	
}
