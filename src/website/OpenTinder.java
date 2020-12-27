package website;

import java.net.URI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTinder {

	public static void openTinder(String s) {

		System.setProperty("webdriver.chrome.driver", "/Users/stevebaca/MCIT/Venrodite/ChromeDriverExe/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get(s);

	}

}
