package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SecondPage {
    public SecondPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@data-qa='login-email']")
    public WebElement loginEmailTextBox;

    @FindBy (xpath = "//input[@data-qa='login-password']")
    public WebElement loginpasswordTextBox;


}
