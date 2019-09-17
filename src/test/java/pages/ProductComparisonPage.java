package pages;

import baseFunc.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductComparisonPage {

    private BaseFunc baseFunc;

    private final By PRODUCT_COMPARISON_CHECK = By.xpath("//div/div/h1[contains(text(), 'Product Comparison')]");
    private final By TWO_COMPARISON_BLOKS = By.xpath("//div/table/tbody/tr/td[contains(@class, 'ajax_block_product comparison_infos')]");
    private final By PRICE_CONTAINERS_UNDER_BLOCKS = By.xpath("//div[@class='prices-container']/span");
    private final By LEFT_ADD_PRODUCT_BUTTON = By.xpath("//div/div/a[@data-id-product='1']/span");
    private final By RIGHT_ADD_PRODUCT_BUTTON = By.xpath("//div/div/a[@data-id-product='3']/span");
    private final By ADD_TO_CART_TWO_BUTTONS = By.xpath("//div/div[@class='button-container']/a[@title='Add to cart']/span");

    private String productPriceOne;
    private String withoutDollarProductPriceOne;
    double integerProductPriceOne;

    private String productPriceTwo;
    private String withoutDollarProductPriceTwo;
    double integerProductPriceTwo;

    public ProductComparisonPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        Assertions.assertFalse(baseFunc.isElementPresent(PRODUCT_COMPARISON_CHECK));
    }

    public void addCheapestProduct() {
        //plan, nadeznij kak wvejcarskije casi. Sdelatj 2 premennie, v kazduju zasunutj stoimostj produkta. potom sravnitj. Pervij produkt budet vsegda sleva.
        //
        WebElement elementik = baseFunc.getElement(LEFT_ADD_PRODUCT_BUTTON);
        Point point = elementik.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
        System.out.println("X = " + xcord + " Y = " + ycord);


        WebElement elementikTwo = baseFunc.getElement(RIGHT_ADD_PRODUCT_BUTTON);
        Point pointTwo = elementikTwo.getLocation();
        int xcordTwo = pointTwo.getX();
        int ycordTwo = pointTwo.getY();
        System.out.println("X = " + xcordTwo + " Y = " + ycordTwo);
    }

    public void pressOnCoordinates() {
        baseFunc.moveToCoordinatesfast(1022, 937);
    }
}
