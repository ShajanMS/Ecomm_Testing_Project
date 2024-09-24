package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeSignUp extends BaseTest {
	
	@Test
	
	public void negativeSignUp() throws InterruptedException{
		
		//Click Account button
		
		homepage.setAccount();
		
		Thread.sleep(2000);
		
		homepage.setCreateAccount();
		
		signuppage.setFirstName("Mohamed");
		signuppage.setLastName("Shajan");
		signuppage.setEmail("mohamedshajanh@gmail.com");
		signuppage.setPassword("temp12345");
		signuppage.setReEnterPassword("temp12345");
		signuppage.setPhoneNumber("9944611920");
		signuppage.setRecoverPhoneNum();
		signuppage.setSubmit();
		
		WebElement error = driver.findElement(By.xpath("//strong[text()='An account with this email already exists.']"));
		
		Thread.sleep(5000);
		
		String actualErrorMessage = error.getText();
		
		Assert.assertEquals(actualErrorMessage, "An account with this email already exists.");
	}

}
