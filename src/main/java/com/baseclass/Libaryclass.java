//package com.baseclass;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class Libaryclass {
//
//	// we keep base
//	public static WebDriver driver;
//	public static Properties Prop;
//
//	
//	public void launchapplication() throws IOException {
//
//		FileInputStream input = new FileInputStream(
//				"/flipcartendtoendseleniumautomationbddcucumber/src/test/resources/config.Properties/config.property");
//		Prop = new Properties();
//		Prop.load(input);
//
//		try {
//			if (Prop.getProperty("browser").equalsIgnoreCase("chrome")) {
//				driver = new ChromeDriver();
//			}
//
//			else if (Prop.getProperty("browser").equalsIgnoreCase("firefox")) {
//				driver = new FirefoxDriver();
//			}
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get(Prop.getProperty("url"));
//		} catch (Exception e) {
//			System.out.println("browser nit launched");
//		}
//
//	}
//
//	public void teardown() {
//		driver.close();
//	}
//}
/**
 * This package contains the base class for the Selenium test framework.
 */
package com.baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This is the base class for the entire test framework. It is responsible for
 * initializing the WebDriver, loading configuration properties, and tearing
 * down the browser session after tests are complete. Note: The class name has a
 * typo and should likely be "LibraryClass".
 */
public class Libaryclass {

	// 'static' means this WebDriver instance is shared across all test cases that
	// use this class.
	// This ensures that all parts of the framework are controlling the same browser
	// instance.
	public static WebDriver driver;

	// 'static' Properties object to hold configuration data (like browser type,
	// URL).
	// It will be loaded from the config.property file.
	public static Properties Prop;

	/**
	 * This method initializes the WebDriver based on the properties defined in the
	 * configuration file. It sets up the browser, maximizes the window, applies an
	 * implicit wait, and navigates to the target URL.
	 *
	 * @throws IOException if the configuration file is not found at the specified
	 *                     path.
	 */
	public void launchapplication() throws IOException {

		// Create a file input stream to read the properties file.
		// Note: Using a relative path (e.g., "src/test/resources/config.property") is
		// generally more robust
		// than a hardcoded absolute-style path.
		FileInputStream input = new FileInputStream(
				"D:/flipcartendtoendseleniumautomationbddcucumber/src/test/resources/config.Properties/config.property");

		// Initialize the Properties object.
		Prop = new Properties();
		// Load the key-value pairs from the .property file into the Prop object.
		Prop.load(input);

		try {
			// Read the 'browser' property from the config file.
			String browserName = Prop.getProperty("browser");

			// Check which browser is specified and initialize the corresponding WebDriver.
			if (browserName.equalsIgnoreCase("chrome")) {
				// Set up and instantiate the ChromeDriver.
				// For modern Selenium, you don't need to set the system property if
				// WebDriverManager is used
				// or if chromedriver.exe is in the system's PATH.
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				// Set up and instantiate the FirefoxDriver.
				driver = new FirefoxDriver();
			}

			// Maximize the browser window to ensure all elements are visible.
			driver.manage().window().maximize();

			// Set an Implicit Wait. This tells WebDriver to wait for a certain amount of
			// time
			// (10 seconds in this case) when trying to find an element before throwing an
			// exception.
			// This helps handle delays in page loading.
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			// Navigate the browser to the URL specified in the config file.
			driver.get(Prop.getProperty("url"));

		} catch (Exception e) {
			// Print an error message if the browser fails to launch for any reason.
			// Using e.printStackTrace() here can provide more details for debugging.
			System.err.println("Browser was not launched correctly. Error: " + e.getMessage());
		}
	}

	/**
	 * This method closes the browser session after the test is complete. It's
	 * crucial for releasing resources and ending the WebDriver process cleanly.
	 */
	public void teardown() {
		// driver.close() closes the currently focused browser window.
		// It's often better to use driver.quit(), which closes all associated windows
		// and safely ends the WebDriver session.
		driver.quit();
	}
}