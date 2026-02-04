package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateProductPage {
	WebDriver driver;
	public CreateProductPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[.='Add Product']")
	private WebElement createProduct; 
	
	
	public WebElement getCreateProduct() {
		return createProduct;
	}

	public void setCreateProduct(WebElement createProduct) {
		this.createProduct = createProduct;
	}

	@FindBy(name  ="productName")
	 private WebElement ProductName;
	
	@FindBy(name="productCategory")
	private WebElement SelectCategory;
	
	@FindBy(name="quantity")
	private WebElement Quantity;
	
	@FindBy(name="price")
	private WebElement PricePerUnit;
	
	@FindBy(name="vendorId")
	private WebElement SelectAVendor;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Add;
	public WebElement getProductName() {
		return ProductName;
	}

	public WebElement getSelectCategory() {
		return SelectCategory;
	}

	public WebElement getQuantity() {
		return Quantity;
	}

	public WebElement getPricePerUnit() {
		return PricePerUnit;
	}

	public WebElement getSelectAVendor() {
		return SelectAVendor;
	}

	public WebElement getAdd() {
		return Add;
	}
	
	
}
