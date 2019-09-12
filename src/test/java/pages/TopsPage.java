package pages;

import baseFunc.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopsPage {

    private BaseFunc baseFunc;
    private final By TOPS_PAGE_LOGO_CHECK = By.xpath("//div/div/div/span[@class='category-name']");
    private final By TOPS_PAGE_PRODUCTS = By.xpath("//li/div/div/div/a/img");


    public TopsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        Assertions.assertFalse(baseFunc.isElementPresent(TOPS_PAGE_LOGO_CHECK));
    }

    public void oneOfProductClick(String productChoice) {
        List<WebElement> topsNeeedProduct = baseFunc.getAllElements(TOPS_PAGE_PRODUCTS);
        for (int i = 0; i < topsNeeedProduct.size(); i++) {
            if (topsNeeedProduct.get(i).getAttribute("title").equals(productChoice)) {
                topsNeeedProduct.get(i).click();
            }
        }
    }
}
