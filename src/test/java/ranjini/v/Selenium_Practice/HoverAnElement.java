package ranjini.v.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverAnElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.stepcampus.in/");

		WebElement hoverElement = driver
				.findElement(By.xpath("//a[@href='/tutorials' and normalize-space()='View Tutorials']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(hoverElement);
		hoverElement.click();

	}
}
