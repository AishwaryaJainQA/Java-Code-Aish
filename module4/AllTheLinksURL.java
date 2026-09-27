package module4;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllTheLinksURL 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> e1=driver.findElements(By.tagName("a"));
		int count= e1.size();
		for (int i=0;i<count;i++)
		{
			WebElement e2= e1.get(i);
			String url1= e2.getDomAttribute("href");
			System.out.println(url1);
		}
		driver.close();
		//driver.quit();
	}

}
