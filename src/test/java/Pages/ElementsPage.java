package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsPage {
    WebDriver driver;
    List<WebElement> textElements;
    public ElementsPage(WebDriver driver){
        this.driver = driver;
    }

    public List<WebElement> getTextElements() {
        return driver.findElements(By.className("text"));
    }

    public void clickOnTextElement(String textElement){
        for (int i = 0; i < getTextElements().size(); i++){
            if(getTextElements().get(i).getText().equalsIgnoreCase(textElement)){
                getTextElements().get(i).click();
                break;
            }
        }
    }
}