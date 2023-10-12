package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbloginPage {

	WebDriver driver;
	
	By fbemail=By.id("email");
	 
	
	By fbpswd=By.id("pass");

	
	By fbloginbutton=By.name("login");
	
 	
public FbloginPage (WebDriver driver){
	this.driver=driver;
	
  //  PageFactory.initElements(driver, this);
    
    }
public void setValues(String email,String password)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(password);
}

public void loginClick()
{
 driver.findElement(fbloginbutton).click();
}

}


