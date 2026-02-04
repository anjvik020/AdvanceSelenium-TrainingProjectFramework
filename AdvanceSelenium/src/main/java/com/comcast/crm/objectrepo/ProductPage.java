package com.comcast.crm.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[.='Add Product']")
	private WebElement createProduct;
	
	@FindBy(xpath = "//span[.='Add Product']")
	private WebElement createProduct1;
	public WebElement getProduct1()
	{
		return createProduct1;
	}
	
	@FindBy(name="productName")
	private WebElement productName;
	
	@FindBy(name="productCategory")
	private WebElement productCategory;
	
	@FindBy(name="quantity")
	private WebElement quantity;
	
	@FindBy(name="price")
	private WebElement price;
	
	@FindBy(name="vendorId")
	private WebElement vendorId;
	
	@FindBy(xpath="//button[.='Add']")
	private WebElement Add;
	
	@FindBy(xpath="//div[@class='Toastify__toast-body']")
	private WebElement toastmsg;
	
	@FindBy(xpath="//button[@aria-label='close']")
	private WebElement close;
	public WebElement getCreateProduct() {
		return createProduct;
	}

	public WebElement getProductName() {
		return productName;
	}

	public WebElement getProductCategory() {
		return productCategory;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getVendorId() {
		return vendorId;
	}

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getToastmsg() {
		return toastmsg;
	}

	public WebElement getClose() {
		return close;
	}
	 public void alldetails(String prodName,String quan,String pricee)
	 {
		 productName.sendKeys(prodName);
		 quantity.sendKeys(quan);
		 price.sendKeys(pricee);
		 
		 
	 }
}
