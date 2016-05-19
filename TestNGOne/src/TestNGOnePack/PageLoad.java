package TestNGOnePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PageLoad {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
	}
	
	@Test
	public void test() {
		checkPageIsReady();
		driver.findElement(By.xpath("//input[@id='1']")).click();
		driver.findElement(By.xpath("//input[@id='plus']")).click();
		driver.findElement(By.xpath("//input[@id='5']")).click();
		driver.findElement(By.xpath("//input[@id='equals']")).click();
	}
	
	public void checkPageIsReady(){
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		if(js.executeScript("return document.readyState").toString().equals("complete"))
		{
			System.out.println("Page is loaded");
			return;
		}
		for(int i = 0; i<25;i++)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(js.executeScript("return document.readyState").toString().equals("complete")){
				break;
			}
			
		}
		
	} 
}
