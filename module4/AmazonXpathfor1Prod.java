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

public class AmazonXpathfor1Prod {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("toys");
		WebElement e2= driver.findElement(By.id("nav-search-submit-button"));
		e2.click();
		Thread.sleep(4000);
		
		List<WebElement> list=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
		list.get(0).click();
		driver.close();
		//driver.quit();
	}

}
