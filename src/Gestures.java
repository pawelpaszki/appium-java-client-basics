import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = getCapabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		// Tap action 
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']")).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		// long press
		touchAction.press(driver.findElementByXPath("//android.widget.TextView[@text='People Names']")).waitAction(Duration.ofMillis(2000)).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").getText());
		
		
	}

}
