package pageObjects;

import core.BaseCore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class AddUserPage extends BaseCore {

    @FindBy(how = How.NAME, using = "username")
    private WebElement userName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement password;

    @FindBy(how = How.NAME, using = "FormsButton2")
    private WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//blockquote//b")
    private List<WebElement> quoteList;

    // other page locator actually
    @FindBy(how = How.XPATH, using = "//b[contains(text(), 'ogin')]")
    private WebElement loginMessage;

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    public void setUserName(String usernameP) {
        userName.sendKeys(usernameP);
    }

    public void setPassword(String passwordP) {
        password.sendKeys(passwordP);
    }

    public void insertPassword(String pass) {
        userName.sendKeys(pass);
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String collectData() {
        WebElement details = null;
        details = quoteList.get(0).findElement(By.xpath("./.."));
        return details.getText();
    }

    // other page method
    // get Text for further Assertion
    public String getLoginMessage() {
        return loginMessage.getText();
    }


}
