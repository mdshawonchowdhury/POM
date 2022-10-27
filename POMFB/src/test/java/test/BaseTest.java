package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.HomePage;

public class BaseTest {
 static WebDriver driver;
 static HomePage homepage;
 
 @BeforeSuite
 public void setup() {
	 System.setProperty("webdriver.chrome.driver","/Users/mdchowdhury/downloads/chromedriver");
	  driver = new ChromeDriver();
	 driver.get("http://www.facebook.com");
 }
 public void getHomePage() {
	 homepage = new HomePage(driver);
 }
}
