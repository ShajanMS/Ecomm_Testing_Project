package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath = "//input[@id='fld-e']")
	
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='fld-p1']")
	
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	
	WebElement  clicksignin;
	
	//@FindBy(xpath = "//button[text()='Skip for now']")
	
    //WebElement LoginSkipNow;
	
	public void setEmailAdd(String mailid) {
		
		emailAddress.sendKeys(mailid);
	}
	
	public void setPassword(String passwd) {
		
		password.sendKeys(passwd);
		
	}
	
	public void setClickSignIn() {
		
		clicksignin.click();
	}
	
	//public void setLoginSkipNow() {
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		//LoginSkipNow.click();	
	//}
}
