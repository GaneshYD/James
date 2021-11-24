package ABC_Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	@Test
	public void LoginTest() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.manage().deleteAllCookies();
		

		//Select dropdown1 = new Select(driver.findElements(By.id("location_country1")));
		// dropdown1.selectByValue("IN");
		 
		
		 List<WebElement> elements=driver.findElements(By.xpath("//*[@id='tab']"));
		 int total_dropdown=elements.size();
		
		
	}

}
