package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.SecondPage;

public class TC_02_StepDefinitions {

    SecondPage two = new SecondPage();
    TC_01_StepDefinitions firststeps = new TC_01_StepDefinitions();

    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        two.loginEmailTextBox.sendKeys(firststeps.email);
        two.loginpasswordTextBox.sendKeys(firststeps.password + Keys.ENTER);

    }
}
