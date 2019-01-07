package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPageTest extends BaseTest{
	
	private LoginPage lp;
	
	private XyloPage xp;
	
	@Test
	
	public void loginTest() {
		
		lp = new LoginPage(driver);
		
		xp = new XyloPage(driver);
		
		lp.applicationLogin();
		
		
		
		Select regionDrpDown = new Select(xp.SelectRegion());
		regionDrpDown.selectByValue("1");
		
		Select countryDrpDown = new Select(xp.SelectCountry());
		countryDrpDown.selectByValue("1");
		
		String expectedText = "8 W 126th Street, New York,NY 10027, USA";
		String actualText = driver.findElement(By.id("address")).getText();
		
		Assert.assertEquals(actualText,expectedText);
		
		
		
	}

}
