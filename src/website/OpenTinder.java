package website;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTinder {

	public static void openTinder(String s) {
		
		Scanner scanner = new Scanner(System.in);

		System.setProperty("webdriver.chrome.driver", "/Users/stevebaca/MCIT/Venrodite/ChromeDriverExe/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get(s);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		try {
			driver.findElement(By.xpath("//span[contains(@class,'Pos(r) Z(1)') and contains(text(), 'Log in')]")).click();
		} catch (Exception e) {
			System.out.println("cannot find the element");
		}
		
		System.out.println("enter your facebook username");
		String userName = scanner.next();
		
		
		System.out.println("enter your facebook password");
		String passWord = scanner.next();
		
		try {
			driver.findElement(By.xpath("//span[contains(@class,'Pos(r) Z(1)') and contains(text(), 'Log in with Facebook')]")).click();
		} catch (Exception e) {
			System.out.println("cannot find the element");
		}
		
		
		
	}

}
