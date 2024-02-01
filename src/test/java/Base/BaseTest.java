package Base;
import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    public WebDriver driver;
    public Homepage homepage;
    public ElementsPage elementsPage;
    public PracticeFormPage practiceFormPage;
    public BooksPage booksPage;
    public LoginPage loginPage;
    public ExcelReader excelReader;
    public JavascriptExecutor js;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        js = (JavascriptExecutor) driver;

        homepage = new Homepage(driver);
        elementsPage = new ElementsPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
        booksPage = new BooksPage(driver);
        loginPage = new LoginPage(driver);
        excelReader = new ExcelReader("TestData.xlsx");
    }
}