package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver d) {
		super(d);
	}

	
	public void clickOnAccountBtn() {
		WebElement e = getcreatnewaccountbtn();
		e.click();
	}


	public void clickOnNextBtn() {
		// TODO Auto-generated method stub
		
	}
	
}
