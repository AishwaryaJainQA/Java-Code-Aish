package module4;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GTM_controlTOiframe {

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
		//Thread.sleep(5000);
		//WebElement loginbutton=  driver.findElement(By.className("email"));
		//click();
		//driver.close();
		//driver.quit();
	}

}
