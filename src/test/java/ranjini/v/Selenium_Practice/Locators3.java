package ranjini.v.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\webdrivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Parent-Child-Sibling traverse
		// //header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out
				.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

//		Child-Parent Traverse - //header/div/button[1]/parent::div
//		Child-Grandparent traverse - //header/div/button[1]/parent::div/parent::header
//		Child-Grandparent-Grandparent's child - //header/div/button[1]/parent::div/parent::header/div/a/following-sibling::button/parent::div/parent::header/a

		// header/div/button[1]/parent::div/button[3]
		System.out.println(
				driver.findElement(By.xpath("//header/div/button[text()='Login']/parent::div/button[text()='Signup']"))
						.getText());

	}
}
