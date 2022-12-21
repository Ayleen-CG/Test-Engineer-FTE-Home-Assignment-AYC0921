package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UpdatePostObjects extends BasePage {
    public UpdatePostObjects(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-outline-primary']")
    private WebElement editBx;


    public WebElement getEditBx() {
        return editBx;
    }
    //h4/a[contains(text(),'MCQ M'

    @FindBy(how = How.XPATH, using = "//div/a[contains(text(),'Posts')]")
    private WebElement postView;

    public WebElement getPostView() {
        return postView;
    }
}
