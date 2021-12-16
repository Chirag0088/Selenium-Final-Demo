package e2eProject.finalDemo;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.BaseClass;
import pageObjectModel.homePageObjects;
import pageObjectModel.loginPageObject;

public class loginTestCase extends BaseClass{
	@Test(dataProvider="getdata")
	public void Basepagenavigation(String username,String password) throws IOException{
		driver=initialisedriver(); 
		driver.get("http://www.qaclickacademy.com/");
		
		homePageObjects hpo=new homePageObjects(driver);
		hpo.clicksignin().click();
		
		
		
		loginPageObject lpo=new loginPageObject(driver);
		lpo.eneterusername().sendKeys(username);
		lpo.enterpassword().sendKeys(password);
		lpo.clicklogin().click();
	}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][2]; 
		data[0][0]="test@1";
		data[0][1]="komal123";
		data[1][0]="test@2";
		data[1][1]="abcd";
		return data;
	}
}
