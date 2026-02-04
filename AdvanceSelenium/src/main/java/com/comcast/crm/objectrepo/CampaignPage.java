package com.comcast.crm.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {
	WebDriver driver;

	
	public WebElement getCampname() {
		return campname;
	}

	public WebElement getCampaignStatus() {
		return campaignStatus;
	}

	public WebElement getTargetSize() {
		return targetSize;
	}

	public WebElement getExpectedCloseDate() {
		return expectedCloseDate;
	}

	public WebElement getTargetAudience() {
		return targetAudience;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getCreatecampend() {
		return createcampend;
	}

	public WebElement getToastmsg() {
		return toastmsg;
	}

	public CampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name  = "campaignName")
	private WebElement campname;
	
	@FindBy(name  = "campaignStatus")
	private WebElement campaignStatus;
	
	@FindBy(name  = "targetSize")
	private WebElement targetSize;
	
	@FindBy(name  = "expectedCloseDate")
	private WebElement expectedCloseDate;
	
	@FindBy(name  = "targetAudience")
	private WebElement targetAudience;
	
	@FindBy(name  = "description")
	private WebElement description;
	
	@FindBy(xpath="//button[.='Create Campaign']")
	private WebElement createcampend;
	
	@FindBy(xpath  = "//div[@class='Toastify__toast-body']")
	private WebElement toastmsg;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement closebutton;
	public WebElement getClosebutton() {
		return closebutton;
	}
	public void allfield(String campName,String campstatus,String tarSize,String audience,String descrip)
	{
		campname.sendKeys(campName);
		campaignStatus.sendKeys(campstatus);
		targetSize.sendKeys(tarSize);
		targetAudience.sendKeys(audience);
		description.sendKeys(descrip);
		
	}
}
