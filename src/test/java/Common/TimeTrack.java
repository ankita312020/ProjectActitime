package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeTrack extends Base{
	

	@Test
	public void report() throws InterruptedException {
		Thread.sleep(5000);
		Assert.assertEquals("May 30 - Jun 05, 2022", driver.findElement(By.xpath
				("//div[@class='components-WeekPicker-weeksContainer--1Mw9vBpN']//span")).getText() ,
				"Date text not displayed");
		driver.findElement(By.xpath("//span[@class='components-WeekPicker-arrow--2Xg8TQzH'][2]")).click();
		driver.findElement(By.xpath("//span[@class='components-WeekPicker-arrow--2Xg8TQzH'][1]")).click();

		
	}
}
