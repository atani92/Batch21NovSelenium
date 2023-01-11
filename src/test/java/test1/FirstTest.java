package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	
	public static void main(String[] arg) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.quit();
		
	}

}
