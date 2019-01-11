package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CanadaAddressTest extends BaseTest{
	
	private LoginPage lp;

	private CanadaAddrValidatePage cp;
	
	
	@Test(priority = 1)

	public void CanadaAddress() {

		lp = new LoginPage(driver);
		cp = new CanadaAddrValidatePage(driver);
		
		lp.applicationLogin();
		cp.CanadaAddr();
       
				
		boolean canadaAddress = driver.findElement(By.id("address")).isDisplayed();

	Assert.assertTrue(canadaAddress);

	}


}
