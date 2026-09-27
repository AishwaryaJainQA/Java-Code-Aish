package TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTestCaseDiff
{
	@Test
	public void loginToAmazon() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("laptops");
		
		WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
	}
}
