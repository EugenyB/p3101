package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;

public class SearchPage extends BasePage {
    //private By searchFieldBy = By.name("q");

    @FindBy(name = "q")
    WebElement searchField;

    public SearchPage() {
        super();
    }

    public void fillTheSearchField(String keyword) {
        //WebElement searchField = driver.findElement(searchFieldBy);
        searchField.sendKeys(keyword);
    }

    public void pressEnter() {
        //driver.findElement(searchFieldBy).sendKeys(Keys.RETURN);
        searchField.sendKeys(Keys.RETURN);
    }
}
