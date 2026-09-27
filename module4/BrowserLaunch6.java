package module4;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch6 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		String parent_id= driver.getWindowHandle();
		System.out.println(parent_id);
		
		Set<String> pcid= driver.getWindowHandles();
		System.out.println(pcid);
		driver.close();
		//driver.quit();
	}

}
