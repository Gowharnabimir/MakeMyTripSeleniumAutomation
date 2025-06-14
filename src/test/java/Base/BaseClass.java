package Base;

import java.time.Duration;

//import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
		public static WebDriver driver;

		@BeforeMethod
	    public void setUp() {
	        // Automatically download the appropriate driver using WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://ae.makemytrip.global/?cc=ae&redirectedBy=gl");
	        driver.manage().window().maximize();  // Maximize the browser window
	       

	        // Implicit wait to wait for elements to load
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	    }

		

		@AfterMethod
		
		public void tearDown() {
	        if (driver != null) {
	            driver.quit(); // ✅ Proper cleanup
	        }
	    }

	}


