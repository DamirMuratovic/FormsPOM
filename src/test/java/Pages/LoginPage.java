package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    WebElement userNameField, passwordField, loginButton;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getUserNameField(){
        return driver.findElement(By.id("userName"));
    }
    public WebElement getPasswordField(){
        return driver.findElement(By.id("password"));
    }
    public WebElement getLoginButton(){
        return driver.findElement(By.id("login"));
    }

    //--------------------------------------------------
    public void usernameInput(String userName){
        getUserNameField().clear();
        getUserNameField().sendKeys(userName);
    }
    public void passwordField(String password){
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }
    public void clickLoginButton(){
        getLoginButton().click();
    }
}
