import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIAutomatorSample extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = getCapabilities();
		
		// unique to appium
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		
		// print out the size of collection of clickable elements -> "new UiSelector()."
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size()); 
		
	}

}
