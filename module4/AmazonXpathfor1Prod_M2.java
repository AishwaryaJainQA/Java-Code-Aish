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

public class AmazonXpathfor1Prod_M2 {

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
		
		WebElement e3=driver.findElement(By.xpath("//a[@class='a-link-normal s-no-outline'][1]"));
		e3.click();
		
		Set<String> pcid= driver.getWindowHandles();
		System.out.println(pcid);
		
		WebElement e4=driver.findElement(By.id("add-to-cart-button"));
		e4.click();
		//driver.close();
		//driver.quit();
	}

}
