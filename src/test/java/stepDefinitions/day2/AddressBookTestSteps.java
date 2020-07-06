package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class AddressBookTestSteps {

    private WebDriver driver;

    public AddressBookTestSteps(WebDriver driver) {
        this.driver = Hooks.driver;
    }

    @Given("open {string}")
    public void openHttpATestaddressbookCom(String url) {
        driver.get(url);
    }

    @When("click sing in")
    public void clickSingIn() {
    }

    @When("click sing up")
    public void clickSingUp() {
    }

    @And("populate it and remember this")
    public void populateItAndRememberThis() {
    }

    @Then("sing out")
    public void singOut() {
    }

    @When("add data from previous test")
    public void addDataFromPreviousTest() {
    }

    @And("click {string}")
    public void clickAddresses() {
    }

    @And("click new Address")
    public void clickNewAddress() {
    }

    @And("populate form")
    public void populateForm() {
    }

    @And("click Create Address")
    public void clickCreateAddress() {
    }

    @And("verify address added")
    public void verifyAddressAdded() {
    }

    @And("click List")
    public void clickList() {
    }

    @Then("verify address on page")
    public void verifyAddressOnPage() {
    }

    @When("sing in")
    public void singIn() {
    }

    @Then("destroy one address")
    public void destroyOneAddress() {
    }

    @And("verify address removed from page")
    public void verifyAddressRemovedFromPage() {
    }
}
