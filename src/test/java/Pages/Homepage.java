package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Homepage {
    WebDriver driver;
    List<WebElement> elements;

    public Homepage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getElements() {
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
    }

    public void clickOnElements(String elementName){
        for(int i = 0; i < getElements().size(); i++){
            if(getElements().get(i).getText().equalsIgnoreCase(elementName)){
                getElements().get(i).click();
                break;
            }
        }
    }
}