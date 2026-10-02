package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.id("searchDropdownBox")).sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN );
		WebElement e1= driver.findElement(By.id("searchDropdownBox"));
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		e1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
	}

}
