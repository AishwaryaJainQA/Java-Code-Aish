package TestNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTestCaseDiff
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void launchbrowser(@Optional ("Chrome") String nameOfbrowser)
	{
		if(nameOfbrowser.equals("Chrome"))
		{
		  driver=new ChromeDriver();
		}
		
		if(nameOfbrowser.equals("Firefox"))
		{
		  driver=new FirefoxDriver();
		}
		
		if(nameOfbrowser.equals("edge"))
		{
		  driver=new EdgeDriver();
		}
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void quitbrowser()
	{
		driver.quit();
	}
	
}
