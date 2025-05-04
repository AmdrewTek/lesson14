package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;

@Tag("PerformanceLabTests")
public class PerformanceLabTests extends TestBase {
  MainPage mainPage = new MainPage();

  @Test
  @DisplayName("Открываем главную и проверяем видимость лого")
  void openMainPageAndCheckLogoTest(){
    mainPage.openPage();
    mainPage.checkLogoVisible();
  }

}
