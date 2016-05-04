package TestNGOnePack;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample_Login {
	
//	WebDriver driver = new FirefoxDriver();
//
//	//Using DataProvider Annotation for data driven test 
//
//	@BeforeTest
//	public void setup() throws Exception { 
//		driver.manage().window().maximize(); 
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
//		driver.get("http://only-testing-blog.blogspot.in/2014/05/login.html"); 
//	}
//	
//	@AfterTest
//	public void tearDown() throws Exception { 
//		driver.quit(); 
//	}
//	
//	//This method will return two dimensional array. 
//	//This method behaves as data provider for LogIn_Test method.
//	@DataProvider
//	public Object[][] LoginCredentials(){ 
//		//Created two dimensional array with 4 rows and 2 columns. 
//		//4 rows represents test has to run 4 times. 
//		//2 columns represents 2 data parameters.
//		
//		Object[][] Cred = new Object[4][2]; 
//		
//		Cred[0][0] = "UserId1"; 
//		Cred[0][1] = "Pass1"; 
//		
//		Cred[1][0] = "UserId2"; 
//		Cred[1][1] = "Pass2"; 
//		
//		Cred[2][0] = "UserId3"; 
//		Cred[2][1] = "Pass3"; 
//		
//		Cred[3][0] = "UserId4"; 
//		Cred[3][1] = "Pass4"; 
//		return Cred; //Returned Cred 
//		}
//	
//	//Give data provider method name as data provider. 
//	//Passed 2 string parameters as LoginCredentials() returns 2 parameters In object.
//	@Test(dataProvider="LoginCredentials")
//	public void Login_Test(String Usedid, String Pass) {
//		driver.findElement(By.xpath("//input[@name='userid']")).clear(); 
//		driver.findElement(By.xpath("//input[@name='pswrd']")).clear(); 
//		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys(Usedid); 
//		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys(Pass); 
//		driver.findElement(By.xpath("//input[@value='Login']")).click(); 
//		String alrt = driver.switchTo().alert().getText(); 
//		driver.switchTo().alert().accept(); 
//		System.out.println(alrt);
//		
//	}
	
	WebDriver driver = new FirefoxDriver();
	
//	//Using JAVA EXCEL API for data driven test
	
	
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
	
	@Test 
	public void test () throws BiffException, IOException, InterruptedException { 
		//Open MyDataSheet.xls file from given location. 
		FileInputStream fileinput = new FileInputStream("D:\\MyDataSheet.xls");

		//Access first data sheet. getSheet(0) describes first sheet. 
		Workbook wbk = Workbook.getWorkbook(fileinput); 
		Sheet sheet = wbk.getSheet(0); 
		
		//Read data from the first data sheet of xls file and store it in array. 
		String TestData[][] = new String[sheet.getRows()][sheet.getColumns()]; 
		//To enable Last Name text box. 
		JavascriptExecutor javascript = (JavascriptExecutor) driver; 
		String toenable = "document.getElementsByName('lname')[0].removeAttribute('disabled');"; 
		javascript.executeScript(toenable); 
		
		//Type data in first name and last name text box from array. 
		for(int i=0;i<sheet.getRows();i++) { 
			for (int j=0;j<sheet.getColumns();j++) { 
				TestData[i][j] = sheet.getCell(j,i).getContents(); 
				
				if(j%2==0) 
				{ 
					driver.findElement(By.xpath("//input[@name='fname']")).sendKeys(TestData[i][j]); 
				} 
				else 
				{ 
					driver.findElement(By.xpath("//input[@name='lname']")).sendKeys(TestData[i][j]); 
				} 
			} 
			Thread.sleep(1000); 
			driver.findElement(By.xpath("//input[@name='fname']")).clear(); 
			driver.findElement(By.xpath("//input[@name='lname']")).clear(); 
		}
		Thread.sleep(1000); 
	}

}
