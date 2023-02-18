package com.vtiger.tests;



import org.testng.annotations.Test;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

public class loginTest extends BaseTest {
	
	
	
	
	
	@Test(priority=1)
	public void InValidLoginTC01()
	{	
		String TCName = "InValidLoginTC01";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(dt.get(TCName).get("userid"), dt.get(TCName).get("password"));
		lp.verifyErrorMsg();
		extent.flush();
	}
	
	@Test(priority=2)
	public void verifyLogoTC02()
	{		
		String TCName = "verifyLogoTC02";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);		
		lp.verifyLogo();
		extent.flush();
	}
	
	@Test(priority=3)
	public void ValidLoginTC03()
	{		
		String TCName = "ValidLoginTC03";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(dt.get(TCName).get("userid"), dt.get(TCName).get("password"));
		HomePage hp = new HomePage(driver,logger);		
		hp.clickLogout();
		extent.flush();
		
	}

}
