package SeleniumWebdriverTechniquestoAutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/Users/christiansanchez/seleniumcourse/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//Handling a checkbox & adding assertions
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		//Radiobutton click & enabled assertion
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Count the number of checkboxes on the screen
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
			
		/*
		int i=1;
		while(i<5) {
			//
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
			i++;
		}*/
		
		for (int i=1; i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click(); //4 times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),  "5 Adult");
		driver.findElement(By.id("divpaxinfo")).getText();


	}

}
