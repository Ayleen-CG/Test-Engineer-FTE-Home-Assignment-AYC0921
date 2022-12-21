import org.testng.Assert;

public class CustomAssertions extends Assert {
    public static void isElementDisplayed (Boolean isElementDisplayed, String view, String url) {
        String errorMessage = "The element is not displayed "
                + " in " + url + " and in view " + view;
        System.out.println(errorMessage);
        Assert.assertTrue(isElementDisplayed, errorMessage);
    }
}
