package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.AmazonHomePage;
import objects.AmazonSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

import static org.openxmlformats.schemas.drawingml.x2006.main.STColorSchemeIndex.Enum.table;

public class AmazonSignInSteps extends ApplicationPageBase {


    AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
    AmazonSignIn signInPage = PageFactory.initElements(driver,AmazonSignIn.class);


    @Given("^user is alraedy on home page$")
    public void user_is_alraedy_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        signInPage.tempt();
    }

    @When("^try log in by \"([^\"]*)\" and \"([^\"]*)\"$")
    public void try_log_in_by_and(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        signInPage.sendData(arg1,arg2);

    }

    @Then("^error Msg Is There$")
    public void error_Msg_Is_There() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText = signInPage.errormsg();
        String expectedText = "Important Message!";
        Assert.assertEquals(actualText,expectedText);
    }



    @Given("^user already on home page$")
    public void user_already_on_home_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        signInPage.tempt();
    }

    @When("^enter invalid data from Data Table$")
    public void enter_invalid_data_from_Data_Table(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        List<Map<String,String>> datatable = table.asMaps(String.class,String.class);
        signInPage.sendData(datatable.get(0).get("email"),datatable.get(0).get("password"));
    }

    @Then("^error msg should be there$")
    public void error_msg_should_be_there() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText = signInPage.errormsg();
        String expectedText = "Important Message!";
        Assert.assertEquals(actualText,expectedText);
    }









}
