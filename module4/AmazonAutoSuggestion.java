package module4;

import java.sql.Driver;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
		int count=list.size();
		System.out.println(count);
		
		list.get(0).click();
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
