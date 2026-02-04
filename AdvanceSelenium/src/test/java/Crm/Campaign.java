package Crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.comcast.crm.genericutility.Excel;
import com.comcast.crm.genericutility.java;
import com.comcast.crm.genericutility.properties;
import com.comcast.crm.genericutility.webDriver;

import genericutility.JavaUtil;
import genericutility.WebdriverUtility;
import genericutility.excel;
import pom.CreateCampaignPage;
import pom.HomePage;

public class Campaign {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=null;
properties plib=new properties();
Excel elib=new Excel();
java jlib=new java();
webDriver wlib=new webDriver();
String BROWSER = plib.toReaddatafromPropertyFile("browser");
String URL = plib.toReaddatafromPropertyFile("url");
String UN = plib.toReaddatafromPropertyFile("username");
String PW = plib.toReaddatafromPropertyFile("password");
String campName = elib.toReaddatafromexcelfile("createcampaign", 1, 0);
String tarSize = elib.toReaddatafromexcelfile("createcampaign", 1, 1);

if(BROWSER.equals("chrome")) {
	driver=new ChromeDriver();	
} 
else {
driver=new EdgeDriver();
}
wlib.toMaximize(driver);
wlib.toimplicitwait(driver);

driver.get(URL);
driver.findElement(By.id("username")).sendKeys(UN);
	driver.findElement(By.id("inputPassword")).sendKeys(PW);
	driver.findElement(By.xpath("//button[.='Sign In']")).click();
	
	HomePage hp=new HomePage(driver);
	hp.getCReateCampaignButton().click();
	CreateCampaignPage cp=new CreateCampaignPage(driver);
	cp.getCampName().sendKeys(campName);
	cp.getTargetSize().sendKeys(tarSize);
	cp.getCreateCampButtonEnd();
	
	}

}
