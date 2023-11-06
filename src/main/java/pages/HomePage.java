package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	// Parameterized constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//span[text()='Vehicles']")
	WebElement vehicles;
	
	public void clickVehicles() throws InterruptedException {
		vehicles.click();
		Thread.sleep(3000);
	}
	
	
	

}
