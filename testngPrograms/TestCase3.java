package testngPrograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 
{
	@Test(timeOut=2000)
	public void tc1()
	{
		ChromeDriver driver=new ChromeDriver();
	}
}
