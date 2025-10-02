package ranjini.v.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Introduction {

	public static void main(String[] args) {

		// Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driverChrome = new ChromeDriver();

		// Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\webdrivers\\geckodriver-v0.36.0-win-aarch64\\geckodriver.exe");
		WebDriver driverFirefox = new FirefoxDriver();
		// Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\webdrivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driverEdge = new EdgeDriver();

	}
}
