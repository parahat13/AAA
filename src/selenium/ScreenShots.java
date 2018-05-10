package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShots {
	
	
	public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Home\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Home\\SCREENSHOTS\\screenshots.png"));
		
		System.out.println("PASSED");
		
		
	}

}
