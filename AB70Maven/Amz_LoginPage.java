package learning.AB70Maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amz_LoginPage 
{
	//step 1
	WebDriver driver;
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin;
	
	@FindBy(xpath="//div[@id='claim-collection-container']/h1")
	WebElement TextForAssertion;
	//step 2
	public void EnterUsername()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("aishwaryachavan69@gmail.com");
	}
	
	public void ClickOnContinue()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}
	
	
	public void EnterPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("Aish123");
	}
	
	
	public void ClickOnSign()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	}
	public String VerifyTheAssertion()
	{
		String text = TextForAssertion.getText();
		return text;
	}
	
	public Amz_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
