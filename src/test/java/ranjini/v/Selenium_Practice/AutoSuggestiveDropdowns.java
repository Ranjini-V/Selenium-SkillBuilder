package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("OC");
		Thread.sleep(3000);
		List<WebElement> suggestOptions = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

		for (WebElement suggestOption : suggestOptions) {
			if (suggestOption.getText().equalsIgnoreCase("Lao, People's Democratic Republic")) {
				System.out.print("Selected Country through auto-suggest: " + suggestOption.getText());
				suggestOption.click();
				break;
			}
		}
		driver.close();

	}

}
