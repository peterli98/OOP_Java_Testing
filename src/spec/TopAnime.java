package spec;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.MALMainPage;
import pageobjects.TopAnimePage;


/**
 * Created by peterli on 2017-06-22.
 */
public class TopAnime extends AbstractSpec{

    @Test
    public void goToTopAnime(){

        WebDriver driver = getDriver();

        MALMainPage mainPage = new MALMainPage(driver);

        mainPage.topAirngAnimeMore();

        TopAnimePage topAnimePage = new TopAnimePage(driver);

        topAnimePage.filterByAllAnime();


    }


}
