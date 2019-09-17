package stepDefs;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import baseFunc.BaseFunc;
import pages.*;


public class OrangeDressStepDefs {
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;
    private DressesPage dressesPage;
    private ChoosedDressPage choosedDressPage;
    private YourCartPage yourCartPage;
    private WomenPage womenPage;
    private TopsPage topsPage;
    private TshirtsPage tshirtsPage;
    private ProductComparisonPage productComparisonPage;

    private final String url = "http://automationpractice.com/";


    @Given("automation practice homepage")
    public void open_home_page() {
        baseFunc.openPage(url);
        homePage = new HomePage(baseFunc);
    }

    @When("we click on {string} tab")
    public void clicking_dress_tab(String buttonName) {
        homePage.pressThePageYouNeed(buttonName);
    }

    @Then("dress page opens")
    public void checking_dresses_page() {
        dressesPage = new DressesPage(baseFunc);
    }

    @When("we click on {string} color filter")
    public void click_on_choosed_color(String colorName) {
        dressesPage.chooseTheColorToFilter(colorName);
    }

    @Then("orange dresses appears on the page")
    public void orange_dress_appearence_check() {
        dressesPage.loadingGifAppears();
    }

    @And("we check {string} color existing")
    public void check_colors_on_page(String colorToCheck) {
        dressesPage.checkAllColorsExistingOnPage(colorToCheck);
    }

    @When("we click on {string} dress")
    public void click_on_choosed_dress(String dressName) {
        dressesPage.clickingOnChoosedDress(dressName);
    }

    @Then("chosen dress page appears")
    public void check_that_simple_dress_page_open() {
        choosedDressPage = new ChoosedDressPage(baseFunc);
    }

    @And("we check that dress has {string} color")
    public void chosen_dress_color_check(String choseDressColor) {
        choosedDressPage.checkDressColor(choseDressColor);
    }

    @When("we add {int} dresses to the cart")
    public void how_much_dresses_need_to_buy(int dressAmountToAdd) {
        choosedDressPage.howMuchDressesYouNeed(dressAmountToAdd);
        choosedDressPage.pressAddToCart();
    }

    @Then("return one page before")
    public void one_backspace_ago() {
        baseFunc.backPage();
    }

    @Then("press on the cart button")
    public void go_to_cart() {
        homePage.pressCartButton();
    }

    @And("page with all chosen products opens")
    public void check_that_cart_opened() {
        yourCartPage = new YourCartPage(baseFunc);
    }

    @Then("compare total cost of product with sum in cart")
    public void compare_cost_of_product() {
        yourCartPage.compareCostOfDresses();
    }

    @Then("press on {string}")
    public void chosen_category(String categoryName) {
        womenPage = new WomenPage(baseFunc);
        womenPage.clickWhatYouNeed(categoryName);
    }

    @And("Tops page opens")
    public void tops_page_check() {
        topsPage = new TopsPage(baseFunc);
    }

//    @Then("we filter price cost from 19.00 to 28.00")
//    public void drag_slide_icon() {
//
//    }

    @When("press on {string} at Tops page")
    public void chose_product_from_blouses(String productName) {
        topsPage = new TopsPage(baseFunc);
        topsPage.oneOfProductClick(productName);
    }

    @Then("press on send to a friend")
    public void send_product_to_a_friend() {
        choosedDressPage = new ChoosedDressPage(baseFunc);
        choosedDressPage.pressSendMailButton();
    }

    @And("opens new form to send mail")
    public void check_that_form_opened() {
        choosedDressPage.mailCheck();
    }

    @Then("write {string} as name and {string} as mail")
    public void write_name_and_mail(String friendName, String friendMail) {
        choosedDressPage.sendingMailToFriend(friendName, friendMail);
    }

    @And("send all written information")
    public void send_button_pressing() {
        choosedDressPage.sendFilledInformation();
    }

    @Then("T-Shirts page opens")
    public void t_shirt_page_opened() {
        tshirtsPage = new TshirtsPage(baseFunc);
    }

    @And("press compare under product")
    public void add_product_to_compare() {
        tshirtsPage.moveOverProduct();
    }

    @And("click on big compare button")
    public void click_on_compare() {
        tshirtsPage.clickCompareButton();
    }

    @Then("opens Product Comparison page")
    public void comparison_page_check() {
        productComparisonPage = new ProductComparisonPage(baseFunc);
    }

    @Then("compare two products and add to cart cheapest one")
    public void add_cheapest_product() {
        productComparisonPage.addCheapestProduct();
        productComparisonPage.pressOnCoordinates();
    }
}
