package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.annotation.JsonAppend.Prop;

public class TestBase {

	public static AppiumDriver driver;
	public static Properties prop;
	public static DesiredCapabilities dc;

//	FileReader fileReader = new FileReader("/Users/deepaksingh/eclipse-workspace/iOSTestProject/src/main/resources/config.properties");  

	public TestBase() {

		prop = new Properties();
		try {
			FileInputStream finput = new FileInputStream(
					"/Users/deepaksingh/eclipse-workspace/iOSTestProject/src/main/resources/config.properties");
			prop.load(finput);
		} catch (IOException e) {
			e.getMessage();

		}

	}

	public static void iOS_setUp() throws MalformedURLException {

		dc = new DesiredCapabilities();
		// dc.setCapability("platformName", "iOS");
		// dc.setCapability(CapabilityType.PLATFORM_NAME, "iOS");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("platformName"));
		dc.setCapability("deviceName", prop.getProperty("deviceName"));
		dc.setCapability("platformVersion", prop.getProperty("platformVersion"));
		dc.setCapability(MobileCapabilityType.UDID, prop.getProperty("udid"));
		// dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		dc.setCapability("app",prop.getProperty("iOSAppLocationPath"));
		// dc.setCapability(CapabilityType.BROWSER_NAME, "safari");
		// dc.setCapability("wdaStartupRetries", "4");
		// dc.setCapability("iosInstallPause","8000" );
		// dc.setCapability("wdaStartupRetryInterval", "20000");

		URL url = new URL(prop.getProperty("appiumURL"));

		driver = new AppiumDriver(url, dc);

		System.out.println("App Launched Successfully");

	}

}
