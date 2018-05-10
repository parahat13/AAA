package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountLinks {

	WebDriver driver;

	@BeforeMethod
	public void setup() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

	}

	// @Test
	public void test() {
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Links  in the page: " + size);
	}

	// @Test
	public void test2() {
		// Count of links in the footer section

		WebElement footer = driver.findElement(By.xpath("//table[@class='gf-t']"));
		int size2 = footer.findElements(By.tagName("a")).size();
		System.out.println("Count of links at  footer: " + size2);

	}

	@Test
	public void test3() {
		WebElement column = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Count of links in  the  column: " + column.findElements(By.tagName("a")).size());

		System.out.println("Before clicking: " + driver.getTitle());
	
		// print out links on second column
		for (int i = 0; i < column.findElements(By.tagName("a")).size(); i++) {
			// String text = column.findElements(By.tagName("a")).get(i).getText();
			// System.out.println(text);

			// click siteMap in second column
			if (column.findElements(By.tagName("a")).get(i).getText().contains("Site map")) {
				
				column.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
		System.out.println("After clicking: " + driver.getTitle());
		
		String actual= driver.getTitle();
		String expected= "Sitemap | eBay";
		Assert.assertEquals(actual, expected);
	}

}
