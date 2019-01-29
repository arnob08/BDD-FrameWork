package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.AmazonBookPage;
import objects.AmazonHomePage;
import objects.AutomatedIphonePage;
import org.openqa.selenium.support.PageFactory;

public class AutomatedIphoneSearchSteps extends ApplicationPageBase {


    AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
    AutomatedIphonePage iphonePage = PageFactory.initElements(driver,AutomatedIphonePage.class);


    @Given("^user is alredy on home page$")
    public void user_is_alredy_on_home_page() throws Throwable {

    }

    @When("^search info is added from \"([^\"]*)\" list$")
    public void search_info_is_added_from_list(String arg1) throws Throwable {
       homePage.automatedSearch(arg1);
    }

    @Then("^get text from iphone page$")
    public void get_text_from_iphone_page() throws Throwable {
      String actualText =iphonePage.iphoneCharger1();
      String expectedText = "AmazonBasics Double Braided Nylon Lightning to USB A Cable, Advanced Collection - MFi Certified iPhone Charger - Dark Grey, 4-Inch";
    }







}
