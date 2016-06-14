package TestNGOnePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DiferenceofFindElement_and_FindElements {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	 public void beforetest() {
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	 }
	 
	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	 
	 @Test
  	public void testaaaaa () throws InterruptedException 
  	{  
	  
		  WebElement option = driver.findElement(By.xpath("//option[@id='country5']"));
		  System.out.print(option.getAttribute("id")+" - "+option.getText());
//		  List<WebElement> options= driver.findElements(By.xpath("//option"));
//		  System.out.println(options.size());
//		  for(int i=0;i<=options.size();i++)
//		  {
//		   String str = options.get(i).getAttribute("id")+" - "+options.get(i).getText();
//		   System.out.println(str);
//		   
//		  }
  	}
}
