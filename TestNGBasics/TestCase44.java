package TestNGBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersLogic.class)
public class TestCase44 extends BaseTestListener
{

	

	@Test
	public void tc4() throws InterruptedException
	{
		
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count=list.size();
		System.out.println(count);
	}
	}

