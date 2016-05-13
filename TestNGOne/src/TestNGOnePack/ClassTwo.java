package TestNGOnePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassTwo extends TestNGOnePack.BaseClassOne {
	
	String ActualText;
	
	@BeforeClass
	public void load_url(){
		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}
	
//	//@Test annotation describes this method as a test method
//	@Test
//	public void testmethodone() {
//		driver.navigate().to("http://only-testing-blog.blogspot.in/2014/01/textbox.html"); 
//		String title = driver.getTitle(); 
//		System.out.print("\nCurrent page title is : "+title); 
//		String Workdir = System.getProperty("user.dir"); 
//		String Classpackname = this.getClass().getName(); 
//		System.out.print("\n'"+Workdir+" -> "+Classpackname+" -> testmethodone' has been executed successfully");
//	}
	
	//Method Example for Assertion
	@Test
	public void assertion_method_1(){
		ActualText = driver.findElement(By.xpath("//h2/span")).getText();
		Assert.assertNotEquals(ActualText, "Tuesday, 28 January 2014", "Expected and actual match in assertion_method_1");
		System.out.println("\n assertion_method_1() -> Part executed");
	}
	//Method Example for Assertion
	@Test
	public void assertion_method_2(){
		Assert.assertNotEquals(ActualText, "Tuesday, 29 January 2014", "Expected and actual match in assertion_method_2");
		System.out.println("\n assertion_method_2() -> Part executed");
	}
	
	//Method Example for Assertion
	@Test
	public void verification_method(){
		
		String time = driver.findElement(By.xpath("//div[@id='timeLeft']")).getText();
		
		if(time == "Tuesday, 28 January 2014")
		{
			System.out.println("\n Text Match");
		}
		else
		{
			System.out.println("\n Text doesnt match");
		}
		
	}
	
//	WebElement chk1, chk2;
//	@BeforeClass
//	public void load_url(){
//		driver.get("http://only-testing-blog.blogspot.in/2014/02/attributes.html"); 
//		chk1 = driver.findElement(By.xpath("//input[@name='option1']")); 
//		chk2 = driver.findElement(By.xpath("//input[@name='option2']"));
//	}
	
//	//Assertion Method - will pass 
//	@Test 
//	public void asserttrue1() { 
//		System.out.print("\n"+chk1.isSelected()); 
//		Assert.assertTrue(chk1.isSelected()); 
//		System.out.print("\n asserttrue1 - > Executed - means assertion is pass"); 
//	} 
//	
//	//Assertion Method - will fail 
//	@Test 
//	public void asserttrue2() { 
//		System.out.print("\n"+chk2.isSelected()); 
//		Assert.assertTrue(chk2.isSelected()); 
//		System.out.print("\n asserttrue2 - > Executed - means assertion is pass"); 
//	}
	
//	//Assertion Method - will Fail 
//	@Test 
//	public void assertfalse1() { 
//		System.out.print("\n"+chk1.isSelected()); 
//		Assert.assertFalse(chk1.isSelected()); 
//	} 
//	//Assertion Method - will Pass 
//	@Test 
//	public void assertfalse2() { 
//		System.out.print("\n"+chk1.isSelected()); 
//		Assert.assertFalse(chk2.isSelected()); 
//	}
	
	
	
	
}
