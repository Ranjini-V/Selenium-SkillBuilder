package ranjini.v.Selenium_Practice;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HTTPSCertification {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();

		options.setAcceptInsecureCerts(true);
		proxy.setHttpProxy("ipaddress:1234");
		options.setCapability("proxy", proxy);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
