package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test
	
	public void testLoginPage()throws InterruptedException{
		
		homepage.setAccount();
		
		Thread.sleep(2000);
		
		homepage.setSignIn();
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.setEmailAdd("mohamedshajanh@gmail.com");
		
		loginPage.setPassword("Temp@1234");
		
		loginPage.setClickSignIn();
		
		//loginPage.setLoginSkipNow();
		
		//Assert Validation
		
		String Store = driver.getTitle();
		
		System.out.println(Store);
		
		Assert.assertEquals(Store, "Sign In to Best Buy");
		
	}

}
