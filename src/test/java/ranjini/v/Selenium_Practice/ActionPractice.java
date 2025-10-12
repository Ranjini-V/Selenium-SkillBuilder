package ranjini.v.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();
		
		// move cursor to specific element
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
