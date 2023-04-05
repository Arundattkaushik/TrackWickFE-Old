package commons;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class Utils{
	
	
	// Method to support Chrome driver 111 and above.
	public static ChromeOptions initializeDrver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		return options;
	}
	

	// WebDriver declaration & Initialization
	public static WebDriver driver = new ChromeDriver(initializeDrver());
	
	// Declaring Global explicit Wait instance
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));


	// WebDriverManager.chromedriver().create();
	public static Scanner sc = new Scanner(System.in);
	public static  Actions crsr = new Actions(driver);
	public static SoftAssert softassert = new SoftAssert();
}
