package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AvtomatizacijaPage {
  @Step("Автоматизация тестирования")
  public AvtomatizacijaPage checkAvtomatizacijaPageTitle() {
    $("h1").shouldHave(text("Автоматизация тестирования"));
    return this;
  }
}
