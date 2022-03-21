package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Controls {
	public Controls() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Views']")
	public WebElement view;
	
	
	@AndroidFindBy(xpath="//*[@text='Controls']")
	public WebElement controls;
	
	
    
	@AndroidFindBy(xpath="//*[@text='1. Light Theme']")
	public WebElement lightTheme;
	
	@AndroidFindBy(id="io.appium.android.apis:id/edit")
	public WebElement txtbox;
	
	@AndroidFindBy(id="io.appium.android.apis:id/check1")
	public WebElement checkbox;
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/radio1")
	public WebElement radioButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/star")
	public WebElement star;
	
	@AndroidFindBy(id="io.appium.android.apis:id/toggle1")
	public WebElement troggle;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement dropDown;
	
	@AndroidFindBy(xpath="//*[@text='Saturn']")
	public WebElement selectSaturn;
	
	//(And all inside of a ScrollView!)

	//io.appium.android.apis:id/button

	@AndroidFindBy(id="io.appium.android.apis:id/button")
	public WebElement saveButton;
	

	
}
