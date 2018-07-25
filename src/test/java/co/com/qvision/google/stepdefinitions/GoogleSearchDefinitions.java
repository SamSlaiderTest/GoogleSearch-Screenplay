package co.com.qvision.google.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItem;

import co.com.qvision.google.questions.GoogleSearchResults;
import co.com.qvision.google.tasks.OpenTheApplication;
import co.com.qvision.google.tasks.SearchForWord;
import co.com.qvision.google.userinterfaces.GoogleSearchPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class GoogleSearchDefinitions {

  @Managed(driver = "chrome")
  private WebDriver browser;

  //GoogleSearchPage googleSearch;

  Actor pepito = Actor.named("Pepito");

  @Before
  public void setup() {
    pepito.can(BrowseTheWeb.with(browser));
  }


    @Given("^that pepito wants to use google search$")
    public void thatPepitoWantsToUseGoogleSearch () {
      pepito.wasAbleTo(OpenTheApplication.onTheHomePage());
    }

    @When("he search the word Playstation")
    public void heSearchTheWordPlaystation () {
      pepito.attemptsTo(SearchForWord.of("Playstation"));
    }

    @Then("he should see the word Playtation on the screen") public void heShouldSeeTheWordPlaytationOnTheScreen
    () {
      pepito.should(seeThat(GoogleSearchResults.displayed(), hasItem(containsString("Playstation"))));
    }

  }
