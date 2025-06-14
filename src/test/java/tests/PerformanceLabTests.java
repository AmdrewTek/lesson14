package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.*;

@Tag("PerformanceLabTests")
public class PerformanceLabTests extends TestBase {
  MainPage mainPage = new MainPage();
  AvtomatizacijaPage avtomatizacijaPage = new AvtomatizacijaPage();
  FunkcionalnoePage funkcionalnoePage = new FunkcionalnoePage();
  NagruzochnoePage nagruzochnoePage = new NagruzochnoePage();
  RazrabotkaPage razrabotkaPage = new RazrabotkaPage();

  @Test
  @DisplayName("Проверка работы главной страницы")
  void openMainPageAndCheckLogoTest() {
    mainPage.openPage()
        .closeBanner()
      .mainPageCheckHeader();
  }

  @Test
  @DisplayName("Проверка работы страницы автоматизации тестирования")
  void openAvtomatizacijaPage() {
    mainPage.openPage()
      .closeBanner()
      .clickAvtomatizacijaButton();
    avtomatizacijaPage.checkAvtomatizacijaPageTitle();
  }
  @Test
  @DisplayName("Проверка работы страницы функционального тестирования")
  void openFunkcionalnoePage() {
    mainPage.openPage()
      .closeBanner()
      .clickFunkcionalnoeButton();
    funkcionalnoePage.checkFunkcionalnoePageTitle();
  }
  @Test
  @DisplayName("Проверка работы страницы нагрузочного тестирования")
  void openNagruzochnoePage() {
    mainPage.openPage()
      .closeBanner()
      .clickNagruzochnoeButton();
    nagruzochnoePage.checkNagruzochnoePageTitle();
  }
  @Test
  @DisplayName("Проверка работы страницы разработки ПО")
  void openRazrabotkaPage() {
    mainPage.openPage()
      .closeBanner()
      .clickRazrabotkaButton();
    razrabotkaPage.checkRazrabotkaPageTitle();
  }

}
