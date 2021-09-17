package lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Create extends BaseView {
    public Create(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/*[@id='container']/div[1]/div/div/div[2]/div/div/a")
    public WebElement createMenuItem;

    @Step ("Перейти на страницу создания контактного лица")
    public void goToContactPersonCreatePage() {
        createMenuItem.click();
        webDriverWait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath(ContactPersonCreatePage.lastNameXpathLocator)));
        )
    }


}
