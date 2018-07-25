package co.com.qvision.google.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.qvision.google.userinterfaces.GoogleSearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheApplication implements Task {

  private GoogleSearchPage googleSearchPage;

  @Override
  @Step("{0} start a google search")
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn().the(googleSearchPage));
  }

  public static OpenTheApplication onTheHomePage() {
    return instrumented(OpenTheApplication.class);
  }
}
