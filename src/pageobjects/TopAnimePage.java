package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by peterli on 2017-07-20.
 */
public class TopAnimePage {

    WebDriver topAnimePage;

    public TopAnimePage(WebDriver driver){

        topAnimePage = driver;
    }

    public void filterByAllAnime(){

        topAnimePage.findElement(By.xpath("//*[@id='horiznav_nav']/ul/li[1]/a")).click();

    }

}
