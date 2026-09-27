package module4;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement e1= driver.findElement(By.id("file"));
		e1.sendKeys("C:\\Users\\IT Tech\\Downloads\\WhatsApp Image 2026-08-18 at 2.00.46 PM.jpeg");
		
	}

}
