package ranjini.v.Selenium_Practice;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/seleniumPractise");
        driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']/following-sibling::div[@class='product-action']/button")).click();
        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("ABCD");
        driver.findElement(By.xpath("//button[text()='Apply']")).click();

        // Fluent wait setup
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        // Use of apply() inside anonymous Function implementation
        WebElement fluentWaitedErrorMsg = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.xpath("//span[text()='Invalid code ..!']"));
                if (element.isDisplayed()) {
                    return element;
                } else {
                    return null;
                }
            }
        });

        System.out.println("Error message text: " + fluentWaitedErrorMsg.getText());
        driver.quit();
    }
}
