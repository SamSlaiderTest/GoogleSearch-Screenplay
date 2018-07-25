package co.com.qvision.google.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GoogleResultsPage extends PageObject {

  public static final Target RESULT_LIST = Target
      .the("Result List")
      .located(By.id("res"));

}
