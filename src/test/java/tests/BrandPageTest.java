package tests;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.BrandPage;

public class BrandPageTest extends BaseTest{
	
	@Test(priority = 3)
	
	public void testBrandPage()throws InterruptedException{
		
		this.brandPage = new BrandPage(driver);
		
		List<WebElement> btn = brandPage.getBrandAllMenu();
		
		for(WebElement btnlink : btn) {
			
			btnlink.click();
			
			Thread.sleep(2000);
		}
		
		List<WebElement> btn1 = brandPage.getBrandbutton();
		
		for (WebElement btnlink1 : btn1) {
			
			btnlink1.click();
			
			Thread.sleep(2000);
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		brandPage.setBrandApple(wait);
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		brandPage.setSmartPhone(wait1);
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		brandPage.setIphone16plus(wait2);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(2000);
		
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		brandPage.setBrandCart(wait3);
		
		brandPage.setBrandGoToCartCart(wait2);
	}

}
