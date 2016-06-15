package TestNGOnePack;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestLog4J {
	
	WebDriver driver = new FirefoxDriver();
	static Logger  log = Logger.getLogger(TestLog4J.class);
	 @BeforeTest
	 public void beforetest() {
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	  
	  String log_folder = "C:\\Logs";
	  new File(log_folder).mkdir();
	 }
	 
	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	  
	 }
	
  @Test
  public void test() 
  {
	  BasicConfigurator.configure();
	  driver.findElement(By.id("text1")).sendKeys("My First Name");
	
	  log.info("Type text into my first nadfsdfhsdjkfsx");
	  
	  //Selecting value from drop down using visible text
	  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
	  mydrpdwn.selectByVisibleText("Audi");
	  
	  log = Logger.getLogger(TestLog4J.class);
	  log.info("select value from dropdown.");
	  
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("text2")));
  }
}
