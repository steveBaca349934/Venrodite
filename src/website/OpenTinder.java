package website;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenTinder {
	

	public static void openTinder(String s) {
		//will track the windows that are open
		Set<String> windowsOpen = new HashSet<String>();
		

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
		
		//lets set what the parent is 
		String parent = driver.getWindowHandle(); 

		
		System.out.println("enter your email");
		String email = scanner.next();
		
		
		System.out.println("enter your facebook password");
		String password = scanner.next();
		
		//opening up the facebook login
		try {
			driver.findElement(By.xpath("//span[contains(@class,'Pos(r) Z(1)') and contains(text(), 'Log in with Facebook')]")).click();
		} catch (Exception e) {
			System.out.println("cannot find the element");
		}
		
		
		windowsOpen = driver.getWindowHandles();
		
		System.out.println(windowsOpen);
		
		
		for (String string : windowsOpen) {
			if(!string.equals(parent)) {
				driver.switchTo().window(string);
			}
		}
		
		//entering email and facebook username in order to log in
		try {
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("pass")).sendKeys(password);
			driver.findElement(By.id("loginbutton")).click();
		} catch (Exception e) {
			System.out.println("cannot find the element");
		}
		
		
	}

}
