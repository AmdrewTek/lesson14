package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class NagruzochnoePage {
  @Step("Нагрузочное тестирование")
  public NagruzochnoePage checkNagruzochnoePageTitle() {
    $("h1").shouldHave(text("Нагрузочное тестирование"));
    return this;
  }
}
