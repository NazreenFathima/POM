package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	
	public CreateLeadPage (ChromeDriver driver)
	{
		this.driver = driver;
	}
	public CreateLeadPage enterFirstName()
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nazreen");
		return this;
	}

	public CreateLeadPage enterLastName()
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Fathima");
		return this;
	}
	
	public CreateLeadPage enterCompanyName()
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
	public ViewLeadPage clickCreateLead()
	{
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewLeadPage(driver);
	}
}
