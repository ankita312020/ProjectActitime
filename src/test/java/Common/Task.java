package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task extends Base{

		

	@Test
	public void report() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='addNewButton']//div[@class='downIcon']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys("TCS");//use current timestapm
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='contentWrapper ']//div[@class='innerContent']//div[@class='descriptionSection section']//div[@class='characterCounter']")).sendKeys("this is the best");
		driver.findElement(By.xpath("//div[@class='emptySelection']")).click();
		driver.findElement(By.xpath("//div[@class='searchItemList']//div[@class='itemRow cpItemRow '][2]")).click();
		driver.findElement(By.xpath("//div[@class='components_button_label' and contains(text(), 'Create Customer')]")).click();
		
		//driver.close();
		//driver.findElement(By.xpath("//input[@type='text' and @name='firstName' and @id='editUserPanel_firstNameField']")).sendKeys("jupitor");
		//driver.findElement(By.id("createUserPanel_lastNameField")).sendKeys("hold");
		//driver.findElement(By.id("createUserPanel_emailField")).sendKeys("jupitor@gmail.com");
		
}
}