package testngPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToSkipATestCase 
{
	@Test
	public void login()
	{
		System.out.println("Login is successful");
		Assert.assertEquals(false, true);
	}
	
	@Test(dependsOnMethods="login")
	public void logout()
	{
		System.out.println("Logout is successful");
	}
}
