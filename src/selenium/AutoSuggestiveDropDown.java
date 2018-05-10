package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in");

		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text = (String) js.executeScript(script);
		System.out.println(text);

		int i=0;
		
		while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIPORT")) {

			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if(i>10) {
				break;
			}

		}
		
		if(i>10) {
			System.out.println("Element not  found");
		}else {
			System.out.println("Element is found");
		}

	}

}
