package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SymptomsChecker {
	@FindBy(xpath = "//span[text()='Health Services']")
	private WebElement healthServicesLink;
	
	@FindBy(xpath = "//h2[text()='Symptoms Checker']")
	private WebElement symptomsCheckerLink;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown')]//span[text()='Body Parts']")
	private WebElement selectBodyPartsLink;
	
	@FindBy(xpath = "//div[contains(@class,'dropdown')]//span[text()='Internal Organs']")
	private WebElement selectInternalOrgansLink;
	
	@FindBy(xpath = "//a[text()='Male']")
	private WebElement maleBodyPartsLink;
	
	@FindBy(xpath = "//a[text()='Show Disease ']")
	private WebElement showDiseaseButton;
	
	@FindBy(xpath = "//span[@id='symc_counter']")
	private WebElement symcCounter;
	
	@FindBy(xpath = "//a[@class='btn btn-default']")
	private WebElement bookNowButton;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
	private WebElement appointmentDate;
	
	@FindBy(xpath = "//span[text()='Body Part']")
	private WebElement bodypart; 
	
	@FindBy(xpath = "//span[text()='Internal Organs']")
	private WebElement internalOrgans;
	
	@FindBy(xpath = "//div[text()='Articles']")
	private WebElement articlesLink;
	
	@FindBy(xpath = "//span[text()='Close']/preceding-sibling::span[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//div[@class='mat-select-arrow-wrapper']")
	private WebElement selectAppointmentDate;
	
	@FindBy(xpath = "//span[text()=' Remove']")
	private WebElement removeButton;
	
	@FindBy(xpath = "//a[text()='Yes']")
	private WebElement yesbutton;
	
	@FindBy(xpath = "//a[text()='Female']")
	private WebElement femaleBodyPartsLink;
	
	@FindBy(linkText="Mouth")
	private WebElement mouthPart;
	
	@FindBy(xpath="//label[.=\"A Sore That Doesn't Heal\"]/span[@class='cr']")
	private WebElement sorethatdoesnthealCheckbox;
	
	@FindBy(xpath="//div[.='Oral Cancer']")
	private WebElement oralcancerdiseaseLink;
	
	@FindBy(xpath="//div[@class=\"tab-pane fade in active\"]//a[.='Click here']")
	private WebElement labclickhereLink;
	
	@FindBy(xpath="//div[.='LIPID PROFILE']")
	private WebElement lipidprofileTest;
	
	@FindBy(linkText="Nose")
	private WebElement nosePart;
	
	@FindBy(xpath="//label[.='Nasal Obstruction Or Congestion']/span[@class='cr']")
	private WebElement congestionCheckbox;
	
	@FindBy(xpath="//div[.='Sinusitis']")
	private WebElement SinusitisLink;
	
	@FindBy(xpath="//a[@href=\"#rel_doctor_sec\"]//div[.='Doctor']")
	private WebElement doctorIcon;
	
	@FindBy(xpath="//div[@class=\"tab-pane fade active in\"]//a[.='Click here']")
	private WebElement docclickhereLink;

	@FindBy(linkText="Hand")
	private WebElement handPart;
	
	@FindBy(xpath="//area[@title='Knee']")
	private WebElement KneePart;
	
	@FindBy(linkText="Finger")
	private WebElement FingerPart;
	
	@FindBy(xpath="//label[.='Swelling']/span[@class='cr']")
	private WebElement swellingCheckbox;
	
	@FindBy(xpath="//div[.='Congenital Heart Disease']")
	private WebElement congenitalheartdiseaseLink;
	
	@FindBy(linkText="Read More")
	private WebElement readmoreLink;
	
	@FindBy(xpath="//a[@class=\"btn btn-book sample-report\"]")
	private WebElement viewsamplereportLink;
	
	@FindBy(xpath="//i[@class=\"icon-file-pdf\"]")
	private WebElement downloadpdfLink;
	
	@FindBy(xpath="//button[contains(@class,\"quick-view\")]//span[.='×']")
	private WebElement closepopupicon;

	@FindBy(xpath="//label[.='Persistent Stuffiness']/span[@class='cr']")
	private WebElement persissmellCheckbox;
	
	@FindBy(linkText="Heart")
	private WebElement heart;
	
	@FindBy(xpath="//label[.='Abnormal Heart Rhythms']/span[@class='cr']")
	private WebElement ANheartrhythmCheckbox;
	
	@FindBy(xpath="//a[contains(.,'Centre Visit')]")
	private WebElement labtestLink;
	
	@FindBy(linkText="Stomach")
	private WebElement stomach;
	
	@FindBy(xpath="//label[.='Gastorintestinal Bleeding']/span[@class='cr']")
	private WebElement intestinalbleedingCheckbox;
	
	@FindBy(xpath="//div[.='Indigestion']")
	private WebElement indigestionLink;
	
	@FindBy(xpath="//a[.='HIV ECLIA']")
	private WebElement HIVECLIAlabtestLink;
	
	@FindBy(xpath="//div[.=' PRE OPERATIVE SEROLOGY']")
	private WebElement preoperativeLink;

	@FindBy(xpath="//div[@id='mCSB_1_dragger_vertical']")
	private WebElement dragBar;
	
	
	
	public WebElement getDocclickhereLink() {
		return docclickhereLink;
	}

	public WebElement getCongestionCheckbox() {
		return congestionCheckbox;
	}

	public WebElement getSinusitisLink() {
		return SinusitisLink;
	}

	public WebElement getDoctorIcon() {
		return doctorIcon;
	}

	public WebElement getDragBar() {
		return dragBar;
	}
	
	public WebElement getClosepopupicon() {
		return closepopupicon;
	}
	
	public WebElement getMouthPart() {
		return mouthPart;
	}

	public WebElement getSorethatdoesnthealCheckbox() {
		return sorethatdoesnthealCheckbox;
	}

	public WebElement getOralcancerdiseaseLink() {
		return oralcancerdiseaseLink;
	}

	public WebElement getLabclickhereLink() {
		return labclickhereLink;
	}

	public WebElement getLipidprofileTest() {
		return lipidprofileTest;
	}

	public WebElement getNosePart() {
		return nosePart;
	}

	public WebElement getHandPart() {
		return handPart;
	}

	public WebElement getKneePart() {
		return KneePart;
	}

	public WebElement getFingerPart() {
		return FingerPart;
	}

	public WebElement getSwellingCheckbox() {
		return swellingCheckbox;
	}

	public WebElement getCongenitalheartdiseaseLink() {
		return congenitalheartdiseaseLink;
	}

	public WebElement getReadmoreLink() {
		return readmoreLink;
	}

	public WebElement getViewsamplereportLink() {
		return viewsamplereportLink;
	}

	public WebElement getDownloadpdfLink() {
		return downloadpdfLink;
	}

	public WebElement getPersissmellCheckbox() {
		return persissmellCheckbox;
	}

	public WebElement getHeart() {
		return heart;
	}

	public WebElement getANheartrhythmCheckbox() {
		return ANheartrhythmCheckbox;
	}

	public WebElement getLabtestLink() {
		return labtestLink;
	}

	public WebElement getStomach() {
		return stomach;
	}

	public WebElement getIntestinalbleedingCheckbox() {
		return intestinalbleedingCheckbox;
	}

	public WebElement getIndigestionLink() {
		return indigestionLink;
	}

	public WebElement getHIVECLIAlabtestLink() {
		return HIVECLIAlabtestLink;
	}

	public WebElement getPreoperativeLink() {
		return preoperativeLink;
	}

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
