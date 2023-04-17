package utilities;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

//https://www.youtube.com/watch?v=QOKAYY1dWe8
//Taking Screenshots - Page, Element, Section, Full, FileHandler, Robot & AShot
public class Base {

	public WebDriver driver;
	
	@AfterMethod
	public void afterMethod(ITestResult iTestResult) throws IOException {

		if(iTestResult.getStatus()==iTestResult.FAILURE||iTestResult.getStatus()==iTestResult.SUCCESS)
		{
			takesScreenShotOn(iTestResult.getName());
		}
	}

	public String takesScreenShotOn(String name) throws IOException {

		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\target\\screenshots\\"+name+dateName+".png";
		File finalDestination=new File(destination);
		
		//Can use FileHandler or FileUtils
		FileHandler.copy(source, finalDestination);
		return destination;

	}
	@BeforeTest
	public void beforeTest() throws InterruptedException, IOException {
		
		
        getBrowser();
		Thread.sleep(5000);
	}

	public void getBrowser() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//To take screenshot of the first page---Url launched/Up page
		takesScreenShotOn("homepage");
		driver.manage().window().maximize();
		
		
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
