package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage (ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public LoginPage enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		return this;
	}
	
	public LoginPage enterPassword()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	
	}
	
	public HomePage clickLoginButton()
	{
		driver.findElement(By.className("decorativeSubmit")).submit();
		return new HomePage(driver);
	}
	
	

}
