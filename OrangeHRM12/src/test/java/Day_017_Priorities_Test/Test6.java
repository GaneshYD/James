package Day_017_Priorities_Test;

import org.testng.annotations.Test;

public class Test6 {
	
	
  @Test(priority=0)
  public void Test100() {
	  
	  System.out.println("Test100");
  }
  
  @Test(priority=-1)
  public void Test2() {
	  
	  System.out.println("Test2");
  }
  
  
  @Test(priority=0)
  public void Test3() {
	  
	  System.out.println("Test3");
  }
  
  
  
  @Test
  public void Test4() {
	  
	  System.out.println("Tes4");
  }
  
  
  @Test
  public void Test5() {
	  
	  System.out.println("Test5");
  }
  
  
  @Test(priority=0)
  public void Test6() {
	  
	  System.out.println("Test6");
  }
  
  
}
