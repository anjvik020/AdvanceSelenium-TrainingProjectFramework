package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Contact {
@Test
public void a1()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
}
}
