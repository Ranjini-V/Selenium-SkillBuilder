package ranjini.v.Selenium_Practice;

import java.text.DateFormatSymbols;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarsTest {

	public static void main(String[] args) {

		int monthNumber = 12;
		String date = "20";
		String year = "2000";

		String fullDate = monthNumber + "/" + date + "/" + year;

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']"))
				.click();

		// month
		// //button[@class='react-calendar__navigation__label']
		WebElement month = driver.findElement(By.cssSelector(".react-calendar__navigation__label"));
		month.click();
		month.click();

		// right arrow
		// //button[@class='react-calendar__navigation__arrow
		// react-calendar__navigation__next-button']
		//		WebElement rightArrow = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']"));
		//		rightArrow

		// left arrow
		// //button[@class='react-calendar__navigation__arrow
		// react-calendar__navigation__prev-button']
		WebElement leftArrow = driver.findElement(By.cssSelector(".react-calendar__navigation__prev-button"));
		leftArrow.click();
		leftArrow.click();
		leftArrow.click();

		// year
		// //button[@class='react-calendar__navigation__label']

		// left arrow
		// //button[@class='react-calendar__navigation__arrow
		// react-calendar__navigation__prev-button']

		// 2000
		// //button[text()='2000']
		WebElement Year2000 = driver.findElement(By.xpath("//button[text()='" + year + "']"));
		Year2000.click();

		// December
		// abbr[text()='December']
		String monthName = new DateFormatSymbols().getMonths()[monthNumber - 1];
		WebElement December = driver.findElement(By.xpath("//abbr[text() = '" + monthName + "']"));
		System.out.println(monthName);
		December.click();

		// 20th
		// //abbr[text()=20]
		WebElement date20th = driver.findElement(By.cssSelector(
				"//abbr[text()='" + date + "']"));
		date20th.click();

		
		driver.quit();
	}

}
