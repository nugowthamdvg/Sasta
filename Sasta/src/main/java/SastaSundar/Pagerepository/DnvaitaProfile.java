package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DnvaitaProfile 
{
	@FindBy(xpath="//button[.='Edit']")
	private WebElement edit;
	
	@FindBy(xpath="//button[.='ORDER YOUR DNAVITA NOW ']")
	private WebElement orderProduct;
	
	@FindBy(xpath="//i[@class='icon-angle-up']")
	private WebElement incQuantity;
	
	@FindBy(xpath="//button[.='Add to Cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//span[.='Share']")
	private WebElement share;
	
	@FindBy(xpath="//span[@data-network='facebook']")
	private WebElement fbIcon;
	
	@FindBy(xpath="//button[.='PDF ']")
	private WebElement pdf;

	public WebElement getFbIcon() {
		return fbIcon;
	}

	public WebElement getEdit() {
		return edit;
	}

	public WebElement getOrderProduct() {
		return orderProduct;
	}

	public WebElement getIncQuantity() {
		return incQuantity;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getShare() {
		return share;
	}

	public WebElement getPdf() {
		return pdf;
	}
	
	
	
	
	
	
	
}
