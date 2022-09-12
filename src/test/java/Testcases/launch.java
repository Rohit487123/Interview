package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	
	
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.elementToBeClickable(By.id("Coforge")));
	
	
	
	FluentWait wait = new FluentWait(driver);
	wait.withTimeout(Duration.ofSeconds(120));
	wait.pollingEvery(Duration.ofSeconds(5));
	//wait.until(ExpectedConditions.elementToBeClickable(null));
	
	
	
	
	
	
	
	
	}

}
