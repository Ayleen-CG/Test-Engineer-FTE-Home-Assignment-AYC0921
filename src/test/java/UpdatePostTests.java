import Steps.PostsSteps;
import Steps.UpdatePostSteps;
import org.testng.annotations.Test;


public class UpdatePostTests extends BaseTest{
    UpdatePostSteps updatePostsSteps = new UpdatePostSteps(_driver);
    PostsSteps postsSteps = new PostsSteps(_driver);

    @Test
    public void UserUpdatesFullPostTest() throws InterruptedException {
        postsSteps.signInWithExistingUser();
        postsSteps.createNewPost();
        Thread.sleep(1000);
        updatePostsSteps.UserUpdatesFullPost();
        updatePostsSteps.verifyPostUpdateAll();

    }

    @Test
    public void UserUpdatesPartialPostTest() throws InterruptedException {
        postsSteps.signInWithExistingUser();
        postsSteps.createNewPost();
        Thread.sleep(1000);
        updatePostsSteps.UserUpdatesPartialPost();
        updatePostsSteps.verifyPostUpdatePartial();

    }

    @Test
    public void UserModifiesOtherUserPostTest() throws InterruptedException {
        postsSteps.signInWithExistingUser();
        updatePostsSteps.NavigateToPostView();
        //Unable to do more since webpage states it is not possible to view posts by other users.
    }
}
