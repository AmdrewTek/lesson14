package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
  private final SelenideElement
    logo = $(".attachment-full size-full wp-image-20624"),
    nagruzochnoe = $("#nagruzochnoe"),
    funkcionalnoe = $("#funkcionalnoe"),
    avtomatizacija = $("#avtomatizacija"),
    razrabotka = $("#razrabotka"),
    mainPageHeader = $("h1");

  @Step("Открыть главную страницу")
  public MainPage openPage() {
    open("/");
    return this;
  }

  public MainPage closeBanner() {
    executeJavaScript("$('#fixedban').remove()");//Закрывают баннеры
    executeJavaScript("$('footer').remove()");
    return this;
  }

  @Step("Проверить отображение логотипа")
  public MainPage checkLogoVisible() {
    logo.shouldBe(visible);
    return this;
  }

  @Step("Клик по пункту нагрузочное тестирование")
  public MainPage clickNagruzochnoeButton() {
    nagruzochnoe.click();
    return this;
  }

  @Step("Клик по пункту функциональное тестирование")
  public MainPage clickFunkcionalnoeButton() {
    funkcionalnoe.click();
    return this;
  }

  @Step("Клик по пункту автоматизация тестирования")
  public MainPage clickAvtomatizacijaButton() {
    avtomatizacija.click();
    return this;
  }

  @Step("Клик по пункту Разработка ПО")
  public MainPage clickRazrabotkaButton() {
    razrabotka.click();
    return this;
  }

  @Step("Проверка заголовка главной страницы")
  public MainPage mainPageCheckHeader() {
    mainPageHeader.shouldHave(text("Улучшаем цифровой мир"));
    return this;
  }
}
