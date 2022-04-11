package TestPackage;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment4PopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");  
		WebDriver driver;
		//here we are using chrome options we need to set popup preferences as below //1-Allow, 2-Block, 0-default
	    ChromeOptions options = new ChromeOptions();
 
	    Map<String, Object> prefs=new HashMap<String,Object>();
	    prefs.put("profile.default_content_setting_values.notifications", 2);
	    options.setExperimentalOption("prefs",prefs);
	  
	    driver=new ChromeDriver(options);
	    driver.navigate().to("https://push.gravitec.net/demo?lang=en");
	   
	    driver.switchTo().frame("__privateStripeMetricsController9260");
	    driver.findElement(By.xpath("//span[text()='Send notification']//parent::button")).click();
	   //chrome will block Notifications as we set in chrome options 
	}

}
