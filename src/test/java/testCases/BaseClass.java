package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
public WebDriver driver;


	//@Parameters({"os","browser"})
	@BeforeClass
	public void setup(String os , String br) {
		
		
//		switch(br.toLowerCase()) {
//		case "chrome" :driver = new ChromeDriver();break;
//		case "edge" : driver = new EdgeDriver();break;
//		case "firefox": driver = new FirefoxDriver();break;
//		default : System.out.println("Invalid browser name"); return;
//		}
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
	}
	
	public String randomString() {
		String generateString = RandomStringUtils.randomAlphabetic(5);
		return generateString;
	}
	
	public String randomNumeric() {
		String generateNumeric = RandomStringUtils.randomNumeric(10);
		return generateNumeric;
	}
	
	public String alphaNumeic() {
		String alpha = RandomStringUtils.randomAlphabetic(3);
		String num = RandomStringUtils.randomNumeric(3);
		
		return (alpha+num);
		
	}
	
}
