/**
 * 
 */
package mytestclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * @author dat.anh.ho
 *
 */
class BasicActions {
	
	private WebDriver driver;
	
	public BasicActions(WebDriver driver){
		this.driver = driver;
		;
	}

	public void capturescr () throws InterruptedException, IOException 
	 { 
		  //Capture entire page screenshot and then store it to destination drive
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
		  System.out.print("Screenshot is captured and stored in your D: Drive");
		 }
	
	public static void SayHello(WebDriver driver){
		
		System.out.println("Hello");		
		
	}
	
	public void hovercontrol () throws InterruptedException, IOException
	{
		Actions actions = new Actions(driver);
		WebElement moveonmenu = driver.findElement(By.xpath("//input[@id='submitButton']"));
		actions.moveToElement(moveonmenu);
		actions.perform();
		Thread.sleep(10000);
	}
	
	
}
