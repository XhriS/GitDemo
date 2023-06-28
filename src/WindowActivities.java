import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HELPFUL IN END TO END SCENARIOS
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/Users/christiansanchez/seleniumcourse/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http//google.com"); //Selenium will wait till all components are fully loaded
		driver.navigate().to("https://www.rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
