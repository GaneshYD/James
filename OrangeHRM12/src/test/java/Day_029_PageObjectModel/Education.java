package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Education
{
	
	WebDriver driver;
	
	
	
	
	public void Education(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public  void AddEducation() throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_viewEducation")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("education_name")).sendKeys("Diploma ppe");
		findElement(By.id("btnSave")).click();
		
	}
	
	
	public   WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}
	

}












