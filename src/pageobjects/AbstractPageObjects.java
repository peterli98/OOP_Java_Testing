package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by peterli on 2017-07-20.
 */
public abstract class AbstractPageObjects {

    public WebDriver driver;

    public WebDriver getDriver() {
        return this.driver;
    }

}
