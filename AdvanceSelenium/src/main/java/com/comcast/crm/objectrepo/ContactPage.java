package com.comcast.crm.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.genericutility.java;


public class ContactPage {
	WebDriver driver;
	java jlib=new java();
	
	public ContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Create Contact']")
	private WebElement createcontact;
	
	@FindBy(name = "organizationName")
	private WebElement organizationName;
	
	@FindBy(name = "title")
	private WebElement title;
	
	@FindBy(name = "department")
	private WebElement department;
	
	@FindBy(name = "officePhone")
	private WebElement officePhone;
	
	@FindBy(name = "contactName")
	private WebElement contactName;
	
	@FindBy(name = "mobile")
	private WebElement mobile;
	
	@FindBy(name = "email")
	private WebElement email;
	
	@FindBy(xpath = "//*[name()='svg' and @data-icon='plus']")
	private WebElement campaignplus;
	
	@FindBy(xpath="//button[.='Create Contact']")
	private WebElement createcontactend;
	
@FindBy(xpath="//div[@role='alert']")
private WebElement toastmsg;

	public WebElement getToastmsg() {
	return toastmsg;
}

@FindBy(xpath="//button[@aria-label='close']")
private WebElement close;


	public WebElement getClose() {
	return close;
}

	public WebElement getCreatecontact() {
		return createcontact;
	}

	public WebElement getOrganizationName() {
		return organizationName;
	}

	public WebElement getTitle() {
		return title;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getOfficePhone() {
		return officePhone;
	}

	public WebElement getContactName() {
		return contactName;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCampaignplus() {
		return campaignplus;
	}

	public WebElement getCreatecontactend() {
		return createcontactend;
	}
	
	public void createcontactman(String ORG, String TITLE, String CNNAME, String DIGIT)
	{
		java jlib=new java();
		String digit = jlib.getTenDigit()+"";
		organizationName.sendKeys(ORG);
		title.sendKeys(TITLE);
		contactName.sendKeys(CNNAME);
		mobile.sendKeys(DIGIT);
		campaignplus.click();
	}
	
	@FindBy(xpath = "//td[.='Campaigntest']/..//button[@class='select-btn']")
	private WebElement campaign;
	public WebElement getCampaign() {
		return campaign;
	}
}
