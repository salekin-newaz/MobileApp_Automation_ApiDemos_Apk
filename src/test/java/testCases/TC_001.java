package testCases;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import base.Base;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObjects.HomePage;
import pageObjects.Vertical_Scroll;
import utilities.Utilities;


public class TC_001 extends Base{

	
	@Test
	public void myFirstTest() throws InterruptedException {
		
//		HomePage home= new HomePage();
//		home.animation.click();
//		Thread.sleep(2000);
//		System.out.println("End");
//		
		
		Utilities util= new Utilities();
		util.scrollToText("Views");
		Thread.sleep(3000);
		
		Vertical_Scroll vc= new Vertical_Scroll();
		vc.view.click();
		
		Thread.sleep(2000);
		util.scrollToText("Switches");
		Thread.sleep(2000);
		vc.swwitch.click();
		Thread.sleep(2000);
		vc.sdwitch.click();
		Thread.sleep(2000);
		
		
		
//		home.nameField.sendKeys("Sami");
//		Thread.sleep(2000);
//		
//		driver.hideKeyboard();
//		home.maleRadio.click();
//		home.dropdown.click();
//		home.ChooseCountryBangladesh.click();
//		Thread.sleep(2000);
//		home.letsShop.click();
//		Thread.sleep(2000);
		
		
	}
}
