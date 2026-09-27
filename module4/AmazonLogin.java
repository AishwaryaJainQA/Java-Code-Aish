package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonLogin
{
    @Test
    public void tc1() throws InterruptedException
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("nav-link-accountList")).click();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.id("ap_email"));
        username.sendKeys("mkumaran@gmail.com");

        WebElement contbutton = driver.findElement(By.id("continue"));
        contbutton.click();

        WebElement password = driver.findElement(By.name("password"));

        WebElement signin = driver.findElement(By.id("auth-signin-button"));
        signin.click();

        // WebElement loginbutton = driver.findElement(By.name(""));
        Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");

    }
}
