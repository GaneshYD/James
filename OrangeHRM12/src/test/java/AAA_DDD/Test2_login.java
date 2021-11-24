package AAA_DDD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2_login {
	
	WebDriver driver;
	
	
  @Test
  public void Test2Login() {
	  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
  }
  
  
}
