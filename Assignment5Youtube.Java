package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Youtube {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");  
		WebDriver driver;
	    driver = new ChromeDriver();
	    //go to URL
	    driver.navigate().to("https://www.youtube.com");
	    // Click on Video link
	    driver.findElement(By.xpath("//a[@href='/watch?v=c-0fHoP2udU' and @id='video-title-link']")).click();
	    //make full screen
	    driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
	    //Verify full screen
	    int size = driver.findElements(By.xpath("//button[@class='ytp-fullscreen-button ytp-button' and contains(@title,'Exit')]")).size();
	    if(size>0)
	    	System.out.println("Full screen Mode successful");
	    else
	    	System.out.println("Full screen Mode unsuccessful");
	}

}
