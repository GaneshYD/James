package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Locations
{
	
	WebDriver driver;
	
	public void Locations(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void AddLocations() throws Exception
	
	{
	
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Organization")).click();
		findElement(By.linkText("Locations")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		
		
		Select dropdown1 = new Select(driver.findElement(By.id("location_country")));
		 dropdown1.selectByValue("IN");
		 
		 List<WebElement> elements=dropdown1.getOptions();
		 
		 for(WebElement element:elements)
		 {
			 System.out.println(element.getText());
		 }
		
		
		
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















