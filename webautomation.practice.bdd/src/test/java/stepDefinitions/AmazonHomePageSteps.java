package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.AmazonBatPage;
import objects.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonHomePageSteps extends ApplicationPageBase {



    AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
    AmazonBatPage batPage = PageFactory.initElements(driver,AmazonBatPage.class);


    @Given("^user is already on home page$")
    public void user_is_already_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^get text from CotactUs$")
    public void get_text_from_bat() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       homePage.contactUs();
    }

    @Then("^bat should have text$")
    public void bat_should_have_text() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String expectedtext = "Your Amazon.com";
        String actualText = homePage.contactUs();
        Assert.assertEquals(actualText,expectedtext);
    }










}
