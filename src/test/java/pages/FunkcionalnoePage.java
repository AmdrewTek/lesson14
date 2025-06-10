package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class FunkcionalnoePage {
  @Step("Функциональное тестирование")
  public FunkcionalnoePage checkFunkcionalnoePageTitle() {
    $("h1").shouldHave(text("Функциональное тестирование"));
    return this;
  }
}
