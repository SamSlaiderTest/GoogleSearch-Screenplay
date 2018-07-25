package co.com.qvision.google.tasks;

import co.com.qvision.google.userinterfaces.GoogleSearchPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class SearchForWord implements Task {

  private String word;

  @Override
  @Step("{0} searches for '#word'")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter
        .theValue(word)
        .into(GoogleSearchPage.SEARCH_TEXTAREA)
        .thenHit(Keys.RETURN));
  }

  public SearchForWord(String word) {
    this.word = word;
  }

  public static Task of(String word) {
    return Instrumented.instanceOf(SearchForWord.class).withProperties(word);
  }
}

