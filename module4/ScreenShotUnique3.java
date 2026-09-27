package module4;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUnique3
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("Banglore");
		Thread.sleep(2000);
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count=list.size();
		System.out.println(count);
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String format1=d2.toString();
		String format2=format1.replace(":", " ");
		System.out.println(format2);
		
		TakesScreenshot ts=driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\IT Tech\\eclipse-workspace\\AutomationBatch70\\test-output\\screenshot\\SC1"+format2+".png");
		FileHandler.copy(source, destination);
		//driver.close();
		driver.quit();
	}

}
