package selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClasses {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://alaskatrips.poweredbygps.com/");

		driver.findElement(By.xpath("(//span[@class='icon icon-hotels'])[1]")).click();

		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys("nyc");
		driver.findElement(By.xpath("//input[@id='hotel-destination']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//input[@id='hotel-checkin']")).sendKeys(Keys.ENTER);

		WebDriverWait wait = new WebDriverWait(driver, 5);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,
		// 'Fair-Lawn-Hotels-Hyatt-Place-Fair')]")));

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,
		// 'Fair-Lawn-Hotels-Hyatt-Place-Fair')]")));
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//a[contains(@href, 'Fair-Lawn-Hotels-Hyatt-Place-Fair')]")));

		driver.findElement(By.xpath("//a[contains(@href, 'Fair-Lawn-Hotels-Hyatt-Place-Fair')]")).click();

		System.out.println("PASS");

		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

	}

}
