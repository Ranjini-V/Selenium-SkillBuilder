package ranjini.v.Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorme.driver",
				"C:\\Users\\HP\\webdrivers\\chromedriver-win64\\chromedriver-win64");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getTagName());
		
		
		

}
}