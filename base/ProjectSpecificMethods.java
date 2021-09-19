package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//Step1: Launch URL
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
		
	}
	

}
