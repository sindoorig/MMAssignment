package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");  
		WebDriver driver;
	    driver = new ChromeDriver();
	    
	    driver.navigate().to("https://teacher.merlyn.org/");
	    driver.findElement(By.id("btn-google")).click();
	    driver.findElement(By.id("identifierId")).sendKeys("EmailID@gmail.com");
	    driver.findElement(By.xpath("//span[text()='Next']//parent::button")).click();
	    driver.findElement(By.name("password")).sendKeys("password");
	    driver.findElement(By.xpath("//span[text()='Next']//parent::button")).click();
	}

}
