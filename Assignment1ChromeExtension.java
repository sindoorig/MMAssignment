package TestPackage;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Assignment1ChromeExtension {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {  
          
	    System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");  
	    WebDriver driver;
	    
	    ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("C:\\Users\\Sindoori\\Downloads\\Selenium IDE.crx"));

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        
        System.out.println("Opening extension");
        driver.get("chrome://extensions/?id=cgahedlilgabgcdmaajceckihcpnmpfp");

        driver.navigate().refresh();
        System.out.println("Refresh successfully"); 
	      
	    }  
}
