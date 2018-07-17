import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	public static void main(String[] args) {
		
		File file = new File("src");
		File appFile = new File(file, "ApiDemos-debug.apk"); // app name
		
		DesiredCapabilities dCaps = new DesiredCapabilities();
		dCaps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Simulator");
		dCaps.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath());
		try {
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), dCaps);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
