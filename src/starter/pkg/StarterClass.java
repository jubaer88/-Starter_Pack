package starter.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StarterClass {
	
	
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
