package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

public class FirstSteps {

    private WebDriver driver;
    public FirstSteps() {
        this.driver = Hooks.driver;
    }

    @Given("open site HeroKuapp")
    public void open_site() {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click Add button")
        public void click_button() {
            driver.findElement(By.cssSelector("[onclick='addElement()']")).click();
        }

    @Then("button Delete added")
    public void verify_button_added() {
        Assertions.assertTrue(driver.findElement(By.cssSelector("[onclick='deleteElement()']")).isDisplayed(), "Button 'Delete' not added");
    }

    @Given("open site Selenium Beginner Guide")
    public void open_Selenium_site() {
        driver.get("http://book.theautomatedtester.co.uk/");
    }

    @When("I click Chapter2 button")
    public void clck_button_Chapter2() {
        driver.findElement(By.xpath("//a[@href='/chapter2']")).click();
    }

    @Then("Button With Name added")
    public void verify_button_with_name_added() {
        Assertions.assertTrue(driver.findElement(By.xpath("//input[@value='Button with name']")).isDisplayed(), "Button 'Button with name' not added");
    }




}
