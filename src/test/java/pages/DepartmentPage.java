package pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import lombok.Getter;

public class DepartmentPage {

	

	WebDriver driver;

	public DepartmentPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@Getter

	@FindBy(xpath = "//button[@class='c-button-unstyled hamburger-menu-button']")

	List<WebElement> KitchenAllMenu;

	@Getter

	@FindBy(xpath = "//button[@data-id='node-181']")

	List<WebElement> Appliances;

	@FindBy(xpath = "//button[@fdprocessedid='b31s5a']")

	WebElement SKitchenAppliances;

	@FindBy(xpath = "//a[text()='Small Kitchen Appliance Deals']")

	WebElement SmallKitchenAppliances;

	@FindBy(xpath = "//button[@fdprocessedid='2n9sq']")

	List<WebElement> KitchenAppliancesCart;

	@FindBy(xpath = "//a[text()='Go to Cart']")

	WebElement KitchenGoToCart;

	public List<WebElement> getKitchenAllMenu;

	public List<WebElement> getAppliances;

	public void setKitchenAppliances() {

		SKitchenAppliances.click();
	}

	public void setSmallKitchenAppliances() {

		SmallKitchenAppliances.click();
	}

	public List<WebElement> setKitchenAppliancesCart() {

		return KitchenAppliancesCart;
	}

	public void setKitchenGoToCart() {

		KitchenGoToCart.click();

	}
}
