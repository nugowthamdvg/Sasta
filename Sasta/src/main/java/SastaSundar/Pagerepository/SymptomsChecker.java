package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SymptomsChecker {
	@FindBy(xpath = "//span[text()='Health Services']")
	WebElement healthServicesLink;
	
	@FindBy(xpath = "//h2[text()='Symptoms Checker']")
	WebElement symptomsCheckerLink;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown')]//span[text()='Body Parts']")
	WebElement selectBodyPartsLink;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown')]//span[text()='Internal Organs']")
	WebElement selectInternalOrgansLink;
	
	@FindBy(xpath = "//a[text()='Male']")
	WebElement maleBodyPartsLink;
	
	@FindBy(xpath = "//a[text()='Female']")
	WebElement femaleBodyPartsLink;
	
	@FindBy(xpath = "//a[text()='Show Disease ']")
	WebElement showDiseaseButton;
	
	@FindBy(xpath = "//span[@id='symc_counter']")
	WebElement symcCounter;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement bookNowButton;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
	WebElement appointmentDate;
	
	@FindBy(xpath = "//span[text()='Body Part']")
	WebElement bodypart; 
	
	@FindBy(xpath = "//span[text()='Internal Organs']")
	WebElement internalOrgans;
	
	@FindBy(xpath = "//div[text()='Articles']")
	WebElement articlesLink;
	
	@FindBy(xpath = "//span[text()='Close']/preceding-sibling::span[text()='×']")
	WebElement close;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
	WebElement selectAppointmentDate;
	
	@FindBy(xpath = "//span[text()=' Remove']")
	WebElement removeButton;
	
	@FindBy(xpath = "//a[text()='Yes']")
	WebElement yesbutton;
	//providing getter methods
	public WebElement getHealthServicesLink() {
		return healthServicesLink;
	}

	public WebElement getSymptomsCheckerLink() {
		return symptomsCheckerLink;
	}

	public WebElement getSelectBodyPartsLink() {
		return selectBodyPartsLink;
	}

	public WebElement getSelectInternalOrgansLink() {
		return selectInternalOrgansLink;
	}

	public WebElement getMaleBodyPartsLink() {
		return maleBodyPartsLink;
	}

	public WebElement getFemaleBodyPartsLink() {
		return femaleBodyPartsLink;
	}

	public WebElement getShowDiseaseButton() {
		return showDiseaseButton;
	}

	public WebElement getSymcCounter() {
		return symcCounter;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}

	public WebElement getAppointmentDate() {
		return appointmentDate;
	}
	public WebElement getBodypart() {
		return bodypart;
	}
	public WebElement getInternalOrgans() {
		return internalOrgans;
	}
	public WebElement getArticlesLink() {
		return articlesLink;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getSelectAppointmentDate() {
		return selectAppointmentDate;
	}

	public WebElement getRemoveButton() {
		return removeButton;
	}

	public WebElement getYesbutton() {
		return yesbutton;
	}
	
	
}
