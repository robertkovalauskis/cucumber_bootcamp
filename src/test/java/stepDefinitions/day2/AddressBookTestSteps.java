package stepDefinitions.day2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import stepDefinitions.hooks.Hooks;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class AddressBookTestSteps {

    private WebDriver driver;

    public AddressBookTestSteps() {

        driver = Hooks.driver;
    }


    @Given("open {string}")
    public void open_webpage(String url) {
        driver.get(url);
    }

    @When("click sing in")
    public void click_on_singn_in() {
        driver.findElement(By.xpath("//*[@id='sign-in']")).click();
    }

    @When("enter login {string} and password {string}")
    public void enter_login_and_password(String email, String pass) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"session_email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"session_password\"]")).sendKeys(pass);
    }

    @When("sing in once more")
    public void click_on_sing_in() {
        driver.findElement(By.xpath("//*[@id=\"clearance\"]/div/div/form/div[3]/input")).click();
    }

    @Then("sing out")
    public void sing_out() {
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]")).click();
    }

    // @CreatingNewAddresses
    @When("click on new addresses")
    public void click_on_addresses() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
    }

    @And("add new Address")
    public void click_on_new_address() {
        driver.findElement(By.xpath("/html/body/div/a")).click();
    }

    @And("enter {string}, {string}, {string} and the {string} in the form")
    public void fill_the_form(String firstName, String lastName, String address, String city) {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"address_first_name\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"address_last_name\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@id=\"address_city\"]")).sendKeys(city);
        driver.findElement(By.xpath("//*[@id=\"address_street_address\"]")).sendKeys(address);
//      driver.findElement(By.xpath("//*[@id=\"address_state\"]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"address_zip_code\"]")).sendKeys("LV-3001");
//      driver.findElement(By.xpath("//*[@id=\"address_interest_read\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"new_address\"]/div[17]/input")).click();
    }

    @And("click Create Address")
    public void click_create_address() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then("verify First name")
    public void assert_first_name() {
//        Assertions.assertEquals(<???>, driver.findElement(By.xpath("/html/body/div/p[1]/span[2]")).getText(), "First name isn't asserted!!!");
//        Logger.getLogger("First name asserted?");
    }

    @And("return to Addresses")
    public void return_to_addresses_page() {
        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]")).click();
    }

    @Then("verify address on page")
    public void verify_address_on_page() {
    }

    //  @DestroyAddressTest

    // method go to Addresses already declared above

    @Then("destroy one address")
    public void destroy_one_address() {
        driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[7]/a")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Then("verify address removed from page")
    public void verify_address_removed_from_page() {
        Assertions.assertFalse(driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[1]")).isDisplayed());
    }


}
