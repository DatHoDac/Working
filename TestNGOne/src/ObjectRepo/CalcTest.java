package ObjectRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class CalcTest {
	WebDriver driver = new FirefoxDriver(); 
	
	
  @Test
  public void Calc_operations() throws Exception {
	//Create Object of Properties Class.
	  Properties obj = new Properties();
	//Create Object of FileInputStream Class. Pass file path.
	  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepo\\objects.properties");
	//Pass object reference objfile to load method of Properties object.
	  obj.load(objfile);
	  
	  //Sum operation on calculator.
	  //Accessing element locators of all web elements using obj.getProperty(key)
	  driver.findElement(By.id(obj.getProperty("five"))).click();
	  driver.findElement(By.id(obj.getProperty("plus"))).click();
	  driver.findElement(By.id(obj.getProperty("eight"))).click();
	  driver.findElement(By.id(obj.getProperty("equalsto"))).click();
	  
	  String i = driver.findElement(By.id(obj.getProperty("result"))).getAttribute("value");
	  System.out.println(i);
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  	
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");   
	  driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  

}
