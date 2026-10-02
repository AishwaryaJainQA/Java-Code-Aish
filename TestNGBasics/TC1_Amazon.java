package TestNGBasics;

import java.util.List;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Amazon
{
	@Test (retryAnalyzer=retryLogic.class)
	public void method1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.name("qtfgh"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count=list.size();
		System.out.println(count);
	}
}
