package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.FirstPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TC_01_StepDefinitions {
    FirstPage one = new FirstPage();
    String userName;
    String email;
    Actions action = new Actions(Driver.getDriver());


    @Given("Navigate to url {string} in browser")
    public void navigate_to_url_in_browser(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));

    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assert.assertEquals(ConfigReader.getProperty("homePageURL"), Driver.getDriver().getCurrentUrl());
    }

    @Then("Click on {string} button")
    public void click_on_button(String string) {
        one.clickOnButton(string);
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        Assert.assertTrue(one.visibleText(string));
    }


    @Then("Enter name and email address")
    public void enter_name_and_email_address() {
        userName = Faker.instance().name().username();
        email = Faker.instance().internet().emailAddress();
        one.nameTextBox.sendKeys(userName);
        one.emailTextBox.sendKeys(email);
    }

    @Then("Click {string} button")
    public void click_button(String string) {
        one.clickButton(string);

    }


    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        one.femaleGenderButton.click();

        action.
                click(one.femaleGenderButton).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().internet().password()).
                sendKeys(Keys.TAB).
                sendKeys("13").
                sendKeys(Keys.TAB).
                sendKeys("A").
                sendKeys(Keys.TAB).
                sendKeys("1985").
                perform();
    }

    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        one.selectCheckBox(string);
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

        action.
                click(one.firstName).
                sendKeys(Faker.instance().name().firstName()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().name().lastName()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().company().name()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().streetName()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().streetName()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().country()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().state()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().city()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().address().zipCode()).
                sendKeys(Keys.TAB).
                sendKeys(Faker.instance().phoneNumber().cellPhone()).
                perform();
    }





    @And("Verify that {string} is visible and click {string} button")
    public void verifyThatIsVisibleAndClickButton(String arg0, String arg1) {
        try{
            verify_that_is_visible(arg0);
            click_button(arg1);
        }catch(NoSuchElementException e){

        }
    }
}
