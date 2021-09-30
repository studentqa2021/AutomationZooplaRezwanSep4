package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.ScreenShot;

public class ZooplaLogin {
	WebDriverWait wait;
public void getLogin(WebDriver driver) {
	 MasterPageFactory mpf = new MasterPageFactory(driver);
	 
		if(new MasterPageFactory(driver).getAcceptCookiesBtn().size()>0) {//list total no = size()
		Highlighter.addColor(driver, mpf.getAcceptCookiesBtn().get(0));
		wait = new WebDriverWait(driver, 30);
//	    wait.until(ExpectedConditions.elementToBeClickable(mpf.getAcceptCookiesBtn()));
//		
//		
//		Screenshot.getScreenShot(driver, "Accept all cookies option");
		
		mpf.getAcceptCookiesBtn().get(0).click();
	}
	 
	 Highlighter.addColor(driver, mpf.getSigninbtn());
	 
	 wait = new WebDriverWait(driver, 10);
     wait.until(ExpectedConditions.elementToBeClickable(mpf.getSigninbtn()));
	 ScreenShot.getScreenShot(driver, "Homepage");
	 
	 mpf.getSigninbtn().click();
	 
	 Highlighter.addColor(driver, mpf.getEmail());
	 mpf.getEmail().sendKeys(BaseConfig.getConfigValue("username"));
	 
	 Highlighter.addColor(driver, mpf.getPassword());
	 mpf.getPassword().sendKeys(BaseConfig.getConfigValue("password"));
	 
	 wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable((mpf.getSigninbtn2())));
	 ScreenShot.getScreenShot(driver, "Login Homepage");
	 mpf.getSigninbtn2().click();
	 
	 wait = new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.elementToBeClickable((mpf.getMyZoopla())));
	 
	 Actions ac = new Actions(driver);
	 ac.moveToElement(mpf.getMyZoopla()).build().perform();
	 Highlighter.addColor(driver, mpf.getMyZoopla());
	 
	 if(mpf.getSignoutbtn().isDisplayed()) {
		 System.out.println("Login test is succesful!");
		 Assert.assertTrue(mpf.getSignoutbtn().isDisplayed(), "Login test passed");
	 }else {
		 System.out.println("Login test is unsuccesful!");
		 Assert.assertTrue(mpf.getSignoutbtn().isDisplayed(), "Login test failed");
	 }
	 ScreenShot.getScreenShot(driver, "After login Homepage");
}

}
