package lesson6;

import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Test;

public class PageObjectTest extends BaseTest {
    @Test
    @Description("Тест логина и создания контактного лица")
    void loginInCrmWithPageObjectTest() {
        driver.get("https://crm.geekbrains.space/");
        new LoginPage(driver)
                .fillInputLogin("Applanatest1")
                .fillInputPassword("Student2020!")
                .clickLoginButton()
                .navigationMenu.openNavigationMenuItem("Контактное лицо");

        new Create(driver).goToContactPersonCreatePage();
        new ContactPersonCreatePage(driver)
                .fillLastName("Davidov")
                .fillFirstName("Polina")
                .fillMiddleName("Igor'evna")
                .selectCompany("Research & Development")
                .fillJobTitle("President")
                .selectStatus("Активный")
                .saveAndCloseButton.click();
    }

}
