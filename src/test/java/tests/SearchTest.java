package tests;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import steps.SearchResultSteps;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends BaseTest {
    @Test
    public void testSearchByKeywordSelenium() {
        SearchResultSteps steps1 = steps.searchByKeyword("selenium");
        steps1.verifyThatListContainsCorrectValue("www.selenium.dev");
    }


    //   WebDriver driver;

//    @BeforeMethod
//    public void setUp() {
//        File file = new File("src/test/resources/chromedriver.exe");
//        System. setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//        driver = new ChromeDriver();
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        //driver.quit();
//    }
//
//    @Test(enabled = false)
//    @SneakyThrows
//    public void searchForSeleniumJavaGoogleChromeInTest() {
//
//        driver.navigate().to("https://www.google.com");
//        WebElement searchField = driver.findElement(By.name("q"));
//        searchField.sendKeys("selenium java");
//        searchField.sendKeys(Keys.ENTER);
//        Thread.sleep(1000);
//
//        WebElement element = driver.findElement(By.xpath("//div[1]/div/div/div[1]/div/a/h3"));
//        assertThat(element.getText()).containsIgnoringCase("selenium");
//
//        WebElement text = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[2]/div"));
//        assertThat(text.getText())
//                .isNotEmpty()
//                .containsIgnoringCase("java")
//                .doesNotContain("php");

//        WebElement resultStats = driver.findElement(By.xpath("//*[@id=\"result-stats\"]"));
////        System.out.println(resultStats.getText());
//        String resText = resultStats.getText();
//        int start = resText.indexOf('(');
//        int finish = resText.indexOf(')');
//        String s = resText.substring(start + 1, finish);
//        double time = Double.parseDouble(s.split(" ")[0].replace(',', '.'));
//        System.out.println("time = " + time);

//    }

}
