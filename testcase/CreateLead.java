package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@Test
	public void LoginCreate()
	
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMLink()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName()
		.enterLastName()
		.enterCompanyName()
		.clickCreateLead();
		
	}

}
