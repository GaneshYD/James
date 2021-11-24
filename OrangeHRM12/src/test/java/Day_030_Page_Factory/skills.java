package  Day_030_Page_Factory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class skills
{
	
	WebDriver driver;
	
	public void skills(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
    WebElement Admin;  

    @FindBy(id="menu_admin_Qualifications")
    WebElement Qualifications ;  
	
    @FindBy(id="menu_admin_viewSkills")
    WebElement viewSkills;  
    
    @FindBy(id="btnAdd")
    WebElement btnAdd;  
    
    @FindBy(id="skill_name")
    WebElement Java12;  
	
    @FindBy(id="skill_description")
    WebElement Skilldescr;
    
    @FindBy(id="btnSave")
    WebElement Save_button;
    
    
	public  void AddSkills() throws Exception
	{
		/*findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Mexican89");
		findElement(By.id("btnSave")).click();*/
	
		Admin.click();
		Qualifications.click();
		viewSkills.click();
		btnAdd.click();
		Java12.sendKeys ("Java15");
		Skilldescr.sendKeys ("Java15 descr");
		Save_button.click();
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




	
	
	













