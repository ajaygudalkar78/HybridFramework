package com.vtiger.tests;

import org.testng.annotations.Test;

import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

public class LeadTest extends BaseTest {
	
	
	@Test(priority=4)
	public void LeadCreationTC04()
	{	
		String TCName = "LeadCreationTC04";
		logger = extent.createTest(TCName);
		LoginPage lp = new LoginPage(driver,logger);
		lp.login(dt.get(TCName).get("userid"), dt.get(TCName).get("password"));
		LeadPage ldp = new LeadPage(driver,logger);
		ldp.clicknewlead();
		ldp.createLead(dt.get(TCName).get("lname"), dt.get(TCName).get("company"));
		extent.flush();
	}

}
