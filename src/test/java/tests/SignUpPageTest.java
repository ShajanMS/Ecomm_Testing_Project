package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends BaseTest {
	
	@Test
	
	public void validatePositiveSignUp()throws InterruptedException{
		
		homepage.setAccount();
		
		Thread.sleep(2000);
		
		signuppage.setFirstName("Mohamed");
		signuppage.setLastName("Shajan");
		signuppage.setEmail("mohamedshajanh@gmail.com");
		signuppage.setPassword("Temp@1234");
		signuppage.setReEnterPassword("Temp@1234");
		signuppage.setPhoneNumber("9944611920");
		signuppage.setRecoverPhoneNum();
		signuppage.setSubmit();
		signuppage.setSkipNow();
		
		WebElement Store = driver.findElement(By.xpath("//div[@class='welcome-wrapper--not-emphasized']"));
		
		Store.getText();
		
		Assert.assertEquals(Store, "Hi, vishnu priya. Welcome you back.");
	}

}
