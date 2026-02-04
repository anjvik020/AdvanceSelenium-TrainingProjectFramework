package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	WebDriver driver;
	public CreateCampaignPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name =  "campaignName")
	 private WebElement CampName;
	
	@FindBy(name = "campaignStatus")
	private WebElement CampStatus;
	
	@FindBy(name = "targetSize")
	private WebElement TargetSize;
	
	@FindBy(name = "expectedCloseDate")
	private WebElement ExpectedCloseDate;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement CreateCampButtonEnd;
	
	
	public WebElement getCampName() {
		return CampName;
	}

	public WebElement getCampStatus() {
		return CampStatus;
	}

	public WebElement getTargetSize() {
		return TargetSize;
	}

	public WebElement getExpectedCloseDate() {
		return ExpectedCloseDate;
	}

	public WebElement getCreateCampButtonEnd() {
		return CreateCampButtonEnd;
	}
}
