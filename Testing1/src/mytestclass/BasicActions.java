/**
 * 
 */
package mytestclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * @author dat.anh.ho
 *
 */
class BasicActions {
	
	private WebDriver driver;
	
	public BasicActions(WebDriver driver){
		
		this.driver = driver;
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
}
