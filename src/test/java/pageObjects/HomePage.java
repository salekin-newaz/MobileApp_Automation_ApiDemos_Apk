 package pageObjects;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.Base;
import base.PageDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class HomePage extends Utilities{

	public HomePage() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Animation']")
	public WebElement animation;

	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	public WebElement nameField;
	
	@AndroidFindBy(id= "com.androidsample.generalstore:id/radioMale")
	public WebElement maleRadio;
	
	@AndroidFindBy(xpath="//*[@text='Female']")
	public WebElement femaleRadio;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement dropdown;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	public WebElement letsShop;
	
	@AndroidFindBy(xpath="//*[@text='Albania']")
	public WebElement ChooseCountryBangladesh; 
	
	
	

}