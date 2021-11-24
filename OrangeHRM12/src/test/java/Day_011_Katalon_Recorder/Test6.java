package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;



public class Test6 {
	

	WebDriver driver;

  
  @Test
  public void testTC01Nationalites() throws Exception {
	  
	driver=TestBrowser.OpenChromeBrowser();
   
	driver.get("https://opensource-demo.orangehrmlive.com/");
   
	driver.findElement(By.id("txtUsername")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).click();
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
    
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.id("menu_admin_nationality")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("nationality_name")).click();
    driver.findElement(By.id("nationality_name")).clear();
    driver.findElement(By.id("nationality_name")).sendKeys("Indian76");
    driver.findElement(By.id("btnSave")).click();
    
  }
  
  
  
  
}
