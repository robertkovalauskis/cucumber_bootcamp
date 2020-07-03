package stepDefinitions.day1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinitions.hooks.Hooks;

import java.util.List;

public class NumberStepDef {

    private WebDriver driver;

    public NumberStepDef() {
        this.driver = Hooks.driver;
    }

    @Given("Open 'Enter Number' page")
    public void open_page() {
        driver.get("https://kristinek.github.io/site/tasks/enter_a_number");
    }

    @When("I send {string}")
    public void send_number(String number) {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(number);
    }

    @When("I click button 'Submit'")
    public void click_submit() {
        driver.findElement(By.xpath("//button[@class='w3-btn w3-orange w3-margin']")).click();
    }

    @Then("I see result {string}")
    public void message(String message) {
        //setting
        List<WebElement> errorElements = driver.findElements(By.id("ch1_error"));
        if (!errorElements.isEmpty()) {
            errorElements.get(0).getText();
            Assertions.assertEquals(message, errorElements.get(0).getText());
        } else {
            // handling pop-up (instead of text web element in if statement)
            // create alert object and switch particulaty to it
            Alert alert = driver.switchTo().alert();
            Assertions.assertEquals(message, alert.getText());
        }


    }


}

