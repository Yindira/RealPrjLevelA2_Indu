package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XyloPage {

	@FindBy(linkText = "Branches")
	private WebElement branchesLink;

	@FindBy(id = "select1")
	private WebElement region;

	@FindBy(id = "select2")
	private WebElement country;

	public XyloPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void XyloValidation() {

		branchesLink.click();
	}

	public WebElement SelectRegion() {
		
		return region;
		

	}

	public WebElement SelectCountry() {
		
		return country;
		
		

		

	}

}
