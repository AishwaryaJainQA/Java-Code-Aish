package TestNGBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestCase
{
	ChromeDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		//driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}
	
}
