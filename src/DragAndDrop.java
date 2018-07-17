import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = getCapabilities();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
		
		TouchAction touchAction = new TouchAction(driver);
		
		// NOTE: will not run without .perform()
		touchAction.longPress(driver.findElementsByClassName("android.view.View").get(0))
		.moveTo(driver.findElementsByClassName("android.view.View").get(2)).release().perform();
		
	}

}
