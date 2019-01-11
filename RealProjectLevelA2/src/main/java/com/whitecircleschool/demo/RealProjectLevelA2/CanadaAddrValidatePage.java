package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CanadaAddrValidatePage {
	
	@FindBy(linkText = "Branches")
	private WebElement branchesLink;

	@FindBy(id = "select1")
	private WebElement region;

	@FindBy(id = "select2")
	private WebElement country;

	public CanadaAddrValidatePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	

	public void CanadaAddr() {

		Select regionDrpDown = new Select(region);
		regionDrpDown.selectByValue("1");

		Select countryDrpDown = new Select(country);
		countryDrpDown.selectByVisibleText("Canada");

	}


}
