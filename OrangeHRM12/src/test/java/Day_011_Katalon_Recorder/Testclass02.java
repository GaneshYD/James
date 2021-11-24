package Day_011_Katalon_Recorder;





import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.lang.NullPointerException;
import CommonUtil.TestBrowser;

public class Testclass02 {
	
	
	WebDriver driver;
	
	
	@Test
	public void testUntitledTestCase() throws Exception {
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 driver = TestBrowser.OpenChromeBrowser();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		    
		
	   // findElement(By.id("frmLogin")).click();
	   // findElement(By.id("txtUsername")).clear();
	    findElement(By.id("txtUsername")).sendKeys("Admin");
	   // findElement(By.id("txtPassword")).click();
	    //findElement(By.id("txtPassword")).clear();
	    findElement(By.id("txtPassword")).sendKeys("admin123");
	    findElement(By.id("btnLogin")).click();
	    
	    
	    findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    findElement(By.id("menu_admin_nationality")).click();
	   // findElement(By.xpath("//div[@id='search-results']/div/h1")).click();
	    findElement(By.id("btnAdd")).click();
	    
	    findElement(By.id("nationality_name")).click();
	   // driver.findElement(By.id("nationality_name")).clear();
	    //driver.findElement(By.id("nationality_name")).sendKeys("India114");
	   // findElement(By.id("nationality_name")).clear();
	  findElement(By.id("nationality_name")).sendKeys("India693");
	    findElement(By.id("btnSave")).click();
	   findElement(By.id("welcome")).click(); 
	   findElement(By.linkText("Logout")).click();
	   
	   driver.quit();
	}
	
	  

			public  WebElement findElement(By by) throws Exception 
			{

				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid green'", elem);
			 
				}
				return elem;
			}
	
			

		
	}
	
	  

 
  
  
  
  
  
  
  
  
  
  

