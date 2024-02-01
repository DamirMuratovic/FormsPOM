package Tests;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    String userName, password;

    @BeforeMethod
    public void pageSetUp(){
        driver.get("https://demoqa.com/");
    }

    @Test(priority = 10)
    public void userCanSubmitPracticeFormWithMandatoryFields(){
        //js.executeScript("window.scrollBy(0, 400);");
        homepage.clickOnElements("Forms");
        //js.executeScript("window.scrollBy(0, 400);");
        elementsPage.clickOnTextElement("Practice Form");

        js.executeScript("window.scrollBy(0, 400);");
        practiceFormPage.inputFirstName("Damir");
        practiceFormPage.inputLastName("Muratovic");
        practiceFormPage.inputEmail("dachaqa@example.com");
        practiceFormPage.clickOnGenderButton("Male");
        practiceFormPage.inputMobileNumber("0112543285");
    }
    @Test(priority = 20)
    public void userCanLoginWithExcelData(){
        userName = excelReader.getStringData("Login", 1, 0);
        password = excelReader.getStringData("Login", 1, 1);

        js.executeScript("window.scrollBy(0, 1000);");
        homepage.clickOnElements("Book Store Application");
        booksPage.userClicksOnLoginButton();
        loginPage.usernameInput(userName);
        loginPage.passwordField(password);
        loginPage.clickLoginButton();
    }
}