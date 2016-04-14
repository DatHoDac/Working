package mytestclass;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
//		   System.out.println(LocalDateTime.now()); 
		  try {
			  System.out.println("lan 1: " + LocalDateTime.now()); 
			  WebDriverWait wait = new WebDriverWait(driver, 30);
			  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("String Time left: 7 seconds not exist in 30 secs");
				System.out.println("lan 2: " + LocalDateTime.now());	
			}
					
		  
		  driver.close();
		 }
	 

}
