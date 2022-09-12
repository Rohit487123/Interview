package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class branch {
	
	@Test
	public void launchChrome()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

String title = driver.getTitle();
String url= driver.getCurrentUrl();

Assert.assertEquals(url,"https://www.facebook.com/");

	}
}
