package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.FbloginPage;

public class FbloginTest {
	
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
@Test
public void test()
{
	FbloginPage ob = new FbloginPage(driver);
	ob.setValues("abc@gmail.com","aabbcc");
	ob.loginClick();
}
}
