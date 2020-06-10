package com.vTiger.genericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
//import org.testng.annotations.Parameters;

import com.vTiger.pagerepository.Home;
import com.vTiger.pagerepository.Login;

@Listeners(com.vTiger.genericLib.ListenerImp.class)

public class Base 
{
	public WebDriver driver;
	public static WebDriver staticdriver;
	FileLib lib = new FileLib();
	
	Login login;
	Home home;
	
	@BeforeClass()
	public void configBC()
	{
//		if(browservar.equals("chrome")) //for cross browser action
		if (lib.getDataFromPrpoertyFile("browser").equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\VTiger\\browsers\\chromedriver.exe");
			driver = new ChromeDriver();
			staticdriver = driver;
		}
//		else if(browservar.equals("firefox")) //for cross browser action
		else if (lib.getDataFromPrpoertyFile("browser").equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","E:\\selenium\\VTiger\\browsers\\geckodriver.exe");
			driver = new FirefoxDriver();
			staticdriver = driver;
		}
		Reporter.log("browser is launched" , true);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(lib.getDataFromPrpoertyFile("url"));
		
		Reporter.log("Website is opened" , true);
	}
	
	@BeforeMethod
	public void configBM()
	{	
		login = PageFactory.initElements(driver, Login.class);
		login.Loginpage(lib.getDataFromPrpoertyFile("username"),lib.getDataFromPrpoertyFile("password"));
		
		Reporter.log("Login successfully" , true);
	}
	
	@AfterMethod
	public void configAM()
	{

		home = PageFactory.initElements(driver, Home.class);
		home.signout(driver);
		
		Reporter.log("Loggedout successfully" , true);
	}
	
	@AfterClass
	public void cnfigAC()
	{
		driver.quit();
		Reporter.log("Browser closed" , true);
	}
}
