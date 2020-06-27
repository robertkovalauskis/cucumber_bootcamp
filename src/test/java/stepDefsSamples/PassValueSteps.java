package stepDefsSamples;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

import java.util.List;
import java.util.Map;

public class PassValueSteps {

    WebDriver driver;
    public PassValueSteps() {
        this.driver = Hooks.driver;
    }

    @Given("Im on  page")
    public void im_on_page() {
        //some code
    }

    @When("I add First Name {string}")
    public void i_add_first_name(String name) {
        driver.findElement(By.id("element")).sendKeys(name);
    }

    @When("Last Name {string}")
    public void last_name(String lastName) {
        driver.findElement(By.id("element2")).sendKeys(lastName);
    }

    @When("add Age {int}")
    public void add_age(int age) {
        // its impossible sendKeys with int, but I wanted just have this example in case if you will wonder how regex will be looking for int.
    }

    @Then("I able submit form")
    public void i_able_submit_form() {
        //some code
    }

    @When("I have list of names:")
    public void i_add_person_data(List<String> personalData) {
        driver.findElement(By.id("")).sendKeys(personalData.get(0));
        driver.findElement(By.id("")).sendKeys(personalData.get(1));
        driver.findElement(By.id("")).sendKeys(personalData.get(2));
    }

    @When("I add data:")
    public void i_add_data(Map<String,String> personData) {
        driver.findElement(By.id("name")).sendKeys(personData.get("name"));
        driver.findElement(By.id("lastName")).sendKeys(personData.get("last name"));
        driver.findElement(By.id("age")).sendKeys(personData.get("age"));
    }
}
