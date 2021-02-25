package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

 

public class LoginPage {
    
WebDriver driver;

 @FindBy(linkText="Log in")
WebElement lnkLogin;

  @FindBy(name="user_lohin")
WebElement editUsername;
  
  @FindBy(name="user_pwd")
  WebElement editpwd;
  
  @FindBy(className="rememberMe")
  WebElement chkBox;
  
  @FindBy(name="btn_login")
  WebElement btnpwd;


public LoginPage(WebDriver testdriver) {
this.driver = testdriver;
}

public void login(String Username, String Password) {
//WebElement lnklogin = driver.findElement(By.linkText("Log in"));
//lnklogin.click();
//WebElement editUsername = driver.findElement(By.name("user_login"));
//editUsername.sendKeys("Varshini.Hebbar@tecnotree.com");
//WebElement editPwd = driver.findElement(By.name("user_pwd"));
//editPwd.sendKeys("123455666");
//WebElement chkBox = driver.findElement(By.className("rememberMe"));
//chkBox.click();
//WebElement btnPwd = driver.findElement(By.name("btn_login"));
//btnPwd.click();

	lnkLogin.click();
	editUsername.sendKeys(Username);
	editpwd.sendKeys(Password);
	chkBox.click();
	btnpwd.click();
 

}
}
