package lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import static org.assertj.core.api.Assertions.assertThat;

public class hw5 {
    static WebDriver driver;
    WebDriverWait webDriverWait;
    private static final String BASE_URL = "https://www.kinopoisk.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupBrowser() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver,5);
    }

    @Test
    void chooseTheFilm() throws InterruptedException {
        driver.get(BASE_URL);
        driver.findElement(By.name("kp_query")).click();
        driver.findElement(By.name("kp_query")).sendKeys("Властелин колец: Братство кольца");
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[text()='Войти']")).click();

        WebDriverWait.until(driver.findElement(By.xpath("//a[@data-id='328']")));

       assertThat(driver.findElement(By.xpath("//a[@data-id='328']"))).hasText("Властелин колец: Братство кольца");


    }
    @AfterAll
    void tearDown() {
        driver.quit();
    }

}
