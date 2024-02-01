package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PracticeFormPage {
    WebDriver driver;
    WebElement firstNameField, lastNameField, emailField, mobileNumberField, dateOfBirth, monthDate, yearDate, dayDate;
    List<WebElement> genderButton;
    public PracticeFormPage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement getFirstNameField(){
        return driver.findElement(By.id("firstName"));
    }
    public WebElement getLastNameField(){
        return driver.findElement(By.id("lastName"));
    }
    public WebElement getEmailField(){
        return driver.findElement(By.id("userEmail"));
    }
    public List<WebElement> getGenderButton(){
        return driver.findElements(By.cssSelector(".custom-control.custom-radio.custom-control-inline"));
    }
    public WebElement getMobileNumberField(){
        return driver.findElement(By.id("userNumber"));
    }
    public WebElement getDateWidget(){
        return driver.findElement(By.id("dateOfBirthInput"));
    }
    public WebElement getDateOfBirth(){
        return driver.findElement(By.id("dateOfBirthInput"));
    }
    public WebElement getMonthDate() {
        return driver.findElement(By.className("react-datepicker__month-select"));
    }
    public WebElement getYearDate() {
        return driver.findElement(By.className("react-datepicker__year-select"));
    }
    /*public WebElement getDayDate() {
        return driver.findElement();
    }*/
    //--------------------------------------------------

    public void inputFirstName(String firstName){
        getFirstNameField().clear();
        getFirstNameField().sendKeys(firstName);
    }
    public void inputLastName(String lastName){
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }
    public void inputEmail(String email){
        getEmailField().clear();
        getEmailField().sendKeys(email);
    }
    public void clickOnGenderButton(String gender){
        for(int i = 0; i < getGenderButton().size(); i++){
            if(getGenderButton().get(i).getText().equalsIgnoreCase(gender)){
                getGenderButton().get(i).click();
                break;
            }
        }
    }
    public void inputMobileNumber(String number){
        getMobileNumberField().clear();
        getMobileNumberField().sendKeys(number);
    }
    /*public void inputDateOfBirth(String month, String year, String day){
        Select selectMonth = new Select(getMonthDate());
        selectMonth.

    }*/
}