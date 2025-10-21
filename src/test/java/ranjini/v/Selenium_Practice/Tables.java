package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> tableValues = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int amountSum = 0;

		for (int i = 0; i < tableValues.size(); i++) {
			amountSum = amountSum + Integer.parseInt(tableValues.get(i).getText());

		}

		System.out.println("The amountSum from the table is:" + amountSum);
	}

}
