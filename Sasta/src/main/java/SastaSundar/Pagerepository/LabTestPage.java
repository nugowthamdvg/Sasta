package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LabTestPage 
{
	@FindBy(xpath="//a[.='BOOK NOW']")
	private WebElement booknowLink;
	
	@FindBy(xpath="//strong[.='BOOK NOW']")
	private WebElement booknowButton;

	@FindBy(xpath="//li[contains(@id,\"labcart_hideshow\")]")
	private WebElement labcartLink;

	@FindBy(xpath="//button[.=' Select time slot']")
	private WebElement timeslotButton;
	
	@FindBy(xpath="//span[contains(@class,\"mat-select-value-text \")]//span")
	private WebElement daydd;
	
	@FindBy(xpath="//span[.=' Monday, 29 June ']")
	private WebElement selectdddate;

	@FindBy(xpath="//span[.='Monday, 29 June']")
	private WebElement selectdate;
	
	@FindBy(xpath="//span[.='10:00 A.M - 10:30 A.M']")
	private WebElement selecttimeslot;
	
	@FindBy(xpath="//a[.='Show More >>']")
	private WebElement showmoreLink;
	
	@FindBy(xpath="//div[.=' COMMON VIRAL SCREENING']")
	private WebElement viralscrrenLink;
	
	@FindBy(xpath="//h3[.='ECG']")
	private WebElement ECGlabtestLink;
	
	@FindBy(xpath="//div[@class=\"select-button\"]//a[@class=\"btn btn-select\"]")
	private WebElement viewDiagonosticcenterButton;
	
	@FindBy(xpath="//a[.=' Select Test']")
	private WebElement selecttestLink;
	
	@FindBy(xpath="//span[@data-toggle=\"dropdown\"]/i[@class=\"icon-delete\"]")
	private WebElement deleteIcon;
	
	@FindBy(xpath="//div[@class=\"dropdown-menu dropdown-doyou\"]//a[.=\"Yes\"]")
	private WebElement yesButton;
	
	public WebElement getSelecttestLink() {
		return selecttestLink;
	}

	public WebElement getDeleteIcon() {
		return deleteIcon;
	}

	public WebElement getYesButton() {
		return yesButton;
	}

	public WebElement getViewDiagonosticcenterButton() {
		return viewDiagonosticcenterButton;
	}

	public WebElement getECGlabtestLink() {
		return ECGlabtestLink;
	}
	
	public WebElement getBooknowButton() {
		return booknowButton;
	}
	
	public WebElement getSelectdddate() {
		return selectdddate;
	}
	
	public WebElement getDaydd() {
		return daydd;
	}

	public WebElement getSelecttimeslot() {
		return selecttimeslot;
	}

	public WebElement getViralscrrenLink() {
		return viralscrrenLink;
	}
	
	public WebElement getShowmoreLink() {
		return showmoreLink;
	}
	
	public WebElement getSelectdate() {
		return selectdate;
	}

	public WebElement getLabcartLink() {
		return labcartLink;
	}

	public WebElement getTimeslotButton() {
		return timeslotButton;
	}
	
	public WebElement getBooknowLink() {
		return booknowLink;
	}
}
