package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import lombok.Getter;

public class BrandPage {
	
	WebDriver driver;
	
	public BrandPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@Getter
	
	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")
	
	List<WebElement> BrandAllMenu;
	
	public List<WebElement> getBrandAllMenu() {
		
		return BrandAllMenu;
	}
	
	@Getter
	
	@FindBy(xpath = "//button[text()='Brands']")
	
	List<WebElement> Brandbutton;
	
	public List<WebElement> getBrandbutton() {

		return Brandbutton;
	}
	
	@Getter
	
	@FindBy(xpath = "//a[text()='Apple']")
	
	WebElement BrandApple;
	
	@Getter
	
	@FindBy(xpath = "//*[@id=\"widget-9bc5db23-9f62-4ded-8b58-511aee4ea7b9\"]/div/div[2]/div[1]/div[2]/div/a")
	
	WebElement SmartPhone;
	
	@Getter
	
	@FindBy(xpath = "//*[@id=\"widget-c49b675f-f9aa-4d6b-9e6d-cca0fb66be41\"]/div/div[2]/div[1]/div[8]/div/a")
	
	WebElement Iphone16plus;
	
	@Getter
	
	@FindBy(xpath = "//button[@data-button-state='ADD_TO_PACKAGE_MOBILE']")
	
	WebElement BrandCart;
	
	@Getter
	
	@FindBy(xpath = "//a[text()='Go to Cart']")
	
	WebElement BrandGoToCart;

	public void setBrandApple(WebDriverWait wait) {
		
		BrandApple.click();
	}
	
	public void setSmartPhone(WebDriverWait wait) {
		
		SmartPhone.click();
	}
	
	public void setIphone16plus(WebDriverWait wait){
		
		Iphone16plus.click();
	}
	
	public void setBrandCart(WebDriverWait wait) {
		
		BrandCart.click();
	}
	
	public void setBrandGoToCartCart(WebDriverWait wait) {
		
		BrandGoToCart.click();
	}

}
