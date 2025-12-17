package ranjini.v.Selenium_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		// scroll window - write in browser console to find co-ordinates
		js.executeScript("window.scrollBy(0,500)");
		
		// scroll through DOM object - write in browser console to find co-ordinate
		// This line of code tells Selenium to run JavaScript that scrolls the element with class tableFixHead down by 5000 pixels
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		driver.quit();
			
	}

}
