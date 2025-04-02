package NaukriAutomate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Naukri_LoginTest {

	WebDriver driver;

	@Test
	public void Login() throws IOException, InterruptedException {
		System.out.println(System.getProperty("user.dir"));
		Properties config = new Properties();
		Properties OR = new Properties();
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\properties\\Config.properties");
		config.load(fis);

		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\OR.properties");
		OR.load(fis);

		System.out.println(config.getProperty("Login"));

		System.out.println(OR.getProperty("PWD"));

		System.out.println("test");

		driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		Click(driver, config.getProperty("Login"));
		driver.manage().window().maximize();
		Thread.sleep(8000);
		// driver.findElement(By.xpath("//input[contains(@placeholder,\"Username\")]")).sendKeys("hgsdjg");
		System.out.println(OR.getProperty("UN") + config.getProperty("UN"));
		SendKeys(driver, config.getProperty("UN"), OR.getProperty("UN"));
		Thread.sleep(5000);
		// Click(driver, config.getProperty("PWD"));
		System.out.println(OR.getProperty("PWD") + config.getProperty("PWD"));

		SendKeys(driver, config.getProperty("PWD"), OR.getProperty("PWD"));
		Click(driver, config.getProperty("LoginButton"));
		Thread.sleep(8000);
		Click(driver, config.getProperty("Viewprofile"));
		Thread.sleep(5000);

		//Click(driver, config.getProperty("UpdateResume"));
		Click(driver, config.getProperty("UploadButton"));
		
		Thread.sleep(8000);

		Runtime.getRuntime().exec("D:\\Software\\Filedata\\FileUpload.exe");

		// Click(driver, config.getProperty("UploadButton"));
		// driver.quit();
	}

	public static void Click(WebDriver driver, String Xpath) {
		driver.findElement(By.xpath(Xpath)).click();
	}

	public static void SendKeys(WebDriver driver, String Xpath, String value) {
		driver.findElement(By.xpath(Xpath)).sendKeys(value);
	}

	@AfterTest
	public void stop() {
		//driver.quit();
	}

}
