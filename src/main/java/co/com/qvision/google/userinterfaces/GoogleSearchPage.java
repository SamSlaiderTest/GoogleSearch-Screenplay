package co.com.qvision.google.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.google.com/ncr")
public class GoogleSearchPage extends PageObject {
  public static final Target SEARCH_TEXTAREA = Target
      .the("Search Text Area")
      .located(By.id("lst-ib"));
}
