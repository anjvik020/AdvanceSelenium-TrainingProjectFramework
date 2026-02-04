package com.comcast.crm.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.comcast.crm.objectrepo.HomePage;
import com.comcast.crm.objectrepo.LoginPage;


public class BaseClassCRM {
	public WebDriver driver=null; 
	 public Excel elib=new Excel();
	public java jlib=new java();
	public properties plib=new properties();
	public webDriver wlib=new webDriver();
	@BeforeSuite
	public void beforesuit()
	{
		Reporter.log("connecting with database",true);
	}
	@AfterSuite
	public void aftersuit()
	{
		Reporter.log("closing the database",true);
		
	}
	@BeforeClass
	public void beforeclass() throws Throwable
	{
		Reporter.log("launching the browser",true);
		String BROWSER = plib.toReaddatafromPropertyFile("browser");
		if(BROWSER.equals("chrome")) {
			driver=new ChromeDriver();	
		} 
		else {
		driver=new EdgeDriver();
		}
		wlib.toMaximize(driver);
		wlib.toimplicitwait(driver);

	}
	@AfterClass
	public void afterclass()
	{
		Reporter.log("closing the browser",true);
		driver.quit();
	}
	@BeforeMethod
	public void beforemethod() throws Throwable
	{
		Reporter.log("login",true);
		String URL = plib.toReaddatafromPropertyFile("url");
		String UN = plib.toReaddatafromPropertyFile("username");
		String PW = plib.toReaddatafromPropertyFile("password");
		driver.get(URL);
		LoginPage lp=new LoginPage(driver);
		lp.loginpage(UN, PW);
	}
	@AfterMethod
	public void aftermethod()
	{
		Reporter.log("logout",true);
		HomePage hp=new HomePage(driver);
		hp.getLogout().click();
	}
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("parallel execution",true);
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("closing",true);
	}
	}

