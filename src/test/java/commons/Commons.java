package commons;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commons {
	
	// WebDriver declaration & Initialization
	public static WebDriver driver = WebDriverManager.chromedriver().create();
	public static Scanner sc = new Scanner(System.in);
	
	public static Actions crsr = new Actions(driver);
	public static SoftAssert softassert = new SoftAssert();	
	
}
