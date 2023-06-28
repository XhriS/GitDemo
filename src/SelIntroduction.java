import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Invoking the browser
		//Chrome - ChromeDriver -> Methods
		//chromedriver --> Invokes Chrome Browser
		System.setProperty("webdriver.chrome.driver", "/Users/christiansanchez/seleniumcourse/chromedriver");
		
		//webdriver.chrome.driver --> value of path 
		WebDriver driver = new ChromeDriver();
		
		//Firefox Launch
		//geckodriver
		System.setProperty("webdriver.gecko.driver", "/Users/christiansanchez/seleniumcourse/geckodriver");
		WebDriver driver1 = new FirefoxDriver();
		
		//Microsoft Edge
		System.setProperty("webdriver.edge.driver", "/Users/christiansanchez/seleniumcourse/msedgedriver");
		WebDriver driver2 = new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		//driver.quit();
	}

}
