package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resigster_Page extends BasePage{
	
	public  Resigster_Page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]") WebElement textUser;
	@FindBy(xpath="//*[@id=\"input-lastname\"]") WebElement textLastname;
	@FindBy(xpath="input-email") WebElement textEmail;
	@FindBy(xpath="//*[@id=\"input-telephone\"]") WebElement phone;
	@FindBy(xpath="//*[@id=\"input-password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"input-confirm\"]") WebElement confirmPassword;
	@FindBy(xpath ="//*[@id=\"content\"]/h1") WebElement confirmmsg;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[1]") WebElement clickOn;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]") WebElement clickContinue;
	
	
	public void setName(String textUser1) {
		
		textUser.sendKeys(textUser1);
	}
	
	public void setLastname(String lastName) {
		
		textLastname.sendKeys(lastName);
		
	}
	
	public void setEmail(String email) {
		
		textEmail.sendKeys(email);
		
	}
public void setPhone(String phone1) {
		
	phone.sendKeys(phone1);
		
	}
	
	public void setPassword(String password1) {
		
		
		password.sendKeys(password1);
	}
public void setConfirmPassword(String password2) {
		
		
		password.sendKeys(password2);
	}
	
	
	public void clickOn() {
		clickOn.click();
	}
	
	public void clickContinue() {
		
		clickContinue.click();
	}
	
	
	public String getConfiration() {
		try {
			return(confirmmsg.getText());
		}catch(Exception e){
			
			return(e.getMessage());
			
			
		}
	}

	

	
}
