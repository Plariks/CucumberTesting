package pages;

import baseFunc.BaseFunc;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenPage {

    private BaseFunc baseFunc;
    private final By CLICK_ON_NEEDED_PRODUCT = By.xpath("//ul/li/div/a");


    public WomenPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void clickWhatYouNeed(String productCategory) {
        List<WebElement> neededProductCategory = baseFunc.getAllElements(CLICK_ON_NEEDED_PRODUCT);
        for (int i = 0; i < neededProductCategory.size(); i++) {
            if (neededProductCategory.get(i).getAttribute("title").equals(productCategory)) {
                neededProductCategory.get(i).click();
            }
        }
    }


}
