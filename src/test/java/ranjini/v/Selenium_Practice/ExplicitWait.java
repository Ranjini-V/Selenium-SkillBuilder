package ranjini.v.Selenium_Practice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));

		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		Thread.sleep(4000);
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
		
		// ExplicitWait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode"))).sendKeys("ABCD");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		// ExplicitWait
		// WebElement wrongPromoCode = driver.findElement(By.className("promoInfo"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		String wrongPromoCode = driver.findElement(By.className("promoInfo")).getText();
		System.out.println(wrongPromoCode);
		Assert.assertEquals(wrongPromoCode, "Invalid code ..!");
		

	}}

	
