package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class USAAddressTest extends BaseTest{
	
	private LoginPage lp;

	private USAddressValidatePage ap;

	@Test(priority = 0)

	public void USAAddress() {

		lp = new LoginPage(driver);
		ap = new USAddressValidatePage(driver);

		lp.applicationLogin();
        ap.USAddr();
				
		boolean usaAddress = driver.findElement(By.id("address")).isDisplayed();

		Assert.assertTrue(usaAddress);

	}
	

}
