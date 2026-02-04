package Assertion;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class hardAssert {
@Test
public void m1()
{
	String expres="Instagram";
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	@Nullable
	String actres = driver.getTitle();
	Assert.assertEquals(actres, expres);
	Reporter.log("done",true);
	driver.quit();
}
}
