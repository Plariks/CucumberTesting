package pages;

import baseFunc.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopsPage {

    private BaseFunc baseFunc;
    private final By TOPS_PAGE_LOGO_CHECK = By.xpath("//div/div/div/span[@class='category-name']");
    private final By TOPS_PAGE_PRODUCTS = By.xpath("//div/div/h5/a");
    private final By TOPS_PAGE_PRODUCTS_SMALLER = By.xpath("//div/div[@class='right-block']/h5/a");


    public TopsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
//        Assertions.assertFalse(baseFunc.isElementPresent(TOPS_PAGE_LOGO_CHECK));
    }

    public void oneOfProductClick(String productChoice) {
        baseFunc.waitPage(TOPS_PAGE_PRODUCTS_SMALLER);
        List<WebElement> topsNeedProduct = baseFunc.getAllElements(TOPS_PAGE_PRODUCTS);
        for (int i = 0; i < topsNeedProduct.size(); i++) {
            if (topsNeedProduct.get(i).getAttribute("title").equals(productChoice)) {
                topsNeedProduct.get(i).click();
            } else {
                continue;
            }
        }
    }
}
