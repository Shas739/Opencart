package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]") WebElement linkaccount;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a") WebElement linkregister;
	
	
	public void clickAcount() {
		linkaccount.click();
	}
	
	public void clickregister() {
		linkregister.click();
	}
	

}
