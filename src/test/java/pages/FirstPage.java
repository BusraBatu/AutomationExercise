package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class FirstPage {
    public FirstPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@placeholder='Name']")
    public WebElement nameTextBox;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement emailTextBox;


    @FindBy(id = "id_gender2")
    public WebElement femaleGenderButton;

    @FindBy (id="first_name")
    public WebElement firstName;


    public void clickOnButton(String string) {
        WebElement buttons = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + string + "')]"));
        buttons.click();
    }

    public boolean visibleText(String text) {
        WebElement texts = Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
        return texts.isDisplayed();
    }

    public void clickButton(String string) {
        WebElement buttons = Driver.getDriver().findElement(By.xpath("//*[text()='" + string + "']"));
        buttons.click();
    }
    public void selectCheckBox (String string){
        WebElement checkBoxes = Driver.getDriver().findElement(By.xpath("//*[text()='" + string + "']"));
        checkBoxes.click();
    }
}
