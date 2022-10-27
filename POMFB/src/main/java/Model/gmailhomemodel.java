package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailhomemodel extends gmailbasemodel {

	public gmailhomemodel(WebDriver g) {
		super(g);

	}

	public WebElement getFirstName() {
		WebElement fn = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		return fn;
	}
}