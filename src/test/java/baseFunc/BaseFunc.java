package baseFunc;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunc {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;
    WebElement target;


    public BaseFunc() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/694039/Desktop/pycharm/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 10);
    }

    public void openPage(String url) {
        if (!url.startsWith("http://") && !url.startsWith("https://")) {
            url = "https://" + url;
        }
        driver.get(url);
    }

    public WebElement getElement(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "this element is not found!");
        return driver.findElement(locator);
    }

    public List<WebElement> getAllElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "this element is not found!");
        return driver.findElements(locator);
    }

    public void waitPage(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public void backPage() {
        driver.navigate().back();
    }

    public boolean isElementPresent(By locator) {
        waitPage(locator);
        return getAllElements(locator).isEmpty();

    }

    public void exitFromTest() {
        driver.quit();
    }

    public void moveOverElement(By locator) {
        actions = new Actions(driver);
        target = driver.findElement(locator);
        actions.moveToElement(target).perform();
    }

    public void moveToelement(By locator) {
        actions = new Actions(driver);
        target = driver.findElement(locator);
        actions.moveToElement(target).click(target);
        actions.perform();

    }

    public void moveToCoordinatesfast(int xcoordi, int ycoordi) {
        actions = new Actions(driver);
        actions.moveByOffset(xcoordi, ycoordi).click().build().perform();

//        target = driver.findElement(locator);
//        actions.moveToElement(target, xcoordi, ycoordi).click().build().perform();
//        actions.moveByOffset(xcoordi, ycoordi).click().build().perform();
//        actions.perform();
    }
}
