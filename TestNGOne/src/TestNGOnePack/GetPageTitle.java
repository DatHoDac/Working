package TestNGOnePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetPageTitle {
	
	WebDriver driver = new FirefoxDriver();
	
	
	 @BeforeTest
	 public void beforetest() {
	  driver.manage().window().maximize();
	  driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 }
	 
	 @AfterTest
	 public void aftertest() {
	  driver.quit();
	 }
		
//	//GET PAGE TITLE
//	 @Test
//	 public void test() {
//		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("My Name");
//		 driver.findElement(By.xpath("//button[@type='submit']")).submit();
//		 
//		 
//		 WebDriverWait wait = new WebDriverWait(driver, 15);
//		 wait.until(ExpectedConditions.titleContains("My Name"));
//		 
//		 String title = driver.getTitle();
//		 System.out.println(title);
//	}
	 
	 
//	 //GET PAGE TITLE BY USING JAVASCRIPTEXECUTOR
//	 @Test
//	 public void Test(){
//		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		 String pagetitle = (String)javascript.executeScript("return document.title");
//		 
//		 System.out.println("Page title is: " + pagetitle);
//		 
//		 String pageurl= driver.getCurrentUrl();
//		 System.out.println("Page url is: " + pageurl);
//		 
//	 }
	 
//	 //Get Domain Name Using JavascriptExecutor
//	 @Test
//	 public void test(){
//		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		 String domainname = (String)javascript.executeScript("return document.domain");
//		 System.out.println("Domain name is: " + domainname);
//		 
//		 String currentpageulr = driver.getCurrentUrl();
//		 System.out.println("Current page url: " + currentpageulr);
//		 
//	 }
	 
	 //Generating Alert
	 
	 @Test
	 public void test() throws InterruptedException {
		 JavascriptExecutor javascript = (JavascriptExecutor) driver;
		 javascript.executeScript("alert('The script is prepared to run...')");
		 Thread.sleep(5000);
		 driver.switchTo().alert().accept();
	 }
	
}
