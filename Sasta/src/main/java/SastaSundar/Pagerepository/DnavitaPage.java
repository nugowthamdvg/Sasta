package SastaSundar.Pagerepository;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import SastaSundar.genericLib.Utility;

public class DnavitaPage 
{
	@FindBy(xpath="//strong[.='Add New Input For Order']")
	private WebElement addNewInput;

	@FindBy(id="familyMember")
	private WebElement searchFmem;

	@FindBy(xpath="//li[.='Other - Gowtham']")
	private WebElement selFmem;

	@FindBy(xpath="//label[.=' Centimeter']")
	private WebElement cmCheckbox;
	
	@FindBy(id="height_cm")
	private WebElement heightDD;
	
	@FindBy(id="Weight")
	private WebElement weight;
	
	@FindBy(id="profile_info_acpt")
	private WebElement acptPro;
	

	@FindBys
	({
		@FindBy(xpath="//label[.='None']")
	})
	private List<WebElement> noneCheck;
	
	@FindBys
	({
		@FindBy(xpath="//button[.='Next']")
	})
	private List<WebElement> nextButton;

	@FindBy(xpath="//select[@id='food_type']")
	private WebElement foodDD;

	@FindBy(xpath="//button[.='Submit']")
	private WebElement submit;
	
	
	
	
	public WebElement getSubmit() {
		return submit;
	}

	public List<WebElement> getNoneCheck() {
		return noneCheck;
	}

	public List<WebElement> getNextButton() {
		return nextButton;
	}
	
	public WebElement getAcptPro() {
		return acptPro;
	}
	
	public WebElement getAddNewInput() {
		return addNewInput;
	}

	public WebElement getSearchFmem() {
		return searchFmem;
	}

	public WebElement getSelFmem() {
		return selFmem;
	}

	public WebElement getCmCheckbox() {
		return cmCheckbox;
	}

	public WebElement getHeightDD() {
		return heightDD;
	}

	public WebElement getWeight() {
		return weight;
	}

	public WebElement getFoodDD() {
		return foodDD;
	}
	
	

	public void selectHgt(String value)
	{
		Utility.dropDown(heightDD, value);
	}
	
	public void selectFh(String value)
	{
		Utility.dropDown(foodDD, value);
	}
	
}
