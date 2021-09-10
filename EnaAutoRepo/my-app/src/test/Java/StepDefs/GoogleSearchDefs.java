package Java.StepDefs;

import Java.Objects.PageObjects.GoogleSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class GoogleSearchDefs {

    WebDriver driver = new ChromeDriver();

    @Given("^I navigate to google search$")
    public void i_navigate_to_google_search(){
        driver.get("http://www.google.com/");


    }


    @When("^I search for favourite singer (.*)$")
    public void iSearchForFavouriteSingerAdele(String singerName) {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        googleSearchPage.searchTheSinger(singerName);
    }

    @Then("^I see there is a search result with Singer name$(.*)")
    public void i_see_there_is_a_search_result_with_Singer_name(String checkName) {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);
        String textToCheck = googleSearchPage.checkSearchResult();
        assertTrue("The Singer name Adele matches with result as "+ checkName,googleSearchPage.checkSearchResult().contains(checkName));
    }

}

