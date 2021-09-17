package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactPersonCreatePage extends BaseView {
   public ContactPersonCreatePage(WebDriver driver) {
       super(driver);
   }

   @FindBy(name = "crm_contact[lastName]")
    public WebElement contactLastName;

    @Step("Заполнить фамилия")
    public ContactPersonCreatePage fillLastName(String lastname) {
       contactLastName.sendKeys(lastname);
       return this;
    }

    @FindBy(name = "crm_contact[firstName]")
    public WebElement contactFirstName;

    @Step("Заполнить поле имя")
    public ContactPersonCreatePage fillFirstName(String firstname) {
        contactFirstName.sendKeys(firstname);
    }

    @FindBy(name = "crm_contact[middleName]")
    public WebElement contactMiddleName;

    @Step("Заполнить поле отчество")
    public ContactPersonCreatePage fillMiddleName(String middlename) {
        contactMiddleName.sendKeys(middlename);
    }

@FindBy(xpath = "//a/span[text()='Укажите организацию']")
    public WebElement companySelect;

    @Step("Указать организацию")
    public ContactPersonCreatePage selectCompany(String company) {
        new Select(companySelect).selectByVisibleText(company);
        return this;
    }

    @FindBy(name = "crm_contact[jobTitle]")
    public WebElement contactJobTitle;

    @Step("Заполнить поле должность")
    public ContactPersonCreatePage fillJobTitle(String job) {
        contactJobTitle.sendKeys(job);
    }

    @FindBy(name = "crm_contact[status]")
    public WebElement companySelectStatus;

    @Step("Указать статус")
    public ContactPersonCreatePage selectStatus(String status) {
        new Select(companySelectStatus).selectByVisibleText(status);
        return this;
    }

    @FindBy(xpath = saveAndCloseButtonXpathLocator)
    public WebElement saveAndCloseButton;

    public static final String saveAndCloseButtonXpathLocator = "//button[contains(text(), 'Сохранить и закрыть')]";








}
