package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class MainPage {
  private final SelenideElement
    logo = $(".attachment-full size-full wp-image-20624"),
    nagruzochnoe = $("#nagruzochnoe"),
    funkcionalnoe = $("#funkcionalnoe"),
    avtomatizacija = $("#avtomatizacija"),
    razrabotka = $("#razrabotka"),
    mainPageHeader = $("h1");

  public MainPage openPage() {
    open("/");
    return this;
  }

  public MainPage closeBanner() {
    executeJavaScript("$('#fixedban').remove()");//Закрывают баннеры
    executeJavaScript("$('footer').remove()");
    return this;
  }
  public MainPage checkLogoVisible(){
    logo.shouldBe(visible);
    return this;
  }

  public MainPage clickNagruzochnoeButton() {
    nagruzochnoe.click();
    return this;
  }
  public MainPage clickFunkcionalnoeButton() {
    funkcionalnoe.click();
    return this;
  }
  public MainPage clickAvtomatizacijaButton() {
    avtomatizacija.click();
    return this;
  }
  public MainPage clickRazrabotkaButton() {
    razrabotka.click();
    return this;
  }
  public MainPage mainPageCheckHeader() {
    mainPageHeader.shouldHave(text("Улучшаем цифровой мир"));
    return this;
  }


}
