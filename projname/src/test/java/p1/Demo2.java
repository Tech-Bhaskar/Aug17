package p1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {

	@Test
	public void test () {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.amazon.com");
		
		//driver.close();
				
		

	}

}
