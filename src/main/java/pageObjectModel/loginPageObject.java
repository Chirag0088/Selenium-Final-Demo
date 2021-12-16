package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	public WebDriver driver;
	By username=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login=By.xpath("//input[@value='Log In']");
	
	
	public loginPageObject(WebDriver driver2) {
		this.driver=driver2;
		// TODO Auto-generated constructor stub
	}
	public WebElement eneterusername() {
		return driver.findElement(username);
	}
	public WebElement enterpassword() {
		return driver.findElement(password);
	}
	public WebElement clicklogin() {
		return driver.findElement(login);
	}
	
	
}
