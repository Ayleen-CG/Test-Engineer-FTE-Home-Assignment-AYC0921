import Steps.PostsSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Here is where all tests are written. All tests will be contained in this class
public class PostsTests extends BaseTest {
    PostsSteps postsSteps = new PostsSteps(_driver);
    @Test
    public void UserCreatesPostTest() throws InterruptedException {
        postsSteps.signInWithExistingUser();
        postsSteps.createNewPost();
        Thread.sleep(1000);
        postsSteps.verifyPost();
    }
    @Test
    public void UserFailsCreatePostWithoutTitleTest(){
        postsSteps.signInWithExistingUser();
        postsSteps.createNewPostWithoutTitle();
        postsSteps.verifyErrorPost();


    }

    @Test
    public void UserFailsToAddSubtitleTests(){
        postsSteps.signInWithExistingUser();
        postsSteps.createNewPostWithoutSubTitle();
        postsSteps.verifySubtitleErrorPost();
    }


}