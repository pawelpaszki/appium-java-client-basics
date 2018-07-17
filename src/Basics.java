import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = getCapabilities();
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");
		
		/*
		 * Xpath Syntax -> 
		 * tagName[@attribute='value']
		 */
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		//driver.findElementByXPath("//android.widget.CheckBox").click();
		driver.findElementById("android:id/checkbox").click();
		// code below demonstrates using indices to identify UI elements, e.g. second RelativeLayout
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		
		//driver.findElementByClassName("android.widget.EditText").clear();
		driver.findElementById("android:id/edit").sendKeys("Secure Network");
		
		//driver.findElementByClassName("android.widget.EditText").sendKeys("Secure Network");
		
		// click the second element of class android.widget.Button
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}

}
