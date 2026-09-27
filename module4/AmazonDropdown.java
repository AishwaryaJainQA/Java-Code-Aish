package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1=new Select(e1);
		//s1.selectByIndex(2);
		//s1.selectByVisibleText("Baby");
		s1.selectByValue("search-alias=baby");
		Thread.sleep(4000);
		driver.close();
		}

}
