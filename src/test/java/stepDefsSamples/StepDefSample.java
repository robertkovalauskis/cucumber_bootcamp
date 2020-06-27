package stepDefsSamples;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class StepDefSample {

    private WebDriver driver;
    public StepDefSample() {
        this.driver = Hooks.driver;
    }

    @Given("an initial condition")
    public void initial_condition() {
        //some code
    }

    // better to NOT use here "And" Annotation, use annotation to which "And" belongs, in this case AND for "Given".
    @Given("another condition")
    public void another_condition() {
    }

    @When("something happens")
    public void something_happens() {
    }

    @When("something else happens")
    public void something_else_happens() {
    }

    @Then("this is the result")
    public void this_is_the_result() {
    }

    @Then("this is also the result")
    public void this_is_also_the_result() {
    }
}
