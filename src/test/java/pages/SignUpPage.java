package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {

	WebDriver driver;

	public SignUpPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='firstName']")

	WebElement firstName;

	@FindBy(xpath = "//input[@id='lastName']")

	WebElement lastName;

	@FindBy(xpath = "//input[@fdprocessedid='d9yqx']")

	WebElement email;

	@FindBy(xpath = "//input[@id='fld-p1']")

	WebElement password;

	@FindBy(xpath = "//input[@id='reenterPassword']")

	WebElement ConfirmPassword;

	@FindBy(xpath = "//input[@id='phone']")

	WebElement phoneNumber;

	@FindBy(xpath = "//input[@id='is-recovery-phone']")

	WebElement recoverPhoneNum;

	@FindBy(xpath = "//button[text()='Create an Account']")

	WebElement submit;

	@FindBy(xpath = "//button[text()='Skip for now']")

	WebElement SkipNow;
	
	public void setFirstName(String fname) {
		
		firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		
		lastName.sendKeys(lname);
	}
	
	public void setEmail(String mail) {
		
		email.sendKeys(mail);
	}
	
	public void setPassword(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	public void setReEnterPassword(String reenterpassword) {
		
		ConfirmPassword.sendKeys(reenterpassword);	
	}
	
	public void setPhoneNumber(String mobilenumber) {
		
		phoneNumber.sendKeys(mobilenumber);
	}
	public void setRecoverPhoneNum() {
		
		recoverPhoneNum.click();
	}
	
	public void setSubmit() {
		
		submit.click();
	}
	
	public void setSkipNow() {
		
		SkipNow.click();
	}
}
