package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassportSevaLaunch
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://services2.passportindia.gov.in/forms/registration");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@data-testid='text-input-outlined']")).sendKeys("Aishwarya Chavan");
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.xpath("(//input[@dir='auto'])[2]"));
		e1.sendKeys("aishwaryachavan2697@gmail.com");
		WebElement e2=driver.findElement(By.xpath("(//input[@dir='auto'])[3]"));
		e2.sendKeys("aishwaryachavan2697@gmail.com");
		WebElement e3=driver.findElement(By.xpath("(//input[@dir='auto'])[4]"));
		e3.sendKeys("1234");
	}
}
