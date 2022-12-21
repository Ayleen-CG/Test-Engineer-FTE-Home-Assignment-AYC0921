package Steps;

import ObjectsPages.LoginObjects;
import ObjectsPages.PostsObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PostsSteps extends BaseSteps{
    public PostsSteps(WebDriver webDriver) {
        super(webDriver);
    }
    LoginObjects loginObjects = PageFactory.initElements(webDriver, LoginObjects.class);
    PostsObjects postsObjects = PageFactory.initElements(webDriver, PostsObjects.class);

    public void signInWithExistingUser() {
        loginObjects.getUsernameBx().sendKeys("ayc0921");
        loginObjects.getPasswordBx().sendKeys("Tinga-1000");
        loginObjects.getSubmitBx().click();
    }

    public void createNewPost() {
        postsObjects.getNewPost().click();
        postsObjects.getTitleBx().sendKeys("A Post");
        postsObjects.getSubtitleBx().sendKeys("yes");
        postsObjects.getBodyBx().sendKeys("This is a Post");
        postsObjects.getSubmitBx().click();

    }
    public void verifyPost(){
       String actualPost = postsObjects.getPostContainer().getText();
        System.out.println(actualPost);
        // Create object of SimpleDateFormat class and decide the format
        DateFormat dateFormat = new SimpleDateFormat("MMM. dd, yyyy, h:mm a");

        //get current date time with Date()
        Date date = new Date();

        // Now format the date
        String date1= dateFormat.format(date);
        date1 = date1.replace("AM", "a.m.").replace("PM","p.m.");
        String desiredPost = "A Post\n" + "yes\n" + "Created by: ayc0921 | On: " + date1  +"\nThis is a Post";
        System.out.println(desiredPost);
        actualPost.contains("Created by: ayc0921");
        Assert.assertEquals(desiredPost,actualPost);




    }
    public void createNewPostWithoutTitle() {
        postsObjects.getNewPost().click();
        postsObjects.getSubtitleBx().sendKeys("yes");
        postsObjects.getBodyBx().sendKeys("This is a Post");
        postsObjects.getSubmitBx().click();

    }
    public void verifyErrorPost(){
        ///The error message is not an object its an HTML5 required attribute
        String message = postsObjects.getTitleBx().getAttribute("validationMessage");
        System.out.println(message);
        String desiredmessage = "Please fill out this field.";
        Assert.assertEquals(message,desiredmessage);

    }

    public void createNewPostWithoutSubTitle() {
        postsObjects.getNewPost().click();
        postsObjects.getTitleBx().sendKeys("Title");
        postsObjects.getBodyBx().sendKeys("This is a Post");
        postsObjects.getSubmitBx().click();

    }

    public void verifySubtitleErrorPost(){
        ///The error message is not an object its an HTML5 required attribute
        String message = postsObjects.getSubtitleBx().getAttribute("validationMessage");
        System.out.println(message);
        String desiredmessage = "Please fill out this field.";
        Assert.assertEquals(message,desiredmessage);

    }
}

