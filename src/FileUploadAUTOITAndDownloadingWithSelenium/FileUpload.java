package FileUploadAUTOITAndDownloadingWithSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		//Store location of project dynamically
		String downloadPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		System.setProperty("webdriver.chrome.driver", "/Users/christiansanchez/seleniumcourse/chromedriver");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[class*='btn-choose']")).click();
		Thread.sleep(3000);
		//Code Line below will run an executable file (.exe) which should be done in AutoIT (Windows Only)
		//Creating the script and then compiling it to generate a .exe file
		//exe should be to upload a file
		Runtime.getRuntime().exec("ExecutableScriptPath.exe i.e. C:\\Users\\christian\\Documents\\fileupload.exe");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));
		driver.findElement(By.linkText("Download Now")).click();
		
		Thread.sleep(5000);
		
		File file = new File(downloadPath+"/converted.zip");
		if(file.exists()) {
			//Assert.assertTrue(file.exists());
			System.out.println("File Found");
			if(file.delete()) {
				System.out.println("File Deleted");

			}
		}

		
	}

}
