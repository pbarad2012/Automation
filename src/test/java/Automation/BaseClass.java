package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static void main(String[] args) {

	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace_1\\Testing\\src\\test\\java\\Automation\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	    // Launch website  
	    driver.get("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.id("lst-ib")).sendKeys("Hello");  
	          
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click(); 
	    

	}

}
