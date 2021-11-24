package AAA_DDD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtil.OR;
import Day_013_TestNG_Paraneters1.Reporter1;
import Day_034_TestNG_Listeners.TestBrowser;
import ExcelUtil.ExcelApiTest4;

public class NewTest {
	WebDriver driver;
	Reporter1 R1;
	public static int iRow=0;
	@Parameters({"Brower"})
	@BeforeTest
	
	public void OpenBrowser(String browser) throws Exception {
		
		if(browser.equalsIgnoreCase("Chrome")) {
		driver=TestBrowser.OpenChromeBrowser();
				System.out.println("Chrome Brwoser Started :"+browser);	
		}
		else if(browser.equalsIgnoreCase("IE")) {
		driver=TestBrowser.OpenIEBrowser();
				System.out.println("IE Brwoser Started :"+browser);	}
		
		else if(browser.equalsIgnoreCase("FireFox")) {
			driver=TestBrowser.OpenIEBrowser();
					System.out.println("FireFox Brwoser Started :"+browser);	}
			
		else
		{
			driver = TestBrowser.OpenChromeBrowser();
			System.out.println("Chrome Brwoser Started :"+browser);
		}
		
		
	}
	@DataProvider(name = "Sample")
	public static Object[][] Authentication1() throws Exception {

		ExcelApiTest4 eat = new ExcelApiTest4();
		Object[][] testObjArray = eat.getTableArray("C://HTML Report//OrangeHRM6//TC01_QuaSkills.xlsx", "Sheet1");
		System.out.println(testObjArray.length);
		return (testObjArray);
	}
  @Test(dataProvider="Sample")
  public void SkillsTest(String URL, String username1,String password1,String skill,String skilldsc)throws Exception {
	  
	  if (iRow==0)
	  {//iRow++;
			iRow=iRow+1;
			
			String str= "nationality".concat("_Iterration_").concat(String.valueOf(iRow)) ;
			R1= new Reporter1(driver,str);	
			
			 driver.get(URL);
			 R1.TakeScreenShotAuto(driver,"Open chrome Browser and URL ","Pass");
			 
			 Login(username1,password1);
			 AddSkills(skill,skilldsc);
			 }
	  
			 else
				{
					//iRow++;
					iRow=iRow+1;
					
					String str= "TC01_Skill".concat("_Iterration_").concat(String.valueOf(iRow)) ;
					R1= new Reporter1(driver,str);	
					AddSkills(skill,skilldsc);
					   
  }
  }
	  public  void Login(String username1,String password1) throws Exception 
	  {
	findElement(By.xpath(OR.username_sendkey)).sendKeys(username1);
	R1.TakeScreenShotAuto(driver,"UserName Entered","Pass");

	
	findElement(By.xpath(OR.password_sendkey)).sendKeys(password1);
	R1.TakeScreenShotAuto(driver,"Password Entered","Pass");

	findElement(By.xpath(OR.login_click)).click();
	R1.TakeScreenShotAuto(driver,"Sign In  Clicked","Pass");
}




public  void  AddSkills(String skill,String skilldsc) throws Exception{

	findElement( By.xpath(OR.Admin)).click();
	R1.TakeScreenShotAuto(driver,"Admin clicked","Pass");
	findElement(By.linkText("Qualifications")).click();
	R1.TakeScreenShotAuto(driver,"Qualification clicked","Pass");
	findElement(By.id("menu_admin_viewSkills")).click();
	R1.TakeScreenShotAuto(driver,"viewSkills clicked","Pass");
	
	findElement(By.id("btnAdd")).click();
	R1.TakeScreenShotAuto(driver,"Add clicked","Pass");
	findElement(By.id("skill_name")).sendKeys(skill);
	R1.TakeScreenShotAuto(driver,"skill Entered","Pass");
	findElement(By.id("skill_description")).sendKeys(skilldsc);
	R1.TakeScreenShotAuto(driver,"skilldescr Entered","Pass");
	findElement(By.id("btnSave")).click();
	R1.TakeScreenShotAuto(driver,"save clicked","Pass");
}


public    WebElement findElement(By by) throws Exception 
{
	
	WebElement elem = driver.findElement(by);  
	
	if (driver instanceof JavascriptExecutor) 
	{
	 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 
	}
	return elem;
}
}



 
  
  

