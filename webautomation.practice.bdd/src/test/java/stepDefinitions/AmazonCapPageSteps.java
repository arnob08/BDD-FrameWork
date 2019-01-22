package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.AmazonCapPage;
import objects.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonCapPageSteps extends ApplicationPageBase {

        AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
        AmazonCapPage capPage = PageFactory.initElements(driver,AmazonCapPage.class);



    @Given("^User is alreedy in home page$")
    public void user_is_alreedy_in_home_page() throws Throwable {


    }


    @When("^get text from Men's hat$")
    public void get_text_from_Men_s_hat() throws Throwable {
        homePage.cap();
    }

    @Then("^Assert Text from Men's Hat$")
    public void assert_Text_from_Men_s_Hat() throws Throwable {
        String actualText = capPage.mensHatText();
        String expectedText = "Men's Hats & Caps";
        Assert.assertEquals(actualText, expectedText);
    }




    @When("^get text from Men's Hat$")
    public void get_text_from_Men_s_Hat() throws Throwable {
        homePage.cap();
    }

    @Then("^Assert Text from Men's Beany$")
    public void assert_Text_from_Men_s_Beany() throws Throwable {
        String actualText = capPage.mensBeaniText();
        String expectedText = "Men's Skullies & Beanies";
        Assert.assertEquals(actualText, expectedText);
    }

    @When("^ge text from Scarf$")
    public void ge_text_from_Scarf() throws Throwable {
       homePage.cap();
    }

    @Then("^Assert Text From Scarf$")
    public void assert_Text_From_Scarf() throws Throwable {
        String actualText = capPage.scarfsText();
        String expectedText = "Surf, Skate & Street Hats & Caps";
        Assert.assertEquals(actualText, expectedText);
    }


    }













