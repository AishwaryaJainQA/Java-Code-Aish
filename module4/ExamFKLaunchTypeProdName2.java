package module4;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamFKLaunchTypeProdName2 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement popup= driver.findElement(By.xpath("//span[text()='✕']"));
        popup.click();
        Thread.sleep(5000);
      
        WebElement e1= driver.findElement(By.name("q"));
        e1.sendKeys("toys");
        Thread.sleep(3000);
        List<WebElement> list= driver.findElements(By.xpath("//form/ul/li"));
        list.get(2).click();
        
        List<WebElement> products= driver.findElements(By.xpath("//a[@class='pIpigb']"));
      //List<WebElement> products= driver.findElements(By.xpath("//a[contains(@class='a-link-normal s-no-outline']"));
    	products.get(2).click();

    	 Set<String> pcid= driver.getWindowHandles();
         System.out.println(pcid);
         Iterator<String> id= pcid.iterator();
         String parentid=id.next();//parent id
         String childid= id.next();
         driver.switchTo().window(childid);
         Thread.sleep(3000);
         //WebElement addToCart= driver.findElement(By.xpath("//div[@class='css-g5y9jx']"));
         WebElement addToCart= driver.findElement(By.xpath("//div[text()='Add to cart']"));
         //WebElement addToCart= driver.findElement(By.xpath("//div[contains(@style,'border-radius: 12px') and contains(@style,'opacity: 0.5')]"));
         Thread.sleep(6000);
         addToCart.click();
         //driver.quit();
        

	}

}