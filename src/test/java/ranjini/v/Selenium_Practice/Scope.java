package ranjini.v.Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// get count of links on the page
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Number of links: " + links.size());

		// get count of links in a section
		// List<WebElement> sectionLink =
		// driver.findElements(By.xpath("//div[@id='gf-BIG']//a"));
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG"));
		List<WebElement> footerSectionLinks = footerDriver.findElements(By.xpath("//a"));
		System.out.println("Number of links in the footer section: " + footerSectionLinks.size());

		// get count of links in the first column of the footer
		WebElement columnDriver = footerDriver.findElement(By.xpath("//div[@id='gf-BIG']//td[1]/ul"));
		List<WebElement> footerColumnOneLinks = columnDriver.findElements(By.tagName("a"));
		System.out.println("Number of links in the first column of footer: " + footerColumnOneLinks);

	}

}
