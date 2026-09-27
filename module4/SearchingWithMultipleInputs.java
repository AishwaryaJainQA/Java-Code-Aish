package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchingWithMultipleInputs 
{
	
		@Test(dataProvider="dataforsearching")
		public void searchingProduct(String input) throws InterruptedException
		{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1= driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input+Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
		}
		
		@DataProvider()
		public Object dataforsearching()
		{
			Object  [][] d1=new Object[5][1];
			d1[0][0]="mobile";
			d1[1][0]="shoe";
			d1[2][0]="tablets";
			d1[3][0]="watches";
			d1[4][0]="school bottles";
			return d1;
			
		}
		
	}



