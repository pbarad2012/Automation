package SeleCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace_1\\Testing\\src\\test\\java\\SeleCode\\chromedriver.exe");
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace_1\\Testing\\src\\test\\java\\SeleCode\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.manage().window().maximize();
//		
//		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).clear();
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Hello World");
//		
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
				
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ENTER).perform();
		action.contextClick().perform();
		action.doubleClick().perform();
		action.moveToElement(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"))).perform();
	
		File test_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(test_file, new File("C:\\Users\\Admin\\eclipse-workspace_1\\Testing\\Screenshots\\amazon.jpg"));
		
		System.out.println("Test");
		Thread.sleep(5000);
		
		driver.quit();


	}

}
