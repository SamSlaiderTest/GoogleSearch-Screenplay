package co.com.qvision.google.questions;

import co.com.qvision.google.userinterfaces.GoogleResultsPage;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

  public class GoogleSearchResults implements Question<List<String>> {

      public static Question<List<String>> displayed() {
        return new GoogleSearchResults();
      }

      @Override
      public List<String> answeredBy(Actor actor) {
        return Text.of(GoogleResultsPage.RESULT_LIST).viewedBy(actor).asList();
      }
    }
