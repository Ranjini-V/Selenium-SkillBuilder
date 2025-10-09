package ranjini.v.Selenium_Practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemsToCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(4000);

		// xpath for desired product using parent-sibling relationship
		// driver.findElement(By.xpath("//h4[text()='Cucumber - 1
		// Kg']/following-sibling::div[@class='product-action']/button")).click();

		String[] listProducts = { "Cucumber", "Brocolli", "Cauliflower" };

		List<WebElement> products = driver.findElements(By.className("product"));
		int j = 0;
		for (int i = 1; i < products.size(); i++) {
			String[] productName = products.get(i).getText().split("-");
			String finalproductName = productName[0].trim();

			List productsArrayList = Arrays.asList(listProducts);

			if (productsArrayList.contains(finalproductName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == listProducts.length) {
					break;
				}

			}

		}

	}

}
