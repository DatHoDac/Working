package TestNGOnePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectListItem {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void beforeTest()
	{
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	}
	
//	@AfterTest
//	public void aftertest()
//	{
//		driver.quit();
//	}
	
	
//	//SELECT LIST ITEM 
	
//	@Test
//	public void SelectTest() throws InterruptedException 
//	{
//		driver.findElement(By.xpath("//input[@id='text1']")).sendKeys("My name name name");
//		
//		Select listbox = new Select(driver.findElement(By.xpath("//select[@name='FromLB']")));
//		listbox.selectByValue("Japan");
//		listbox.selectByValue("Mexico");
//		listbox.selectByValue("India");
//		
//		
//		driver.findElement(By.xpath("//input[@value='->']")).click();
//		
//		WebDriverWait wait = new WebDriverWait(driver, 15);
////		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='text2']"))));
//		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("text2"))));
//		
//		listbox.selectByIndex(0);
//		listbox.selectByIndex(3);
//		driver.findElement(By.xpath("//input[@value='->']")).click();
//		
//		Thread.sleep(5000);
//	}
	
	
	@Test
	public void navigatefunc()
	{
		String title1= driver.getTitle();
		System.out.println("load page at 1st time, title: " + title1);
		
		driver.navigate().to("http://only-testing-blog.blogspot.in/2013/09/test.html");
		String title2= driver.getTitle();
		System.out.println("load page at 2nd time, title: " + title2);
		
		driver.navigate().back();
		String title3= driver.getTitle();
		System.out.println("load 1st page, title: " + title3);
		
		driver.navigate().forward();
		String title4= driver.getTitle();
		System.out.println("load 2nd page, title: " + title4);
	}
	
	
	
	
	
}
