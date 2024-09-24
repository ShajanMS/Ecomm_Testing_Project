package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;

	public CheckoutPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary']")

	WebElement Checkout;

	@FindBy(xpath = "//button[text()='Continue as Guest']")

	WebElement ContinueAsGuest;

	@FindBy(xpath = "//button[text()='Switch to shipping']")

	WebElement SwitchToShipping;

	@FindBy(xpath = "//input[@id='firstName']")

	WebElement FirstName;

	@FindBy(xpath = "//input[@id='lastName']")

	WebElement LastName;

	@FindBy(xpath = "//input[@id='street']")

	WebElement Address;

	@FindBy(xpath = "//input[@id='city']")

	WebElement City;

	@FindBy(xpath = "//select[@id='state']")

	WebElement State;

	@FindBy(xpath = "//input[@id='zipcode']")

	WebElement ZipCode;

	@FindBy(xpath = "//input[@class='c-checkbox-input appearance-none border-25 rounded-25']")

	WebElement SaveAddress;

	@FindBy(xpath = "//button[@fdprocessedid='hlqh7']")

	WebElement Apply;

	@FindBy(xpath = "//input[@id='user.emailAddress']")

	WebElement EmailAddress;

	@FindBy(xpath = "//input[@id='user.phone']")

	WebElement MobileNumber;

	@FindBy(xpath = "//input[@id='text-updates']")

	WebElement CheckBox;

	@FindBy(xpath = "//span[text()='Continue to Payment Information']")

	WebElement PaymentInformation;

	@FindBy(xpath = "//input[@id='number']")

	WebElement CardNumber;

	@FindBy(xpath = "//input[@id='expirationDate']")

	WebElement ExpiryDate;

	@FindBy(xpath = "//input[@id='cvv']")

	WebElement CvvNumber;

	@FindBy(xpath = "//span[text()='Place Your Order']")

	WebElement PlaceOrder;

	public void setCheckout() {

		Checkout.click();
	}

	public void setContinueAsGuest() {

		ContinueAsGuest.click();
	}

	public void setSwitchToShipping() {

		SwitchToShipping.click();
	}

	public void setFirstName(String fname) {

		FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {

		LastName.sendKeys(lname);
	}

	public void setAddress(String address) {

		Address.sendKeys(address);
	}

	public void setCity(String city) {

		City.sendKeys(city);
	}

	public void setZipCode(String zip) {

		ZipCode.sendKeys(zip);
	}

	public void setSaveAddress() {

		SaveAddress.click();
	}

	public void setEmailAddress(String mail) {

		EmailAddress.sendKeys(mail);
	}

	public void setMobileNumber(String mobile) {

		MobileNumber.sendKeys(mobile);
	}

	public void setCheckBox() {

		CheckBox.click();
	}

	public void setPaymentInformation() {

		PaymentInformation.click();
	}

	public void setCardNumber(String card) {

		CardNumber.sendKeys(card);

	}

	public void setExpiryDate(String expiry) {

		ExpiryDate.sendKeys(expiry);

	}

	public void setCvvNumber(String cvv) {

		CvvNumber.sendKeys(cvv);
	}

	public void setApply() {

		Apply.click();

	}

	public void setPlaceOrder() {

		PlaceOrder.click();

	}
}
