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

    @And("press on {string}")
    public void chosen_category(String categoryName) {
        womenPage = new WomenPage(baseFunc);
        womenPage.clickWhatYouNeed(categoryName);
    }

    @Then("Tops page opens")
    public void tops_page_check() {
        topsPage = new TopsPage(baseFunc);
    }

//    @Then("we filter price cost from 19.00 to 28.00")
//    public void drag_slide_icon() {
//
//    }

    @And("press on {string} at Tops page")
    public void chose_product_from_blouses(String productName) {
        topsPage.oneOfProductClick(productName);
    }

    @When("press on send to a friend")
    public void send_product_to_a_friend() {

    }

}
