package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeLoginPage extends BaseTest {
	
	@Test
	
	public void testNegativeLoginPage() throws InterruptedException{
		
		//Click on Account Button
		
		homepage.setAccount();
		
		Thread.sleep(2000);
		
		homepage.setSignIn();
		
		//Send credentials
		
		loginpage.setEmailAdd("mohamedshajanh@gmail.com");
		
		loginpage.setPassword("temp@12345");
		
		loginpage.setClickSignIn();
		
		Thread.sleep(2000);
		
		// Handling Error Message
		
		WebElement Store = driver.findElement(By.xpath("//div[text()='Sorry, something went wrong. Please try again.']"));
		
		Store.getText();
		
		Thread.sleep(2000);
		
		Assert.assertEquals(Store, "Sorry, something went wrong. Please try again");
		
		System.out.println(Store);
	}

}
