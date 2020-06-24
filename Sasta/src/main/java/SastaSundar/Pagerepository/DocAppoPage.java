package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DocAppoPage 
{
	@FindBy(name="q")
	private WebElement searchSpecialist;
	
	@FindBy(name="SearchLocation")
	private WebElement searchLoc;
	
	@FindBy(xpath="//div[@class=\"item ng-scope\"]//h3[.='AMRI Medical Centre']/following-sibling::a[@class=\"btn btn-sm btn-info rounded-0\"]")
	private WebElement amrimedInfo;
	
	@FindBy(xpath="//strong[contains(.,'FRCS (G) - Fellowship of the Royal College of Physicians and Surgeons of Glasgow, MBBS - Bachelor of Medicine and Bachelor of Surgery, MS - Master of Surgery')]/ancestor::div[@class=\"row clearfix\"]//button[.=' Book Appointment']")
	private WebElement bookAppointment;
	
	@FindBy(xpath="//strong[.=' DO - Post Graduate Diploma in Ophthalmology, FRCS (G) - Fellowship of the Royal College of Physicians and Surgeons of Glasgow, MBBS - Bachelor of Medicine and Bachelor of Surgery, MS - Master of Surgery']/ancestor::div[@class=\"row clearfix\"]/following-sibling::div[@ng-show=\"OpenForBookingIndex == parentIndex\"]/div//div[@class=\"cal_container\"]/div/div/div//a[.='2 Jul 2020']")
	private WebElement selectDate;

	@FindBy(xpath="//strong[.=' DO - Post Graduate Diploma in Ophthalmology, FRCS (G) - Fellowship of the Royal College of Physicians and Surgeons of Glasgow, MBBS - Bachelor of Medicine and Bachelor of Surgery, MS - Master of Surgery']/ancestor::div[@class=\"row clearfix\"]/following-sibling::div[@ng-show=\"OpenForBookingIndex == parentIndex\"]/div//div[@class=\"cal_container\"]/div/div//strong[.='1:30PM']")
	private WebElement selectTime;
	
	@FindBy(xpath="//button[.='Cancel']")
	private WebElement cancel;

	
	public WebElement getSelectDate() {
		return selectDate;
	}
	
	public WebElement getSearchSpecialist() {
		return searchSpecialist;
	}

	public WebElement getSearchLoc() {
		return searchLoc;
	}

	public WebElement getAmrimedInfo() {
		return amrimedInfo;
	}

	public WebElement getBookAppointment() {
		return bookAppointment;
	}

	public WebElement getSelectTime() {
		return selectTime;
	}

	public WebElement getCancel() {
		return cancel;
	}
	
}
