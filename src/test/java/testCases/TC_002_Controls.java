package testCases;

import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import base.Base;
import base.PageDriver;
import pageObjects.Controls;
import pageObjects.Vertical_Scroll;
import utilities.Utilities;

public class TC_002_Controls extends Base{

	
	
	@Test
	public void TC_002_Controls() throws InterruptedException {
		Utilities util= new Utilities();
		util.scrollToText("Views");
		//PageDriver.getCurrentDriver().findElementById("android:id/text1").getLocation(10).click();
		Thread.sleep(3000);
		
		Controls ct= new Controls();
		ct.view.click();
		Thread.sleep(3000);
		
		ct.controls.click();
		Thread.sleep(3000);
		
		ct.lightTheme.click();
		Thread.sleep(3000);
		
		ct.txtbox.sendKeys("sami");
		Thread.sleep(3000);
	    
		PageDriver.getCurrentDriver().hideKeyboard();
	    Thread.sleep(3000);
	    
	    
	    ct.checkbox.click();
	    Thread.sleep(3000);
	    
	    ct.radioButton.click();
	    Thread.sleep(3000);
	    
	    ct.star.click();
	    Thread.sleep(3000);
	    
	    ct.troggle.click();
	    Thread.sleep(3000);
	    
	    ct.dropDown.click();
	    Thread.sleep(3000);
	    
	    ct.selectSaturn.click();
	    Thread.sleep(3000);
	    
	    ct.saveButton.click();
	   // ct.saveButton.
	    Thread.sleep(3000);
	    
	    util.scrollToText("(And all inside of a ScrollView!)");
	    Thread.sleep(3000);
	}
	
}
