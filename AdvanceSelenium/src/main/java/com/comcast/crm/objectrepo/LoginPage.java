package com.comcast.crm.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement un;

	@FindBy(id="inputPassword")
	private WebElement pw;

	@FindBy(xpath = "//button[.='Sign In']")
	private WebElement sn;

	public WebElement getUn() {
		return un;
	}

	public WebElement getPw() {
		return pw;
	}

	public WebElement getSn() {
		return sn;
	}

	public void loginpage(String UN, String PW)
	{
		un.sendKeys(UN);
		pw.sendKeys(PW);
		sn.click();
	}

}
