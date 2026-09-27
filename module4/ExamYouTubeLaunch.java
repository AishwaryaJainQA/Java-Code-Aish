package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamYouTubeLaunch 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("Automation testing");
		Thread.sleep(5000);
		
		WebElement e2=driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']"));	
		e2.click();
		
		//driver.close();

	}

}
