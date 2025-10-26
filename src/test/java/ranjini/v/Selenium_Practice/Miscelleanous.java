package ranjini.v.Selenium_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionKey");
		Thread.sleep(3000);
		driver.get("https://amazon.com");
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotsPath = System.getProperty("user.dir") + "\\screenshots\\error";

		FileUtils.copyFile(screenshots, new File(screenshotsPath));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.quit();
		
		

	}

}
