package McafeeProject.Mercury;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaseCreationTest {

	@Test
	public void CT1()
	{
		System.out.println("CT1");
	}
	@Test
	public void CT2()
	{
		System.out.println("CT2");
	}
	
	
	@Test
	public void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
	// saving the GUI element reference into a "element" variable of WebElement type
	WebElement element = driver.findElement(By.id("Email"));
	// entering username
	element.sendKeys("dummy@gmail.com");
	element.sendKeys(Keys.RETURN);
	// entering password
	driver.findElement(By.id("Passwd")).sendKeys("password");

	// clicking signin button
	driver.findElement(By.id("signIn")).click();
	// explicit wait - to wait for the compose button to be click-able
	
	// click on the compose button as soon as the "compose" button is visible
	driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	}

	@AfterMethod
	public void teardown() {
	// closes all the browser windows opened by web driver
	//driver.quit();
	}
	
}
