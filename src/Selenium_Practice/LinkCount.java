package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");

		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("Links  in the page: "+size);
		
		// Count of  links  in  the footer  section
		
		WebElement footer = driver.findElement(By.xpath("//table[@class='gf-t']"));
		int size2 = footer.findElements(By.tagName("a")).size();
		System.out.println("Count of links at  footer: "+size2);
		
		WebElement column = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Count of links in  the  column: "+column.findElements(By.tagName("a")).size());
		
		
		// print out  links  on  second  column
		for(int i=0; i<column.findElements(By.tagName("a")).size(); i++) {
			String text = column.findElements(By.tagName("a")).get(i).getText();
			System.out.println(text);
		}
		
		
		
		
		
		
	}

}
