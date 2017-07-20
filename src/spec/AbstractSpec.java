package spec;

import library.PeterDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;


/**
 * Created by peterli on 2017-07-20.
 */
public abstract class AbstractSpec {

    protected WebDriver setupLocalDriver() {

        WebDriver driver = new PeterDriver();
        driver.manage().window().setSize(new Dimension(1400, 1400));
        driver.get("https://myanimelist.net/");

        return driver;
    }


    public WebDriver getDriver() {
        WebDriver driver = null;

        System.out.println("Opening the local driver");
        driver = setupLocalDriver();

        return driver;
    }
}
