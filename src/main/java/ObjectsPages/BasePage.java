package ObjectsPages;

import org.openqa.selenium.WebDriver;

public class BasePage {
    //POM -> Page Object Model Base
        WebDriver webDriver;

        public BasePage (WebDriver webDriver) {
            this.webDriver = webDriver;
        }

    }

