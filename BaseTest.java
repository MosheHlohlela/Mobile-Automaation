package AppiumTesing;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	
	public void Config() throws MalformedURLException, URISyntaxException {
		
		// start the service using the code
		service = new AppiumServiceBuilder().withAppiumJS(null).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		//"I want to use a phone that understands how to follow my instructions using UiAutomator2."
		UiAutomator2Options options = new UiAutomator2Options();
		  
		  // Pretend you're a Pixel 9 Pro XL!
		options.setDeviceName("Pixel 9 Pro XL");
		  
		  //You’re giving it the path to the app file on your computer.
		options.setApp("C:\\Java_selenium\\MobileTessingAppium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		  
		// Connect to my toy phone using this special remote control address
		driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
		
	}

	@AfterClass
	public void tearDown() {
		
		driver.quit();
		service.stop();
		
	}
}
