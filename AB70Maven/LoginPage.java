package learning.AB70Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage 
{
	WebDriver driver; //using this we can write synchronization
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	//step1 
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement passwod;
	
	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;
	

	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	WebElement TextForAssertion;
	
	//step2
	
	public void EnterValidEmailId()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("aishwaryachavan116@gmail.com");
	}
	public void EnterValidPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(passwod));
		passwod.sendKeys("Aish123");
	}
	public void ClickOnLoginButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
