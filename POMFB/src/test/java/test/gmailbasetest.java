package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.gmailhomepage;

public class gmailbasetest {
		 static WebDriver driver;
		 static gmailhomepage homepage;
		 
		 @BeforeSuite
		 public void setup() {
			 System.setProperty("webdriver.chrome.driver","/Users/mdchowdhury/downloads/chromedriver");
			  driver = new ChromeDriver();
			 driver.get("https://accounts.google.com/signup/v2");
		 }
		 public void getHomePage() {
			 homepage = new gmailhomepage(driver);
		 }
}
