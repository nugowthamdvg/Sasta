package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecomProPage 
{
	@FindBy(xpath="//a[@class=\"carousel-block\"]//div[.='Nourishtra Omega 3 Soft Gels 60 Pcs']")
	private WebElement nourushtrapro;
	
	@FindBy(xpath="//div[@id=\"prod_block_22435\"]//a[.='Add to Cart']")
	private WebElement addtocartButton;
	
	@FindBy(xpath="//button[@action=\"added\"]//i[@class=\"icon-plus2\"]")
	private WebElement addmoreButton;
	
	@FindBy(xpath="//a[.='Save For Later']")
	private WebElement savelaterButton;
	
	@FindBy(xpath="//a[.='Save For Later']/preceding-sibling::a[.='Remove']")
	private WebElement removeButton;

	@FindBy(xpath="//span[.='Ok']")
	private WebElement okButton;
	
	public WebElement getSavelaterButton() {
		return savelaterButton;
	}

	public WebElement getRemoveButton() {
		return removeButton;
	}

	public WebElement getOkButton() {
		return okButton;
	}

	public WebElement getNourushtrapro() {
		return nourushtrapro;
	}

	public WebElement getAddtocartButton() {
		return addtocartButton;
	}

	public WebElement getAddmoreButton() {
		return addmoreButton;
	}
	
}

