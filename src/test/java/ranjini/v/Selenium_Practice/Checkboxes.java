package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
		Assert.assertFalse(false);
		driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
		System.out.println(
				"Checkbox selected?:" + driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();

		int numberOfCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out
				.println("number of checkboxes: " + numberOfCheckboxes);
		Assert.assertEquals(numberOfCheckboxes, 6);
		Thread.sleep(2000);

		List<WebElement> checkboxes = driver.findElements((By.xpath("//input[@type='checkbox']")));
		for (WebElement selectCheckbox : checkboxes) {

			// valid -(//input[@type='checkbox'])[1]
			// since checkbox 1 in DOM is hidden - i starts from 2
			for (int i = 2; i <= numberOfCheckboxes; i++) {
				driver.findElement(By.xpath("(//input[@type='checkbox'])" + "[" + i + "]")).click();
			}
			break;
		}
		driver.close();
	}

}
