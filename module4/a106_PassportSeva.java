package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a106_PassportSeva 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://services2.passportindia.gov.in/forms/registration");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		WebElement radio1=driver.findElement(By.xpath("(//div[@data-focusable='true'][2]"));
		radio1.click();
		
		WebElement e1=driver.findElement(By.xpath("(//input[@data-testid='text-input-outlined'])[1]"));
		e1.sendKeys("Aishwarya Chavan");
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.xpath("(//input[@data-testid='text-input-outlined'])[2]"));
		e2.sendKeys("aishwaryachavan@gmail.com");
		
		WebElement e3=driver.findElement(By.xpath("(//input[@data-testid='text-input-outlined'])[3]"));
		e3.sendKeys("aishwaryachavan@gmail.com");
		
		WebElement e4=driver.findElement(By.xpath("(//input[@data-testid='text-input-outlined'])[4]"));
		e4.sendKeys("aish1234");
		
	}

}
