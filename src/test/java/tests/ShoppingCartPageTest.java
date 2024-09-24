package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ShoppingCartPageTest extends BaseTest {
	
	@Test(priority = 1)
	
	public void searchProduct() throws InterruptedException{
		
		shoppingCartPage.setSearchBar("Dell Laptop");
		
		shoppingCartPage.setSearchButton();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-order='1']"))).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-sku-id='6571087']"))).click();
		
		js.executeScript("arguments[0].scrollIntoView(true);");
		
		Thread.sleep(5000);
		
		shoppingCartPage.setGoToCart();
		
	}

}
