package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.PageDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Vertical_Scroll {

	public Vertical_Scroll() {
		PageFactory.initElements(new AppiumFieldDecorator(PageDriver.getCurrentDriver()), this);
	}
	
	//Vertical Scroll
   
	@AndroidFindBy(xpath="//*[@text='Views']")
	public WebElement view;
	
	
	@AndroidFindBy(xpath="	//android.widget.Switch[@content-desc=\"Standard switch\"]")
	public WebElement sdwitch;
	
	@AndroidFindBy(xpath="//*[@text='Switches']")
	public WebElement swwitch;
	


		
}
