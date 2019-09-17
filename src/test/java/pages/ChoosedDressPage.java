package pages;

import baseFunc.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChoosedDressPage {


    private BaseFunc baseFunc;
    private final By PRODUCT_INFO_CHECK = By.xpath("//section/h3[contains(text(), 'More info')]");
    private final By CHOOSED_ITEM_COLORS = By.xpath("//ul[@id='color_to_pick_list']/li/a");
    private final By INPUT_FIELD = By.xpath("//p/input[@id='quantity_wanted']");
    private final By ADD_TO_CART_BUTTON = By.xpath("//button[@name='Submit']");
    private final By SEND_TO_FRIEND_CHECK = By.xpath("//div/div/div[@id='send_friend_form']");
    private final By INPUT_FOR_FRIEND_NAME = By.xpath("//p/input[@id='friend_name']");
    private final By INPUT_FOR_FRIEND_MAIL = By.xpath("//p/input[@id='friend_email']");
    private final By SEND_MAIL_TO_FRIEND_BUTTON = By.xpath("//div/ul/li/a[@id='send_friend_button']");
    private final By SEND_BUTTON_UNDER_FORM = By.xpath("//div/p/button[@id='sendEmail']");
    private final By OK_BUTTON_AFTER_SENT_MAIL = By.xpath("//div/div/div/p/input[@class='button']");

    WebElement howMuchDressNeeded;


    public ChoosedDressPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        Assertions.assertFalse(baseFunc.isElementPresent(PRODUCT_INFO_CHECK));
    }

    public void checkDressColor(String thisColor) {
        List<WebElement> correctColor = baseFunc.getAllElements(CHOOSED_ITEM_COLORS);
        for (int i = 0; i < correctColor.size(); i++) {
            if (correctColor.get(i).getAttribute("name").equals(thisColor)) {
                System.out.println("This dress has: " + thisColor + " color.");
            }
        }
    }

    public void howMuchDressesYouNeed(int choosedDressAmount) {
        howMuchDressNeeded = baseFunc.getElement(INPUT_FIELD);
        howMuchDressNeeded.clear();
        howMuchDressNeeded.sendKeys(String.valueOf(choosedDressAmount));
    }

    public void pressAddToCart() {
        baseFunc.getElement(ADD_TO_CART_BUTTON).click();
        baseFunc.refreshPage();
    }

    public void sendingMailToFriend(String nameOfFriend, String mailOfFriend) {
        baseFunc.getElement(INPUT_FOR_FRIEND_NAME).sendKeys(nameOfFriend);
        baseFunc.getElement(INPUT_FOR_FRIEND_MAIL).sendKeys(mailOfFriend);
    }

    public void mailCheck() {
        Assertions.assertFalse(baseFunc.isElementPresent(SEND_TO_FRIEND_CHECK));
    }

    public void pressSendMailButton() {
        baseFunc.getElement(SEND_MAIL_TO_FRIEND_BUTTON).click();
    }

    public void sendFilledInformation() {
        baseFunc.getElement(SEND_BUTTON_UNDER_FORM).click();
        baseFunc.waitPage(OK_BUTTON_AFTER_SENT_MAIL);
        baseFunc.getElement(OK_BUTTON_AFTER_SENT_MAIL).click();
    }
}
