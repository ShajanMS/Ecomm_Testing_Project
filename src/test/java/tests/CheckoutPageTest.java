package tests;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {
	
	@Test(priority = 4)
	
	public void testCheckoutPage() {
		
		checkoutPage.setCheckout();
		checkoutPage.setContinueAsGuest();
		checkoutPage.setSwitchToShipping();
		checkoutPage.setFirstName("Mohamed");
		checkoutPage.setLastName("Shajan");
		checkoutPage.setAddress("Velachery, Chennai");
		checkoutPage.setCity("Chennai");
		
		//Dropdown
		
		WebElement Drp = driver.findElement(By.xpath("//select[@id='state']"));
		
		Select select = new Select(Drp);
		
		select.selectByValue("AP");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		checkoutPage.setZipCode("600100");
		
		checkoutPage.setSaveAddress();
		
		//Scroll to Email
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);");
		
		checkoutPage.setEmailAddress("hcat12123@gmail.com");
		checkoutPage.setMobileNumber("9944611920");
		checkoutPage.setCheckBox();
		checkoutPage.setPaymentInformation();
		checkoutPage.setCardNumber("4000000000001000");
		checkoutPage.setExpiryDate("11/26");
		checkoutPage.setCvvNumber("901");
		checkoutPage.setApply();
		
		//Scroll to Place Order
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].scrollIntoView(true);");
		
		//Assert
		
		String title = driver.getTitle();
		
		System.out.println("The Tilte of the Page is " + title);
		
		Assert.assertEquals(title, "Checkout - Best Buy");
	}

}
