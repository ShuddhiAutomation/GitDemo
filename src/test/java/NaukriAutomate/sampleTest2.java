package NaukriAutomate;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampleTest2 {

	@Test
	public static void Testingtestng1() throws IOException, InterruptedException {
		System.out.println("hgfghhg");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/megha/Desktop/Fileuplad.html");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//input[@type='file']")).click();
		 Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//input[@name='resumeupload']")).click();
		
		Runtime.getRuntime().exec("D:\\Software\\Filedata\\FileUpload.exe");

		
	}
}
