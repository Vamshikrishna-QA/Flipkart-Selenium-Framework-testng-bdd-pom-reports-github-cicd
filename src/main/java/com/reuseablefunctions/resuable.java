//package com.reuseablefunctions;
//
//import java.io.File;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//
//import com.baseclass.Libaryclass;
//
//public class resuable extends Libaryclass {
//
//	public resuable(WebDriver driver) {
//		this.driver = driver;
//
//	}
//
//	public void Entervalue(WebElement element, String text) {
//
//		try {
//
//			element.sendKeys(text);
//		} catch (Exception e) {
//			System.out.println(" no such element expection");
//		}
//
//	}
//
//	public void click(WebElement elementclick) {
//		try {
//			elementclick.click();
//
//		}
//
//		catch (Exception e) {
//			System.out.println("no such element expection");
//		}
//
//	}
//
//	public void gettitle() {
//
//		try {
//
//			System.out.println(driver.getTitle());
//		}
//
//		catch (Exception e) {
//			System.out.println("could not get the title");
//
//		}
//	}
//
//	public void screenshot(String path) {
//
//		TakesScreenshot TS = (TakesScreenshot) driver;
//		File source = TS.getScreenshotAs(OutputType.FILE);
//
//		try {
//			FileUtils.copyFile(source, new File(path));
//		} catch (Exception e) {
//
//			System.out.println("screenshot not found");
//		}
//
//	}
//
//}
/**
 * Package containing reusable functions for Selenium automation.
 */
package com.reuseablefunctions;

import java.io.File;
import java.io.IOException; // It's better practice to catch specific exceptions like IOException.

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException; // Example of a more specific exception to catch.
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Libaryclass; // Assuming this is your base class where the WebDriver is initialized.

/**
 * This class contains reusable methods for common Selenium WebDriver actions.
 * It inherits from Libaryclass to gain access to the shared WebDriver instance.
 * Note: The class name has a typo and should likely be "Reusable".
 */
public class resuable extends Libaryclass {

	/**
	 * Constructor for the reusable class. It initializes the WebDriver instance for
	 * this class, allowing the methods within this class to interact with the
	 * browser.
	 *
	 * @param driver The WebDriver instance passed from the test script.
	 */
	public resuable(WebDriver driver) {
		// 'this.driver' refers to the driver variable in this class (likely inherited
		// from Libaryclass).
		// It's being assigned the driver instance that was created in the test case.
		this.driver = driver;
	}

	/**
	 * Enters a given text into a specified web element. This method is a wrapper
	 * for the sendKeys() action, with basic error handling.
	 *
	 * @param element The WebElement (e.g., text box, search field) to type into.
	 * @param text    The String value to be entered into the element.
	 */
	public void Entervalue(WebElement element, String text) {
		try {
			// Checks if the element is displayed and enabled before trying to send keys.
			if (element.isDisplayed() && element.isEnabled()) {
				element.sendKeys(text);
			}
		} catch (NoSuchElementException e) {
			// Catches the exception if the element cannot be found on the page.
			System.err.println("Element not found, could not enter text: " + e.getMessage());
		} catch (Exception e) {
			// A general catch-all for any other unexpected errors during the sendKeys
			// action.
			System.err.println("An error occurred while entering text: " + e.getMessage());
		}
	}

	/**
	 * Clicks on a specified web element. This method is a wrapper for the click()
	 * action, with basic error handling.
	 *
	 * @param elementclick The WebElement (e.g., button, link, checkbox) to be
	 *                     clicked.
	 */
	public void click(WebElement elementclick) {
		try {
			// Attempts to perform a click on the provided web element.
			elementclick.click();
		} catch (NoSuchElementException e) {
			// Catches the exception if the element to be clicked is not found.
			System.err.println("Element not found, could not click: " + e.getMessage());
		} catch (Exception e) {
			// A general catch-all for other issues, like the element being obscured or not
			// clickable.
			System.err.println("An error occurred while trying to click the element: " + e.getMessage());
		}
	}

	/**
	 * Retrieves the title of the current web page and prints it to the console.
	 * This is useful for verifying that the driver has navigated to the correct
	 * page.
	 */
	public void gettitle() {
		try {
			// Gets the title of the current page using the driver's getTitle() method
			// and prints it out.
			System.out.println("Page Title is: " + driver.getTitle());
		} catch (Exception e) {
			// Catches any exceptions that might occur if the driver session is invalid.
			System.err.println("Could not get the page title: " + e.getMessage());
		}
	}

	/**
	 * Captures a screenshot of the current browser window and saves it to a
	 * specified file path. This is extremely useful for debugging test failures.
	 *
	 * @param path The full destination file path for the screenshot, including the
	 *             desired file name and extension (e.g.,
	 *             "C:/screenshots/error.png").
	 */
	public void screenshot(String path) {
		// 1. Cast the WebDriver instance to the TakesScreenshot interface.
		// This allows the driver to have screen-capturing capabilities.
		TakesScreenshot ts = (TakesScreenshot) driver;

		// 2. Capture the screenshot and store it as a File object in memory.
		File source = ts.getScreenshotAs(OutputType.FILE);

		try {
			// 3. Use Apache Commons IO's FileUtils to copy the in-memory screenshot file
			// to the permanent location specified by the 'path' parameter.
			FileUtils.copyFile(source, new File(path));
			System.out.println("Screenshot taken and saved at: " + path);
		} catch (IOException e) {
			// Catch a more specific IOException, which can occur if the path is invalid
			// or if there are file permission issues.
			System.err.println("Screenshot could not be saved to path: " + path + ". Error: " + e.getMessage());
		}
	}
}