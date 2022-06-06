package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/ankitagovind/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://online.actitime.com/tcs5/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		driver.findElement(By.id("username")).sendKeys("ankitagupta15jan@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("qYmz@z%5");
		driver.findElement(By.id("loginButton")).click();
	
	}


	@AfterTest
	public void logout() throws InterruptedException {
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(8000);
		driver.close();
	}

}
