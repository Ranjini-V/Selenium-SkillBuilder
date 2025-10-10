package ranjini.v.Selenium_Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

@SuppressWarnings("unused")
public class Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
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
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("ABCD");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		String wrongPromoCode = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(wrongPromoCode);
		Assert.assertEquals(wrongPromoCode, "Invalid code ..!");
		
		

	}
}
