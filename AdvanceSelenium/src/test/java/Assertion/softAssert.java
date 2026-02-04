package Assertion;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert {
	@Test
	public void m1()
	{
		String expres="Instagram";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
	
		String actres = driver.getTitle();
	SoftAssert sof=new SoftAssert();
	sof.assertEquals(actres, expres);
		Reporter.log("execution happened",true);
		sof.assertAll();
		driver.quit();
	}
}
