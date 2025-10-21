package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Tables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> tableValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int actualSum = 0;

		for (int i = 0; i < tableValues.size(); i++) {
			actualSum = actualSum + Integer.parseInt(tableValues.get(i).getText());

		}

		System.out.println("The actualSum calculated from the table is:" + actualSum);

		// compare actual and expected amountSum
		int expectedSum = Integer
				.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(expectedSum, actualSum);

		System.out.println("The expectedSum from the UI is: " + expectedSum);

	}

}
