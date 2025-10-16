package ranjini.v.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) {

		String monthNumber = "12";
		String date = "20";
		String year = "2000";

		String fullDate = monthNumber + "/" + date + "/" + year;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
		
		
		// month 
		// //button[@class='react-calendar__navigation__label']
		
		// right arrow
		// //button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']
		
		// year
		// //button[@class='react-calendar__navigation__label']
		
		
		
		
		

	}

}
