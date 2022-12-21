package ObjectsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostsObjects extends BasePage {

    public PostsObjects(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'New Post')]")
    private WebElement newPost;

    @FindBy(how = How.ID, using = "id_title")
    private WebElement titleBx;

    @FindBy(how = How.ID, using = "id_subtitle")
    private WebElement subtitleBx;

    @FindBy(how = How.ID, using = "id_body")
    private WebElement bodyBx;

    @FindBy(how = How.XPATH, using = "//input[@class='btn btn-success']")
    private WebElement submitBx;

    @FindBy(how = How.XPATH, using = "//div[@class='container']")
    private WebElement postContainer;

    public WebElement getNewPost() {
        return newPost;
    }
    public WebElement getTitleBx() {
        return titleBx;
    }
    public WebElement getBodyBx() {
        return bodyBx;
    }
    public WebElement getSubtitleBx() {
        return subtitleBx;
    }
    public WebElement getSubmitBx() {
        return submitBx;
    }
    public WebElement getPostContainer() {
        return postContainer;
    }


}
