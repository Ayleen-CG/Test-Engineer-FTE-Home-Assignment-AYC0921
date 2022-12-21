package Steps;
import ObjectsPages.LoginObjects;
import ObjectsPages.PostsObjects;
import ObjectsPages.UpdatePostObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UpdatePostSteps extends BaseSteps {
    public UpdatePostSteps(WebDriver webDriver) {
        super(webDriver);
    }

    LoginObjects loginObjects = PageFactory.initElements(webDriver, LoginObjects.class);
    PostsObjects postsObjects = PageFactory.initElements(webDriver, PostsObjects.class);
    UpdatePostObjects updatePostsObjects = PageFactory.initElements(webDriver, UpdatePostObjects.class);

    public void UserUpdatesFullPost() {
        updatePostsObjects.getEditBx().click();
        postsObjects.getTitleBx().sendKeys(" A Post");
        postsObjects.getSubtitleBx().sendKeys("yes");
        postsObjects.getBodyBx().sendKeys(" This is a Post");
        postsObjects.getSubmitBx().click();


    }

    public void verifyPostUpdateAll() {
        String actualPost = postsObjects.getPostContainer().getText();
        System.out.println(actualPost);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MMM. dd, yyyy, h:mm a");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1 = dateFormat.format(date);
        date1 = date1.replace("AM", "a.m.").replace("PM", "p.m.");
        String desiredPost = "A Post A Post\n" + "yesyes\n" + "Created by: ayc0921 | On: " + date1 + "\nThis is a Post This is a Post";
        System.out.println(desiredPost);
        actualPost.contains("Created by: ayc0921");
        Assert.assertEquals(desiredPost, actualPost);

    }

    public void UserUpdatesPartialPost() {
        updatePostsObjects.getEditBx().click();
        postsObjects.getSubtitleBx().sendKeys("yes");
        postsObjects.getBodyBx().sendKeys(", I believe");
        postsObjects.getSubmitBx().click();


    }
    public void verifyPostUpdatePartial() {
        String actualPost = postsObjects.getPostContainer().getText();
        System.out.println(actualPost);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MMM. dd, yyyy, h:mm a");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1 = dateFormat.format(date);
        date1 = date1.replace("AM", "a.m.").replace("PM", "p.m.");
        String desiredPost = "A Post\n" + "yesyes\n" + "Created by: ayc0921 | On: " + date1 + "\nThis is a Post, I believe";
        System.out.println(desiredPost);
        actualPost.contains("Created by: ayc0921");
        Assert.assertEquals(desiredPost, actualPost);

    }

    public void NavigateToPostView(){
        updatePostsObjects.getPostView();

    }
}