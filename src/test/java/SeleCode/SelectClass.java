package SeleCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace_1\\Testing\\src\\test\\java\\Automation\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	      
	    // Launch website  
	    driver.get("https://www.amazon.in/"); 
	    Select test_select = new Select(driver.findElement(By.id("searchDropdownBox")));
	    System.out.println(test_select.getOptions().toString());
	    test_select.selectByValue("search-alias=amazon-devices");
	    test_select.selectByVisibleText("Books");
	    test_select.selectByIndex(3);
	   
	}

}
