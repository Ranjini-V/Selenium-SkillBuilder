package ranjini.v.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//button[@class='a-button-text']")).click();

		// move cursor to specific element -> right-click
		WebElement element = driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(element).contextClick().build().perform();

		// move cursor -> click -> enter in capital letters -> select text
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("pillows").doubleClick().build().perform();

	}

}
