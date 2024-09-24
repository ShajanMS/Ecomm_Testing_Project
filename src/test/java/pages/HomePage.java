package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Top Deals']")
	
	WebElement TopDeal;
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	
	WebElement DealOfTheDay;
	
	@FindBy(xpath = "//a[text()='Yes, Best Buy Sells That']")
	
	WebElement YesBestBuySellsThat;
	
	@FindBy(xpath = "//span[@class='v-p-right-xxs line-clamp']")
	
	WebElement Account;
	
	@FindBy(xpath = "//a[text()='Sign In']")
	
	WebElement SignIn;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	
	WebElement CreateAccount;
	
	@FindBy(xpath = "//button[@fdprocessedid='bx21e']")
	
	WebElement AllMenu;
	
	@FindBy(xpath = "//div[@class='flex justify-content-start']")
	
	WebElement BottomLinks;

	public List<WebElement> getBottomLinks;
	
	public void getTextTopDeal() {
		
		TopDeal.getText();
	}
	
	public void textDealOfTheDay() {
		
		DealOfTheDay.getText();
	}
	
	public void bestButSell() {
		
		YesBestBuySellsThat.click();
	}
	
	public void setAccount() {
		
		Account.click();
	}
	
	public void setSignIn() {
		
		SignIn.click();	
	}
	
	public void setCreateAccount() {
		
		CreateAccount.click();
	}

	public List<WebElement> getAllMenu() {
		return null;
	}

	
}
