package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericMethods {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * WebDriver driver= new ChromeDriver();
		 * driver.get("https://expertautomationteam.com/practice.html");
		 * System.out.println(driver.getTitle());
		 *
		 * WebElement apple = driver.findElement(By.id("appleRadiobtn")); WebElement
		 * orange = driver.findElement(By.id("orangeRadiobtn"));
		 *
		 * System.out.println(apple.isSelected());
		 * System.out.println(orange.isSelected());
		 *
		 * try { apple.click();
		 * System.out.println("expecting true: "+apple.isSelected()); } catch (Exception
		 * e) { System.out.println(e.getMessage()); }
		 *
		 * orange.click(); System.out.println(orange.isSelected());
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		/*
		 * WebElement forgotPass = driver.findElement(By.linkText("Forgot password?"));
		 *
		 * System.out.println(forgotPass.isDisplayed());// true
		 * System.out.println(forgotPass.isEnabled());
		 */
		WebElement createNewAcc = driver.findElement(By.linkText("Create new account"));
		if (createNewAcc.isEnabled()) {
			createNewAcc.click();
			System.out.println("creating acc");
		}
		Thread.sleep(2000);
		
		WebElement maleradioBtn;
		WebElement custom;
		
		try {
			WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[contains(@name,'sex') and @value='1' and @type='radio']"));
			if (femaleRadioBtn.isDisplayed()) {
				femaleRadioBtn.click();
				System.out.println("female radio button: " + femaleRadioBtn.isSelected());
			}
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			maleradioBtn = driver
					.findElement(By.xpath("//input[contains(@name,'sex') and @value='2' and @type='radio']"));
			Thread.sleep(2000);
			maleradioBtn.click();
			Thread.sleep(2000);
			System.out.println("male radio button: " + maleradioBtn.isSelected());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			custom = driver.findElement(By.xpath("//input[contains(@name,'sex') and @value='-1' and @type='radio']"));
			custom.click();
			System.out.println("male radio button: " +custom.isSelected());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		Thread.sleep(4000);
		driver.quit();
	}
}