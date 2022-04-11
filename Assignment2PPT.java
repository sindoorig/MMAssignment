package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2PPT {

	public static void main(String[] args) throws AWTException, FileNotFoundException {
		  
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");  
	    WebDriver driver = new ChromeDriver();
	    
	    File file =    new File("E:\\TestData\\TestData.pptx");
	    try (FileInputStream inputStream = new FileInputStream(file)) {
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.navigate().to("file://E:\\TestData\\TestData.pptx");
	    Robot robot = new Robot();

	    robot.keyPress(KeyEvent.VK_F5);
	  
	}

}
