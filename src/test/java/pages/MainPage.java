package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
  private final SelenideElement
    logo = $(".attachment-full size-full wp-image-20624"),
    nagruzochnoe = $("nagruzochnoe"),
    funkcionalnoe = $("funkcionalnoe");

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


}
