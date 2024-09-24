package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

	// URL Validation

	@Test
	public void openWebTest() {

		String URL = driver.getCurrentUrl();

		System.out.println("The Current URL is " + URL);

		Assert.assertEquals(URL, "https://www.bestbuy.com/?intl=nosplash");
	}

	// Broke URL Validation

	@Test

	public void testBrokenLink() throws IOException {

		String Url = driver.getCurrentUrl();

		URL urls = new URL(Url);

		// Creating connections using URL object link

		HttpURLConnection httpURLConnection = (HttpURLConnection) urls.openConnection();

		httpURLConnection.setRequestMethod("GET");

		httpURLConnection.connect();

		int responseCode = httpURLConnection.getResponseCode();

		if (responseCode >= 200 && responseCode <= 400) {

			System.out.println(Url + "is valid. Response code: " + responseCode);

		} else {

			System.out.println(Url + "is broken. Response Code:" + responseCode);
		}

		// Title Validation

		List<WebElement> menuItems = homepage.getAllMenu();

		// Getting all menu Items

		List<WebElement> items = driver.findElements(By.xpath("//ul[@class='hamburger-menu-flyout-list']"));

		for (WebElement item : menuItems) {

			String itemname = item.getText();

			String expectedTitle = "Best Buy | Official Online Store | Shop Now & Save";

			item.click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

			String actualTitle = driver.getTitle();

			System.out.println("The Title of the page is:  " + actualTitle);

			Assert.assertEquals(actualTitle, expectedTitle, "Title is empty for menu item: " + itemname);

			driver.navigate().back();
		}
	}

	// Bottom Link validation

	@Test
	public void bottomLink() throws InterruptedException {
		
		//Scroll Down to add in to the cart
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(2000);
		
		//Validating List of Bottom Links
		
		String[] bottomLinksText = {"Privacy Policy", "Terms and Conditions", "Interest-Based Ads"};
		
		List<WebElement> btmlink = homepage.getBottomLinks;
		
		for(WebElement btm : btmlink) {
			
			String url = btm.getAttribute("href");
			
			//Check if the url is not empty and starts with HTTP (To exclude internal links like "#"
			
			if (url != null && !url.isEmpty() && url.startsWith("http")) {
				
				driver.get(url);
			}
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			
			String Title = driver.getTitle();
			
			Assert.assertNotNull(Title , "Start Request - Best Buy" + url);
			
			System.out.println(Title);
			
			driver.navigate().back();
			
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
			
		}

	}
}
