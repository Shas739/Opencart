package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Resigster_Page;

public class TC001_resigster_varification extends BaseClass{
	
	public WebDriver driver;
	
	
	
	@Test
	public void verify() {
		
		
		
		HomePage hp = new HomePage(driver);
		
		hp.clickAcount();
		
		
		hp.clickregister();
		
		
		
		Resigster_Page rp = new Resigster_Page(driver);
		rp.setName(randomString().toUpperCase());
		
		
		rp.setLastname(randomString().toUpperCase());
		rp.setEmail(randomString()+"@gmail.com");
		
		String call =randomNumeric();
		rp.setPhone(call);
		
		
		
		String password = alphaNumeic();
		
		
				
				
		rp.setPassword(password);
		rp.setConfirmPassword(password);
		rp.clickOn();

		rp.clickContinue();
		
		
		String confirm =rp.getConfiration();
		
		Assert.assertEquals(confirm, "Your Account Has Been Created!");
	}
	
	

}
