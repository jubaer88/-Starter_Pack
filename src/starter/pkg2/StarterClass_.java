package starter.pkg2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import starter.pkg.browser;

public class StarterClass_ {
	
	WebDriver startSession() {
		return new ChromeDriver();
	}
	
	@Test
	void inSession() {
		WebDriver session = startSession();
		session.get("https://google.com/");
		browser.sleep(4000);
		session.quit();
	}
	
	
}
