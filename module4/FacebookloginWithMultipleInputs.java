package module4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookloginWithMultipleInputs 
{
		@Test(dataProvider="dataforLogic")
		public void tc1(String username, String password) 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
			WebElement u1= 	  driver.findElement(By.name("email"));
			u1.sendKeys(username);
			
			WebElement p1=  	  driver.findElement(By.name("pass"));
			p1.sendKeys(password+Keys.ENTER);
		}
		
		@DataProvider()
		public Object dataforLogic()
		{
			Object  [][] d1=new Object[5][2];
			d1[0][0]="aishwaryachavan2697@gmail.com";  //1st row
			d1[0][1]="Aisha1496";
			
			d1[1][0]="itsaishwarya14@gmail.com";		//2nd row
			d1[1][1]="Aisha@1402";
			
			d1[2][0]="8976543897";		//3rd row
			d1[2][1]="Aisha@1402";
			
			d1[3][0]="Aishwarya";						//4th row
			d1[3][1]="Aisha@1402";
			
			d1[4][0]="AishwaryaC";						//5th row
			d1[4][1]="Aisha@1402";
			return d1;
			
		}
		
	}



