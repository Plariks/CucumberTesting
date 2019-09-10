package stepDefs;

import baseFunc.BaseFunc;
import cucumber.api.java.en.Given;

public class TestStepDefs {
    private BaseFunc baseFunc = new BaseFunc();

    @Given("automation practice home page")
    public void get_home_page() {
        baseFunc.openPage("https://automationpractice.com");
    }
}