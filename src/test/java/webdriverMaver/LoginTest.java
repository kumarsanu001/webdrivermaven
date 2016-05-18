package webdriverMaver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		driver=new FirefoxDriver();
		
	}
	@Test
	public void dologin()
	{
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("pageobjectmodeltesting@gmail.com");
		
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
