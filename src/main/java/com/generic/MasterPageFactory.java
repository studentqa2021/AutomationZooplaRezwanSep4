package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSigninbtn() {
		return signinbtn;
	}

	@FindBy(xpath="(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[4]")
	private WebElement signinbtn;
	
	@FindBy (xpath="//*[@name='email']")
	private WebElement email;
	
	@FindBy (xpath="(//*[contains(text(),'Sign in')])[7]")
	private WebElement signinbtn2;
	
	@FindBy(xpath="(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[5]")
	private WebElement myZoopla;
	
	@FindBy(xpath="//*[contains(text(),'Sign out')]")
	private WebElement signoutbtn;
	
	@FindBy (xpath="(//*[contains(text(),'Accept all cookies')])[2]")
	private List<WebElement> acceptCookiesBtn;
	
	public List<WebElement> getAcceptCookiesBtn() {
		return acceptCookiesBtn;
	}

	public WebElement getSignoutbtn() {
		return signoutbtn;
	}

	public WebElement getMyZoopla() {
		return myZoopla;
	}

	public WebElement getSigninbtn2() {
		return signinbtn2;
	}

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//*[@name='password']")
	private WebElement password;

	public WebElement getEmail() {
		return email;
		
	
	}

}
