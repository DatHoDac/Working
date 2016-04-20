package mytestclass;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;



import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
import com.google.common.base.Stopwatch;


public class mytestclass {


	 public static void main(String[] args) {
		  WebDriver driver = new FirefoxDriver();
		  driver.get("http://only-testing-blog.blogspot.in");
//		  String i = driver.getCurrentUrl();
//		  System.out.println(i);
//		  System.out.println("this is Dat");
//		  driver.findElement(By.id("submitButton")).submit();
//		  AlertActions alert = new AlertActions(driver);
//		  if(alert.isAlertexist()){
//			  String alertmes = driver.switchTo().alert().getText();
//			  driver.switchTo().alert().accept();
//			  System.out.println("Alert message like: " +  alertmes);
//		  }else{
//			  System.out.println("Alert isn't exist.");
//		  }
  
//		  4. Store text of targeted element in variable
//		  String dropdown = driver.findElement(By.tagName("select")).getText();
//		  System.out.println(dropdown);
		  
		  
//		  5. Typing text in text box or text area.
//		  driver.findElement(By.name("fname")).sendKeys("My First Name");
//		  6. Applying Implicit wait in webdriver
//		  for (int i = 0; i < 15; i++) {
//			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			  System.out.println("Second: " +  i);
//		}
		  
//		  7. Applying Explicit wait in webdriver with WebDriver canned conditions.  
//		   try {
//			  System.out.println("lan 1: " + LocalDateTime.now()); 
//			  WebDriverWait wait = new WebDriverWait(driver, 10);
//			  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("String Time left: 7 seconds not exist in 10 secs");
//				System.out.println("lan 2: " + LocalDateTime.now());	
//			}
					
//		  10. Get domain name using java script executor
//		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		  String CurrentURLUsingJS=(String)javascript.executeScript("return document.domain");
//		  System.out.println("Domain is: " + CurrentURLUsingJS);	
		  
//		  11. Generate alert using webdriver's java script executor interface
		  
//		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		  javascript.executeScript("alert('Test Case Execution Is started Now..');");
		  
//		  12. Selecting or Deselecting value from drop down in selenium webdriver.
//		  Select By Visible Text
//		  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
//		  mydrpdwn.selectByVisibleText("Audi");
		  
//		  Select By Value
//		  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  listbox.selectByValue("Italy");
		  
//		  Select By Index
//		  Select listbox2 = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  listbox2.selectByIndex(0);
		  
//		  isMultiple()
//		  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  boolean value = listbox.isMultiple();
//		  System.out.println(value);
		  
//		  13. Navigate to URL or Back or Forward in Selenium Webdriver
//		  driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html#sthash.9Q3Ew9bn.dpuf");
//		  driver.navigate().back();
//		  String a = driver.getTitle();
//		  String aa = driver.getCurrentUrl();
//		  System.out.println(a + " ; " + aa);
//		  driver.navigate().forward();
//		  String b = driver.getTitle();
//		  String bb = driver.getCurrentUrl();
//		  System.out.println(b + ";" + bb);
		  
//		  14. Verify Element Present in Selenium WebDriver
		  Boolean isExist = driver.findElements(By.xpath("//input[@id='text2']")).size()!= 0;
		  Boolean isExist2 = driver.findElements(By.xpath("//select[@name='FromLB']")).size()!= 0;
		  
		  System.out.println(isExist + " ; " + isExist2);
//		  driver.close();
		 }
	 

}
