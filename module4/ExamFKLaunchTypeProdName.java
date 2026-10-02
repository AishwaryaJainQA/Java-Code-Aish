package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamFKLaunchTypeProdName 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1=driver.findElement(By.xpath("//span[text()='✕']"));
		e1.click();
		
		WebElement e2=driver.findElement(By.name("q"));
		e2.sendKeys("Laptop");
		Thread.sleep(3000);
		
		List<WebElement> e4=driver.findElements(By.xpath("//a[@class='ZBdLcw uOWdgt']"));
		e4.get(1).click();
		Thread.sleep(3000);
		
		WebElement e3=driver.findElement(By.xpath("(//img[@class='UCc1lI'])[3]"));
		e3.click();
		
		WebElement e5=driver.findElement(By.xpath("//div[@class='css-g5y9jx']"));
		e5.click();
		//driver.close();

		
	}

}
