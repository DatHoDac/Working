package mytestclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class mytestclass {


	 public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		
		  //WebDriver driver = new InternetExplorerDriver();
		  driver.get("http://only-testing-blog.blogspot.in");
		  /*String i = driver.getCurrentUrl();
		  System.out.println(i);
		  System.out.println("this is Dat");
		  driver.findElement(By.id("submitButton")).submit();
		  AlertActions alert = new AlertActions(driver);
		  if(alert.isAlertexist()){
			  String alertmes = driver.switchTo().alert().getText();
			  driver.switchTo().alert().accept();
			  System.out.println("Alert message like: " +  alertmes);
		  }else{
			  System.out.println("Alert isn't exist.");
		  }*/
		  
		  
		  String dropdown = driver.findElement(By.tagName("select")).getText();
		  System.out.println(dropdown);
		  
		  driver.close();
		 }
	 

}
