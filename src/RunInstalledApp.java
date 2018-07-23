import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class RunInstalledApp {

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities dCaps = new DesiredCapabilities();
		dCaps.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
		dCaps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Simulator");
		dCaps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "25");
		// Android package name
		dCaps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.aerogear.androidshowcase");
		// Android package name + activity name
		dCaps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.aerogear.androidshowcase.MainActivity");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dCaps);
		
		
	}

}
