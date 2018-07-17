import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swipe extends Base {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = getCapabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
		
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		// select the hour from the radial time picker
		// syntax: driver.findElementByXPath("//tagName[@attribute=value]").click();
		// NOTE: skip the tagName by providing wildcard -> '*'
		
		driver.findElementByXPath("//*[@content-desc='9']").click();
		
		TouchAction touchAction = new TouchAction(driver);
		
		// press and hold the minute value
		
		touchAction.press(driver.findElementByXPath("//*[@content-desc='15']")).waitAction(Duration.ofMillis(2000))
		.moveTo(driver.findElementByXPath("//*[@content-desc='45']")).release().perform();
		
	}

}
