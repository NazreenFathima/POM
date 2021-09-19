package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class Login extends ProjectSpecificMethods {

	@Test
	public void Login1()
	{
		LoginPage lp = new LoginPage(driver);
		lp.enterUserName()
		.enterPassword()
		.clickLoginButton();
		
	}
}
