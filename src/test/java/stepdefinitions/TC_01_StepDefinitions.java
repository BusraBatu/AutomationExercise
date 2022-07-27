package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01_StepDefinitions {
    @Given("Launch browser")
    public void launch_browser() {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }
    @When("Navigate to url {string}")
    public void navigate_to_url(String string) {


    }
    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {

    }
    @Then("Click on {string} button")
    public void click_on_button(String string) {

    }
    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {

    }
    @Then("Enter name and email address")
    public void enter_name_and_email_address() {

    }
    @Then("Click {string} button")
    public void click_button(String string) {

    }
    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {

    }
    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {

    }
    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {

    }
    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {

    }
    @Then("Click {string}")
    public void click(String string) {

    }
    @Then("Verify that {string} is visible and click {string} button")
    public void verify_that_is_visible_and_click_button(String string, String string2) {

    }
}
