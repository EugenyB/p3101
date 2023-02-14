package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SearchResultPage extends BasePage {
    //private By searchResultURLsBy = By.xpath("//cite[@class='iUh30']");
    @FindBy(xpath = "//cite[@class='iUh30 tjvcx']")
    List<WebElement> list;

    public void assertThatExpectedValueIsOnSearchTop(String expectedValue) {
        //List<WebElement> searchResultURLs = driver.findElements(searchResultURLsBy);
        System.out.println(list.get(0).getText());
        assertTrue(list.get(0).getText().contains(expectedValue));
//        assertEquals(list.get(0).getText(),
//                expectedValue,
//                expectedValue + " is not the first result!");
    }
}
