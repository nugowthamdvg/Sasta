package SastaSundar.Pagerepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderMedicine_AddToCart 
{
	@FindBy(xpath = "//a[text()=' Order Medicine']")
	WebElement  orderMedicineLink;
	
	@FindBy(name = "productsearch")
	WebElement productsearchTF;

	@FindBy(xpath = "//em[contains(text(),'Showing Results for')]")
	WebElement showingResults;
	
	@FindBy(xpath = "//span[text()='Add']")
	WebElement addButton;
	
	@FindBy(xpath = "//i[@class='icon-delete']")
	WebElement deleteButton;
	
	@FindBy(xpath = "//span[contains(text(),'Are you sure to remove')]")
	WebElement remove;
	
	@FindBy(xpath = "//span[text()='Ok']")
	WebElement okButton;
	
	@FindBy(xpath = "//span[text()='cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//h2[text()='Search & Select Medicines you want to Order']")
	WebElement verifying;
	
	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement checkOutButton;
	
	public WebElement getVerifying() {
		return verifying;
	}
	public WebElement getRemove() {
		return remove;
	}
	public WebElement getOkButton() {
		return okButton;
	}
	public WebElement getCancelButton() {
		return cancelButton;
	}
	public WebElement getDeleteButton() {
		return deleteButton;
	}
	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getOrderMedicineLink() {
		return orderMedicineLink;
	}

	public WebElement getProductsearchTF() {
		return productsearchTF;
	}
	public WebElement getShowingResults() {
		return showingResults;
	}
	public WebElement getCheckOutButton() {
		return checkOutButton;
	}
	//business logic
	public void clickOrderMedicine()
	{
		orderMedicineLink.click();
	}
	public void searchMedicine(String med)
	{
		productsearchTF.sendKeys(med,Keys.ENTER);
	}
}
