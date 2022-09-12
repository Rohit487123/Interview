package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {
	
	@Test
	public static void launchDriver() {
	
	//public static WebDriver driver;
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.coforge.com");
	String currenturl=driver.getCurrentUrl();
	System.out.println(currenturl);
	String title =driver.getTitle();
	System.out.println(title);
	
	SoftAssert softAssert = new SoftAssert();
	softAssert.assertEquals(currenturl, "https:www.coforge.com");
	System.out.println("ok");
	driver.quit();
	//softAssert.assertAll();
	
	
	
	
	
	}

}
