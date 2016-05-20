package TestNGOnePack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TimeSheet {
	
	WebDriver driver = new FirefoxDriver();
	String uname = "dat.anh.ho";
	String pword = "L@ndmark6";
	
	@BeforeTest
	public void beforetest()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://timesheet.logigear.com/Authenticate/LogIn/?ReturnUrl=/Portal/TimeSheet");
	}
	
//	@AfterTest
//	public void aftertest()
//	{
//		driver.quit();
//	}
	
	@Test
	public void SubmitTimeSheet() throws InterruptedException {
		
		LoginTS(uname,pword);
				
		Boolean exist = driver.findElements(By.className("shortcut-icon")).size()!=0;
		
		if(exist)
		{
			driver.findElement(By.className("shortcut-icon")).click();
			Thread.sleep(3000);
		}
		
	}
	
	public void LoginTS(String usn, String pw) throws InterruptedException
	{
		driver.findElement(By.id("UserName")).sendKeys(usn);
		driver.findElement(By.id("Password")).sendKeys(pw);
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@value='Log In']"))));
		driver.findElement(By.xpath("//button[@value='Log In']")).submit();
		Thread.sleep(4000);
	}
}
