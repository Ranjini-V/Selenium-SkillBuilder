package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		// xpath for desired product using parent-sibling relationship
		// driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/following-sibling::div[@class='product-action']/button")).click();

		String[] listProducts = {"Cucumber", "Brocolli", "Cauliflower"};
		List<WebElement> products = driver.findElements(By.className("product"));
		for (int i = 1; i < products.size(); i++) {
			String productName = products.get(i).getText();
			if (productName.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			} 
		}

	}

}
