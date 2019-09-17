package pages;

import baseFunc.BaseFunc;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TshirtsPage {

    private BaseFunc baseFunc;

    private final By COMPARE_BUTTON_CLICK = By.xpath("//div/div[@class='top-pagination-content clearfix']/form[@class='compare-form']");
    private final By T_SHIRT_LOGO_CHECK = By.xpath("//div/div/div/div/span[contains(text(), 'T-shirts')]");
    private final By ADD_TO_COMPARE_BUTTON = By.xpath("//div/div/div/a[@class='add_to_compare']");
    private final By ELEMENT_NEEDED_TO_APPEAR = By.xpath("//ul/li/div/div/h5/a");
    private final By WAIT_FOR_TOTAL_COMPARE = By.xpath("//div/div/form/button/span/strong[@class='total-compare-val']");

    public TshirtsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        Assertions.assertFalse(baseFunc.isElementPresent(T_SHIRT_LOGO_CHECK));
    }

    public void moveOverProduct() {
        baseFunc.moveOverElement(ELEMENT_NEEDED_TO_APPEAR);
        baseFunc.getElement(ADD_TO_COMPARE_BUTTON).click();
        baseFunc.waitPage(WAIT_FOR_TOTAL_COMPARE);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickCompareButton() {
//        baseFunc.moveToelement(COMPARE_BUTTON_CLICK);



//        baseFunc.waitPage(COMPARE_BUTTON_CLICK);
        baseFunc.getElement(COMPARE_BUTTON_CLICK).click();
    }
}
