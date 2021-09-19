package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public ViewLeadPage (ChromeDriver driver)
	{
		this.driver = driver;
	}
	
	public void verifyFirstName()
	{
		String verifyTitle = driver.getTitle();
		String title= "View Lead | opentaps CRM";
		if(title.equals(verifyTitle))
		{
			System.out.println("Landed to correct page - View Lead");
		}
		else
		{
			System.out.println("Landed to incorrect page - Please try again");
		}
	}

}
