package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DepartmentPageTest extends BaseTest {
	
	@Test(priority = 2)
	
	public void departmentTest() throws InterruptedException{
		
		List<WebElement> btn = departmentPage.getKitchenAllMenu;
		
		for(WebElement btnlink : btn) {
			
			btnlink.click();
			
			Thread.sleep(2000);
		}
		
		List<WebElement> btn1 =departmentPage.getAppliances;
		
		for(WebElement btnlink1 : btn1) {
			
			btnlink1.click();
			
			Thread.sleep(2000);
		}
		
		departmentPage.setKitchenAppliances();
		
		departmentPage.setSmallKitchenAppliances();
		
		Thread.sleep(2000);
		
		 //Scrolling to the item
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);");
		
		List<WebElement> btn3 = departmentPage.setKitchenAppliancesCart();
		
		for(WebElement btnlink3 : btn3) {
			
			btnlink3.click();
			
			Thread.sleep(2000);
		}
		
		departmentPage.setKitchenGoToCart();
		
		//Assert
		
		WebElement Radd = driver.findElement(By.xpath("//a[@id='cart-4i97ebofufxm7-4mwumh2h1vmrl']"));
		
		Radd.getText();
		
		System.out.println("Recently added item is: " + Radd);
		
		Assert.assertEquals(Radd, "Bella Pro Series - 12-Cup Programmable Coffee Maker - Stainless Steel");
	}

}
