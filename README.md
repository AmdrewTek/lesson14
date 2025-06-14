# ![Logo](media/icon/perfomans-Lab-logotip.svg)
# Проект по автоматизации тестовых сценариев для сайта компании [Перфоманс Лаб](https://www.performance-lab.ru/)
---

## Технологии и инструменты

- [Java](https://www.java.com/ru/)
- [Selenide](https://ru.selenide.org/)
- [Selenoid](https://github.com/aerokube/selenoid)
- [JUnit 5](https://junit.org/junit5/)
- [Gradle](https://gradle.org/)
- [Jenkins](https://www.jenkins.io/)
- [Allure Report](https://allurereport.org/)
- [Telegram Bot](https://core.telegram.org/bots/api)

---

## Запуск тестов

### Запуск тестов из терминала

Команда для запуска теста:  
`gradle clean PerformanceLabTests`  
Команда для запуска теста с параметрами:  
`gradle clean PerformanceLabTests -Dbrowser=chrome -Dversion=100 -Dsize=1920x1080`

---

### Jenkins

Запустить [тест](https://jenkins.autotests.cloud/job/14.1/) можно в Jenkins.
Для этого необходимо кликнуть по кнопке **Build with Parameters**, после чего
выбрать параметры и нажать кнопку **Build**
<img src="media/report_media/jenkins_build.png" />

---

## Allure отчет

После прохождения
теста [отчёт](https://jenkins.autotests.cloud/job/14.1/10/allure/) выгружается в
**build/allure-results**
<img src="media/report_media/allure_report.png" />
К каждому отчёту о тестировании автоматически создаются скриншоты, видео, логи и
копия странички  
Пример
видео <img src="media/report_media/video_report.gif" />

---

## Уведомления в Telegram с помощью бота

После завершения сборки телеграм бот уведомляет о результатах прохождения теста.
Бот может тегать нужных участников чата  
<img src="media/report_media/tg_report.png"/>