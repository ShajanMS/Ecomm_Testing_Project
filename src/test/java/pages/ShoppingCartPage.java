package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	WebDriver driver;

	public ShoppingCartPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='gh-search-input']")

	WebElement SearchBar;

	@FindBy(css = ".header-search-button")

	WebElement SearchButton;

	@FindBy(xpath = "//a[text()='Go to Cart']")

	WebElement GoToCart;

	public void setSearchBar(String Inputsearchbar) {

		SearchBar.sendKeys(Inputsearchbar);
	}

	public void setSearchButton() {

		SearchButton.click();
	}

	public void setGoToCart() {

		GoToCart.click();

	}

}
