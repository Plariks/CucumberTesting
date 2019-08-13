
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstTest {

    @Test
    public void getDelfiTest() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.delfi.lv/");
        driver.findElement(By.xpath(".//button[@id = 'cookiePolicyAccept']")).click();

        String text = driver.findElement(By.xpath(".//span[contains(text(), 'Modeļu jaunumi')]")).getText();
        Assertions.assertEquals(text, "Text is not equal", "Text is not equal");
        driver.quit();
    }
}
