package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class RadioButton {
	
	
	//i am  adding  new  code
	
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.get("https://www.statista.com/search/?q=iphone");
		

	}

	@Test
	public void hoverTest() {
		
	List<WebElement> radio = driver.findElements(By.xpath("//div[@class='display-inline-block row']"));
	
	for (int i = 0; i < radio.size(); i++) {
		
		WebElement webElement = radio.get(i);
		
		String attribute = webElement.getAttribute("class");
		
		System.out.println(attribute);
		
		
		
	}
	}

}
