package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 * Created by peterli on 2017-07-20.
 */
public class MALMainPage extends AbstractPageObjects {

    WebDriver mALMainPageDriver;

    public MALMainPage(WebDriver driver){

        mALMainPageDriver = driver;

    }

    public SearchPage searchAnime (String names) {

        mALMainPageDriver.findElement(By.xpath("//*[@id='topSearchText']")).click();
        mALMainPageDriver.findElement(By.xpath("//*[@id='topSearchText']")).sendKeys(names);


        mALMainPageDriver.findElement(By.xpath("//*[@id='topSearchButon']")).click();

        return new SearchPage(getDriver());
    }

    public TopAnimePage topAirngAnimeMore(){

        mALMainPageDriver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/article[2]/div/div/h2/a")).click();

        return new TopAnimePage(getDriver());
    }
}
