package com.whitecircleschool.demo.RealProjectLevelA2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CallistoPage {

	@FindBy(linkText = "Let's Work")
	private WebElement workBtn;

	@FindBy(css = "body > div.elementor.elementor-116 > div > div > section > div > div > div.elementor-element.elementor-element-86d3377.elementor-column.elementor-col-33.elementor-top-column")
	private WebElement prjTwo;

	@FindBy(linkText = "Branches")
	private WebElement branchesLink;

	public CallistoPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void Callisto() {

		workBtn.click();
		
	}

	public void ProjectTwo() {

		
		prjTwo.click();

	}

	public void XyloPage() {

		branchesLink.click();

	}

}
