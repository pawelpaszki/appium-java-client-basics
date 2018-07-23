import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Misc extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = getCapabilities();
		// get activity -> 
		// driver.currentActivity();
		
		// get context -> e.g. webview, native, ...
		// driver.getContext();
		
		// get orientation 
		// driver.getOrientation();
		
		// is locked
		// driver.isLocked();
		
		// hide keyboard
		// driver.hideKeyboard();
		
		// go to views
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		// come back from views by pressing the android's back button
		// or any Android codes by "pressKeyCode"
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
	}

}
