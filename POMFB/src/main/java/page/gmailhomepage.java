package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailhomemodel;


public class gmailhomepage extends gmailhomemodel {

	public gmailhomepage(WebDriver g) {
		super(g);
	}

	
	public void typefirstname() {
		WebElement e = getFirstName();
		e.sendKeys("md");
	
	}


	private WebElement getfirstnamebtn() {
		// TODO Auto-generated method stub
		return null;
	}


	}

