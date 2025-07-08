package Base;

import java.time.Duration;

//import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
		public static WebDriver driver;
//
//		@BeforeMethod
//	    public void setUp() {
//	        // Automatically download the appropriate driver using WebDriverManager
//			WebDriverManager.edgedriver().setup();
//			WebDriver driver = new EdgeDriver();
//
//	        driver.get("https://ae.makemytrip.global/?cc=ae&redirectedBy=gl");
//	        driver.manage().window().maximize();  // Maximize the browser window
//	       
//
//	        // Implicit wait to wait for elements to load
//	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	        
//	    }
//
//		
//
//		@AfterMethod
//		
//		public void tearDown() {
//	        if (driver != null) {
//	            driver.quit(); // ✅ Proper cleanup
//	        }
//	    }
		  @Parameters("browser") // Accept parameter from TestNG XML
		    @BeforeMethod
		    public void setUp(@Optional("chrome") String browser) {
		        switch (browser.toLowerCase()) {
		            case "chrome":
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		                break;

		            case "firefox":
		                WebDriverManager.firefoxdriver().setup();
		                driver = new FirefoxDriver();
		                break;

		            case "edge":
		                WebDriverManager.edgedriver().setup();
		                driver = new EdgeDriver();
		                break;

		            default:
		                System.out.println("Invalid browser specified. Launching Chrome by default.");
		                WebDriverManager.chromedriver().setup();
		                driver = new ChromeDriver();
		        }

		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		        driver.get("https://ae.makemytrip.global/?cc=ae&redirectedBy=gl");
		    }

		    @AfterMethod
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
	}
}


