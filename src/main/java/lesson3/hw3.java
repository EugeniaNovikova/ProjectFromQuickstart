package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hw3 {
    private static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginToCrm();
        driver.get("https://crm.geekbrains.space/contact/create");
        driver.findElement(By.xpath("//a[@title='Контрагенты']")).click();


        Thread.sleep(5000);
        driver.findElement(By.name("crm_contact[lastName]")).click();
        driver.findElement(By.name("crm_contact[lastName]")).sendKeys("LASTNAME");

       driver.findElement(By.name("crm_contact[firstName]")).click();
        driver.findElement(By.name("crm_contact[firstName]")).sendKeys("FIRSTNAME");
        Thread.sleep(5000);

        driver.findElement(By.name("crm_contact[middleName]")).click();
        driver.findElement(By.name("crm_contact[middleName]")).sendKeys("MIDDLENAME");

        driver.findElement(By.id("ui-datepicker-div")).click();
        driver.findElement(By.id("ui-datepicker-div")).sendKeys("DATE");

        Select companySelect = new Select(driver.findElement(By.xpath("//a/span[text()='Укажите организацию']")));
        driver.findElement(By.xpath("//a/span[text()='Укажите организацию']")).click();
        driver.findElement(By.xpath("//a/span[text()='Укажите организацию']")).sendKeys("COMPANY");

        driver.findElement(By.name("crm_contact[jobTitle]")).click();
        driver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("JOBtitle");

        driver.findElement(By.name("crm_contact[companyBusinessUnit]")).click();
        driver.findElement(By.name("crm_contact[companyBusinessUnit]")).sendKeys("BUSINESSunit");

        driver.findElement(By.name("crm_contact[companyBusinessUnit]")).click();
        driver.findElement(By.name("crm_contact[companyBusinessUnit]")).sendKeys("COMPANYbusinessUNIT");

        driver.findElement(By.name("crm_contact[department]")).click();
        driver.findElement(By.name("crm_contact[department]")).sendKeys("DEPARTMENT");

        driver.findElement(By.name("crm_contact[supervisor]")).click();
        driver.findElement(By.name("crm_contact[supervisor]")).sendKeys("SUPERVISOR");

        driver.findElement(By.name("crm_contact[alternate]")).click();
        driver.findElement(By.name("crm_contact[alternate]")).sendKeys("ALTERNATE");

       Select statusSelect = new Select(driver.findElement(By.name("crm_contact[status]")));
       statusSelect.selectByVisibleText("Активный");

        driver.findElement(By.xpath("//a/class[text()='Добавить телефон']")).click();

        driver.findElement(By.name("crm_contact[phones][1][prefixCode]")).click();
        driver.findElement(By.name("crm_contact[phones][1][prefixCode]")).sendKeys("123");

        driver.findElement(By.name("crm_contact[phones][1][phone]")).click();
        driver.findElement(By.name("crm_contact[phones][1][phone]")).sendKeys("123456");

        driver.findElement(By.name("crm_contact[phones][1][internalCode]")).click();
        driver.findElement(By.name("crm_contact[phones][1][internalCode]")).sendKeys("22");

        driver.findElement(By.name("crm_contact[email]")).click();
        driver.findElement(By.name("crm_contact[email]")).sendKeys("mail@mail.com");

        driver.findElement(By.xpath("//button[contains(text(), 'Сохранить и закрыть')]")).click();

        Thread.sleep(5000);
        driver.quit();

    }

        public static void loginToCrm() {
            driver.get("https://crm.geekbrains.space/user/login");
            driver.findElement(By.id("prependedInput")).sendKeys("Applanatest1");
            driver.findElement(By.id("prependedInput2")).sendKeys("Student2020!");
            driver.findElement(By.xpath("//button")).click();

    }
}

