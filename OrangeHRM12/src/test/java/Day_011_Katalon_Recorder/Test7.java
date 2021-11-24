package Day_011_Katalon_Recorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;



public class Test7 {
	

	WebDriver driver;

  
  @Test
  public void testTC01Nationalites() throws Exception {
	  
	driver=TestBrowser.OpenChromeBrowser();
   
    driver.findElement(By.id("txtUsername")).click();
    driver.findElement(By.id("txtUsername")).clear();
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
    driver.findElement(By.id("menu_admin_Qualifications")).click();
    driver.findElement(By.id("menu_admin_viewSkills")).click();
    driver.findElement(By.id("btnAdd")).click();
    driver.findElement(By.id("skill_name")).click();
    driver.findElement(By.id("skill_name")).clear();
    driver.findElement(By.id("skill_name")).sendKeys("Java10");
    driver.findElement(By.id("skill_description")).click();
    driver.findElement(By.id("skill_description")).clear();
    driver.findElement(By.id("skill_description")).sendKeys("Java 10 descr");
    driver.findElement(By.id("btnSave")).click();
    
  }
  
  
  
  
}
