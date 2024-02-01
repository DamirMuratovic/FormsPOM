package Pages;

import org.apache.poi.hssf.record.BookBoolRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksPage {
    WebDriver driver;
    WebElement loginForm;
    public BooksPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getLoginForm(){
        return driver.findElement(By.id("login"));
    }

    //---------------------------------------------
    public void userClicksOnLoginButton() {
        loginForm = driver.findElement(By.id("login"));
        loginForm.click();
    }
}