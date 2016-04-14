package mytestclass;
/**
 * 
 */


import org.openqa.selenium.WebDriver;

/**
 * @author dat.anh.ho
 *
 */
public class AlertActions {

	private WebDriver driver;

	public AlertActions(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	 public boolean isAlertexist(){

		 try {
			 driver.switchTo().alert();
			 return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
				
	}
	
	
	
}
