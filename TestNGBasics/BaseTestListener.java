package TestNGBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestListener extends ListenersLogic
{
	public static ChromeDriver driver;
	@BeforeMethod
	public void launchbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}
	
}
