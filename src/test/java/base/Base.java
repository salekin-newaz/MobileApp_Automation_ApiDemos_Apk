package base;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

public static AndroidDriver<AndroidElement> driver;
public static DesiredCapabilities cap;
	

    @BeforeTest
	public void android_Setup() throws MalformedURLException
	{
		//Letting which application to run
		File f =new File("src");
		File fs = new File(f,"ApiDemos-debug.apk");
		
		//Openning Emulator
		cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("udid", "4TE0216714003365");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "local");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		//Running Server in the mentioned port
		AndroidDriver<AndroidElement> driver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		//Adding wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		PageDriver.getInstance().setDriver(driver);
		
	}
    
    @AfterTest
    public void tearDown() {
    	PageDriver.getCurrentDriver().quit();
    }
}
