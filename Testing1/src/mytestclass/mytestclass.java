package mytestclass;

//import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;




import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.*;
//import org.apache.commons.io.FileUtils;
//import org.apache.james.mime4j.field.datetime.DateTime;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.*;
//
//import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;
//import com.google.common.base.Stopwatch;


public class mytestclass 
{

	WebDriver driver = new FirefoxDriver();
	
	@Before
	public void beforetest() 
	{ 
		driver.manage().window().maximize(); 
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}	
	
	@After
	public void aftertest() 
	{ 
		driver.quit(); 
	}

//	 public static void main(String[] args) throws InterruptedException, IOException {
//		  WebDriver driver = new FirefoxDriver();
//		  driver.get("http://only-testing-blog.blogspot.in");
		  
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
//  
//		  //4. Store text of targeted element in variable
//		  String dropdown = driver.findElement(By.tagName("select")).getText();
//		  System.out.println(dropdown);
//		  
//		  
//		  //5. Typing text in text box or text area.
//		  driver.findElement(By.name("fname")).sendKeys("My First Name");
//		  
//		  //6. Applying Implicit wait in web driver
//		  for (int e = 0; e < 15; e++) {
//			  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			  System.out.println("Second: " +  e);
//		}
//		  
//		  //7. Applying Explicit wait in web driver with WebDriver canned conditions.  
//		   try {
//			  System.out.println("lan 1: " + LocalDateTime.now()); 
//			  WebDriverWait wait = new WebDriverWait(driver, 10);
//			  wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='timeLeft']"), "Time left: 7 seconds"));
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("String Time left: 7 seconds not exist in 10 secs");
//				System.out.println("lan 2: " + LocalDateTime.now());	
//			}
//					
//		  //10. Get domain name using java script executor
//		  JavascriptExecutor javascript = (JavascriptExecutor) driver;
//		  String CurrentURLUsingJS=(String)javascript.executeScript("return document.domain");
//		  System.out.println("Domain is: " + CurrentURLUsingJS);	
//		  
//		  //11. Generate alert using webdriver's java script executor interface
//		  
//		  JavascriptExecutor javascript2 = (JavascriptExecutor) driver;
//		  javascript2.executeScript("alert('Test Case Execution Is started Now..');");
//		  
//		  //12. Selecting or Deselecting value from drop down in selenium webdriver.
//		  //Select By Visible Text
//		  Select mydrpdwn = new Select(driver.findElement(By.id("Carlist")));
//		  mydrpdwn.selectByVisibleText("Audi");
//		  
//		  //Select By Value
//		  Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  listbox.selectByValue("Italy");
//		  
//		  //Select By Index
//		  Select listbox2 = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  listbox2.selectByIndex(0);
//		  
//		  //isMultiple()
//		  Select listbox3 = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		  boolean value = listbox3.isMultiple();
//		  System.out.println(value);
//		  
//		  //13. Navigate to URL or Back or Forward in Selenium Webdriver
//		  driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html#sthash.9Q3Ew9bn.dpuf");
//		  driver.navigate().back();
//		  String a = driver.getTitle();
//		  String aa = driver.getCurrentUrl();
//		  System.out.println(a + " ; " + aa);
//		  driver.navigate().forward();
//		  String b = driver.getTitle();
//		  String bb = driver.getCurrentUrl();
//		  System.out.println(b + ";" + bb);
//		  
//		  //14. Verify Element Present in Selenium WebDriver
//		  Boolean isExist = driver.findElements(By.xpath("//input[@id='text2']")).size()!= 0;
//		  Boolean isExist2 = driver.findElements(By.xpath("//select[@name='FromLB']")).size()!= 0;
//		  System.out.println(isExist + " ; " + isExist2);
//		  
//		  //15. Capturing entire page screenshot in Selenium WebDriver
//		 BasicActions a = new BasicActions(driver);
//		 a.capturescr();
//		 BasicActions.SayHello(driver);
//		 
//		 
//		  //16. Generating Mouse Hover Event In WebDriver
//		 BasicActions hover = new BasicActions(driver);
//		 hover.hovercontrol();
//		 
//		 //17. Handling Multiple Windows In Selenium WebDriver.
//		 // Get All Window Handles.
//		  
//		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//		  driver.findElement(By.xpath("//b[contains(.,'Open New Page')]")).click();;
//		  
//		  Set<String> AllWindowHandles = driver.getWindowHandles();
//		  //*Extract parent and child window handle from all window handles.
//		  String window1 = (String) AllWindowHandles.toArray()[0];
//		  System.out.println("window1 is: " + window1);
//		  String window2 = (String) AllWindowHandles.toArray()[1];
//		  System.out.println("window1 is: " + window2);
//		  //*Use window handle to switch from one window to other window.
//		  driver.switchTo().window(window2);
		  
		  
		  
		 //driver.close();
//		 }
	
//	@Test
//	public void test () throws InterruptedException { 
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
//		driver.findElement(By.xpath("//b[contains(.,'Open New Page')]")).click(); 
//		// Get and store both window handles in array 
//		Set<String> AllWindowHandles = driver.getWindowHandles(); 
//		String window1 = (String) AllWindowHandles.toArray()[0]; 
//		System.out.print("window1 handle code = "+AllWindowHandles.toArray()[0]); 
//		String window2 = (String) AllWindowHandles.toArray()[1]; 
//		System.out.print("\nwindow2 handle code = "+AllWindowHandles.toArray()[1]); 
//		//Switch to window2(child window) and performing actions on it. 
//		driver.switchTo().window(window2); 
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("My Name"); 
//		driver.findElement(By.xpath("//input[@value='Bike']")).click(); 
//		driver.findElement(By.xpath("//input[@value='Car']")).click(); 
//		driver.findElement(By.xpath("//input[@value='Boat']")).click(); 
//		driver.findElement(By.xpath("//input[@value='male']")).click(); 
//		Thread.sleep(5000); 
//		//Switch to window1(parent window) and performing actions on it. 
//		driver.switchTo().window(window1); 
//		driver.findElement(By.xpath("//option[@id='country6']")).click(); 
//		driver.findElement(By.xpath("//input[@value='female']")).click(); 
//		driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
//		Thread.sleep(4000);
//		driver.switchTo().alert().accept(); 
//		Thread.sleep(5000); 
//		//Once Again switch to window2(child window) and performing actions on it. 
//		driver.switchTo().window(window2); 
//		driver.findElement(By.xpath("//input[@name='fname']")).clear(); 
//		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Name Changed"); 
//		Thread.sleep(5000); driver.close(); 
//		//Once Again switch to window1(parent window) and performing actions on it. 
//		driver.switchTo().window(window1); 
//		driver.findElement(By.xpath("//input[@value='male']")).click(); 
//		Thread.sleep(5000);
//		}
	
	// 18. Check Whether Element is Enabled Or Disabled In Selenium Web driver
//	@Test 
//		public void test () throws InterruptedException, IOException 
//		{ 
//		//To wait for element visible 
//		WebDriverWait wait = new WebDriverWait(driver, 15); 
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']"))); 
//		driver.findElement(By.xpath("//input[@id='text3']")).sendKeys("Text box is visible now"); 
//		System.out.print("Text box text3 is now visible"); 
		
//	@Test 
//	public void test () throws IOException, InterruptedException 
//	{ 
//		boolean fname = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled(); 
//		System.out.print(fname); 
//		WebElement firstname = driver.findElement(By.xpath("//input[@name='fname']")); 
//		WebElement lastname = driver.findElement(By.xpath("//input[@name='lname']")); 
//		//Verify First name text box is enabled or not and then print related message. 
//		if(firstname.isEnabled()) 
//		{ 
//			System.out.print("\nText box First name is enabled. Take your action."); 
//		} 
//		else 
//		{ 
//			System.out.print("\nText box First name is disabled. Take your action."); 
//		} 
//		//Verify Last name text box is enabled or not and then print related message. 
//		if(lastname.isEnabled()) 
//		{ 
//			System.out.print("\nText box Last name is enabled. Take your action."); 
//		} else 
//		{ 
//			System.out.print("\nText box Last name is disabled. Take your action."); 
//		} 
//	}
	
	//19. Enable/Disable Textbox During Selenium Webdriver Test Case Execution.
	
	@Test 
	public void test () throws IOException, InterruptedException 
	{
		boolean fbefore = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled(); 
		System.out.print("\nBefore : First Name Text box enabled status is : "+fbefore); 
		boolean lbefore = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled(); 
		System.out.print("\nBefore : Last Name Text box enabled status is : "+lbefore); 
		Thread.sleep(2000); 
		//To disable First Name text box 
		JavascriptExecutor javascript = (JavascriptExecutor) driver; 
		String todisable = "document.getElementsByName('fname')[0].setAttribute('disabled', '');"; 
		javascript.executeScript(todisable); 
		Thread.sleep(2000); 
		//To enable Last Name text box 
		String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');"; 
		javascript.executeScript(toenable); 
		Thread.sleep(3000); 
		boolean fafter = driver.findElement(By.xpath("//input[@name='fname']")).isEnabled(); 
		System.out.print("\nAfter : First Name Text box enabled status is : "+fafter); 
		boolean lafter = driver.findElement(By.xpath("//input[@name='lname']")).isEnabled(); 
		System.out.print("\nAfter : Last Name Text box enabled status is : "+lafter); 
	}


}
