package module4;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GTM_controlOutofiframe {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement manishPhoto= 	  driver.findElement(By.id("chat-bot-launcher-button"));
		manishPhoto.click();
		Thread.sleep(4000);
		
		WebElement iframe= driver.findElement(By.id("chat-bot-iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement input=  	  driver.findElement(By.id("textInput"));
		input.sendKeys("Aisha");
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		WebElement courses= driver.findElement(By.xpath("(//ul[@class='elementor-nav-menu']/li)[2]"));
        courses.click();
		//driver.close();
		//driver.quit();
	}

}
