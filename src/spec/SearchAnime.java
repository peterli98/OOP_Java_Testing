package spec;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageobjects.MALMainPage;

/**
 * Created by peterli on 2017-07-20.
 */
public class SearchAnime extends AbstractSpec {

    @Test
    public void searchAnime(){

        WebDriver driver = getDriver();

        MALMainPage start = new MALMainPage(driver);

        start.searchAnime("Kyoukai no Kanata");
    }

}
