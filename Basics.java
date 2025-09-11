package AppiumTesing;


import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
//import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Basics extends BaseTest {
	
	@Test
	public void WifeSettingsName()throws MalformedURLException, URISyntaxException {
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3.Preference depencies\']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout//[2]")).click();
		
	}
}
