package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginObjects extends BasePage {

    @FindBy(how = How.ID, using = "id_username")
    private WebElement usernameBx;

    @FindBy(how = How.ID, using = "id_password")
    private WebElement passwordBx;

    @FindBy(how = How.XPATH, using = "//input[@class='btn btn-success']")
    private WebElement submitBx;


    public LoginObjects(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getUsernameBx() {
        return usernameBx;
    }
    public WebElement getPasswordBx() {
        return passwordBx;
    }
    public WebElement getSubmitBx() {
        return submitBx;
    }
}
