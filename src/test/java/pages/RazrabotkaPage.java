package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RazrabotkaPage {
  @Step("Заказная разработка ПО")
  public RazrabotkaPage checkRazrabotkaPageTitle() {
    $("h1").shouldHave(text("Заказная разработка ПО"));
    return this;
  }
}
