package SastaSundar.Pagerepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DietClinicPage 
{
	@FindBy(xpath="//img[contains(@src,'symptoms-checker-img-new.jpg')]")
	private WebElement symptomcheckerLink;

	@FindBy(xpath="//a[.='Health Articles']")
	private WebElement healtharticlesLink;
	
	
	
	public WebElement getHealtharticlesLink() {
		return healtharticlesLink;
	}

	public WebElement getSymptomcheckerLink() 
	{
		return symptomcheckerLink;
	}
	

}
