package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Config.PropertiesFile;

public class FirstSeleniumClass {

	public static String  browser;
	static WebDriver driver;

	public static void main(String[] args) {

		System.out.println("Hello World");
		/*Commenting setBrowser method and accessing properties files for fetching browser details
		 */
		//	setBrowser();
		PropertiesFile.readProperties();
		setBrowserConfig();
		runTest();

	}

	public static void setBrowser() {
		browser = "Firefox";
	}
	public static void setBrowserConfig () {

		String projectLocation = System.getProperty("user.dir");
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation+"\\lib\\geckodriver\\geckodriver.exe"); 
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		}
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation+"\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	public static void runTest () {

		driver.get("http://amazon.com");
		driver.quit();
		System.out.println("Successful execution");
	}



};
