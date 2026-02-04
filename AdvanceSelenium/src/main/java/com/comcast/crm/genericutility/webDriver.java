package com.comcast.crm.genericutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class webDriver {
	public void toMaximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void toMinimize(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	public void tobacke(WebDriver driver)
	{

		driver.navigate().back();

	}
	public void torefresh(WebDriver driver)
	{

		driver.navigate().refresh();
	}
	public void toforward(WebDriver driver)
	{

		driver.navigate().forward();
	}
	public void toimplicitwait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	public void toexplicitwait(WebDriver driver, WebElement element)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void switchtoFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchtoFrame(WebDriver driver, String nameorID)
	{
		driver.switchTo().frame(nameorID);
	}
	public void switchtoFrame(WebDriver driver, WebElement frameelement)
	{
		driver.switchTo().frame(frameelement);	
	}
	public void switchtoAlertaccept(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void switchtoAlertdismiss(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public String switchtoAlerttext(WebDriver driver)
	{
		String text=driver.switchTo().alert().getText();
		return text;
	}
	public void switchtoAlertsendkeys(WebDriver driver,String text)
	{
		driver.switchTo().alert().sendKeys(text);
	}
	public void Selectclassindex(WebElement element , int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void Selectclassvalue(WebElement element , String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void SelectclassVisibletext(String text, WebElement element)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void mouseHoverOnWebelemment(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	public void clickOnWebelement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.click(element).perform();
	}

	public void doubleclickOnWebelement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}

	public void rightclickOnWebelement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}

	public void scrollToWebelement(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.scrollToElement(element).perform();
	}

	public void drageAndDropWebelement(WebDriver driver, WebElement src, WebElement target) {
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
		// Switch To parentWindow
			public void switchToParentWindow(WebDriver driver, String parentId) {
				driver.switchTo().window(parentId);
			}

			// Switch To Window
			public void switchToWindow(WebDriver driver) {
				Set<String> allids = driver.getWindowHandles();
				for (String id : allids) {
					driver.switchTo().window(id);
				}
			}

			// Switch To Window using Title
			public void switchToWindowByTitle(WebDriver driver, String partialTitle) {
				Set<String> allWindows = driver.getWindowHandles();
				for (String win : allWindows) {
					driver.switchTo().window(win);
					if (driver.getTitle().contains(partialTitle)) {
						break;
					}
				}
			}	
}
