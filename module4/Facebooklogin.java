package module4;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement username= 	  driver.findElement(By.name("email"));
		username.sendKeys("aishwaryachavan2697gmail.com");
		WebElement password=  	  driver.findElement(By.name("pass"));
		password.sendKeys("Aisha@1402"+Keys.ENTER);
		Thread.sleep(3000);
		//WebElement loginbutton=  driver.findElement(By.className("email"));
		//click();
		driver.close();
		//driver.quit();
	}

}
