package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[.='Create Campaign']")
	private WebElement CReateCampaignButton;
	
	
	public WebElement getCReateCampaignButton() {
		return CReateCampaignButton;
	}

	public void setCReateCampaignButton(WebElement cReateCampaignButton) {
		CReateCampaignButton = cReateCampaignButton;
	}

	@FindBy(xpath = "//a[.='Campaigns']")
	WebElement Campaign;
	
	@FindBy(xpath = "//a[.='Contacts']")
	private WebElement contact;
	
	@FindBy(xpath = "//a[.='Leads']")
	private WebElement Leads;
	
	@FindBy(xpath = "//a[.='Opportunities']")
	private WebElement Opportunities;
	
	@FindBy(xpath = "//a[.='Products']")
	private WebElement Products;
	
	@FindBy(xpath = "//a[.='Quotes']")
	private WebElement Quotes;
	
	@FindBy(xpath = "//a[.='Purchase Order']")
	private WebElement PurchaseOrder;
	
	@FindBy(xpath = "//a[.='Sales Order']")
	private WebElement SalesOrder;
	
	@FindBy(xpath = "//a[.='Invoice']")
	private WebElement Invoice;
	
	@FindBy(xpath = "//div[@class='user-icon']")
	private WebElement Profileicon;
	
	@FindBy(xpath="//div[@class='dropdown-item logout']")
	private WebElement Logout;
	public WebElement getCampaign() {
		return Campaign;
	}

	public WebElement getContact() {
		return contact;
	}

	public WebElement getLeads() {
		return Leads;
	}

	public WebElement getOpportunities() {
		return Opportunities;
	}

	public WebElement getProducts() {
		return Products;
	}

	public WebElement getQuotes() {
		return Quotes;
	}

	public WebElement getPurchaseOrder() {
		return PurchaseOrder;
	}

	public WebElement getSalesOrder() {
		return SalesOrder;
	}

	public WebElement getInvoice() {
		return Invoice;
	}

	public WebElement getProfileicon() {
		return Profileicon;
	}

	public WebElement getLogout() {
		return Logout;
	}
}

