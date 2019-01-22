package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.AmazonBookPage;
import objects.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonBookPageSteps extends ApplicationPageBase {


    AmazonHomePage homePage = PageFactory.initElements(driver,AmazonHomePage.class);
    AmazonBookPage bookPage = PageFactory.initElements(driver,AmazonBookPage.class);


    @Given("^User is already on Home Page$")
    public void user_is_already_on_Home_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^user goes to Book page$")
    public void user_goes_to_Book_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        homePage.book();
    }

    @Then("^get text from Award Winner and assert$")
    public void get_text_from_Award_Winner_and_assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         String actualText =  bookPage.awardWinnersText();
         String expectedText = "Award Winners";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Bargain Books and Assert$")
    public void get_text_from_Bargain_Books_and_Assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.bargainBooksText();
        String expectedText = "Bargain Books";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get Text from Fall Reading and assert$")
    public void get_Text_from_Fall_Reading_and_assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.fallReadingText();
        String expectedText = "Fall Reading";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Book Of the month and Assert$")
    public void get_text_from_Book_Of_the_month_and_Assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.bookOfTheMonthText();
        String expectedText = "Best Books of the Month";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Book of the Year and Year$")
    public void get_text_from_Book_of_the_Year_and_Year() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.bookOfTheYearText();
        String expectedText = "Best Books of the Year";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Celebrity Pick and Assert$")
    public void get_text_from_Celebrity_Pick_and_Assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.celebrityPicksText();
        String expectedText = "Celebrity Picks";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Books in Spanish and Assert$")
    public void get_text_from_Books_in_Spanish_and_Assert() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.bookOfSpanishText();
        String expectedText = "Books in Spanish";
        Assert.assertEquals(actualText,expectedText);
    }

    @Then("^get text from Children's Book$")
    public void get_text_from_Children_s_Book() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String actualText =  bookPage.childrensBooksText();
        String expectedText = "Children's Books";
        Assert.assertEquals(actualText,expectedText);
    }






}
