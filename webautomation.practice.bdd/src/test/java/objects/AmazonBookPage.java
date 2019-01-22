package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonBookPage extends ApplicationPageBase {

    @FindBy(xpath = "//a[text()='Award Winners']")
    private WebElement awardWinners;

    @FindBy(xpath = "//a[text()='Bargain Books']")
    private WebElement bargainBooks;

    @FindBy(xpath = "//a[text()='Fall Reading']")
    private WebElement fallReading;

    @FindBy(xpath = "//a[text()='Best Books of the Month']")
    private WebElement bookOfTheMonth;

    @FindBy(xpath = "//a[text()='Best Books of the Year']")
    private WebElement bookOfTheYear;

    @FindBy(xpath = "//a[text()='Celebrity Picks']")
    private WebElement celebrityPicks;

    @FindBy(xpath = "//a[text()='Books in Spanish']")
    private WebElement booksOfSpanish;

    @FindBy(xpath = "//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[8]/a")
    private WebElement childrensBooks;

    @FindBy(xpath = "//a[text()='Deals in Books']")
    private WebElement dealsInBooks;

    @FindBy(xpath = "//a[text()='Prime Book Box']")
    private WebElement primeBook;

    @FindBy(xpath = "//a[text()='Top 20 Lists in Books']")
    private WebElement top20Books;


    public String awardWinnersText(){
    String getText = getText(awardWinners,"Award Winners");
    return getText;

}
    public String bargainBooksText(){
        String getText = getText(bargainBooks,"Bargain books");
        return getText;

    }
    public String fallReadingText(){
        String getText = getText(fallReading,"Fall Reading");
        return getText;

    }
    public String bookOfTheMonthText(){
        String getText = getText(bookOfTheMonth,"Book Of The Month");
        return getText;

    }
    public String bookOfTheYearText(){
        String getText = getText(bookOfTheYear,"Book Of The Year");
        return getText;

    }
    public String celebrityPicksText(){
        String getText = getText(celebrityPicks,"Celebrity Picks");
        return getText;

    }
    public String bookOfSpanishText(){
        String getText = getText(booksOfSpanish,"Books In Spanish");
        return getText;

    }
    public String childrensBooksText(){
        String getText = getText(childrensBooks,"Children's Books");
        return getText;

    }
    public String dealsInBooksText(){
        String getText = getText(dealsInBooks,"Deals In Books");
        return getText;

    }
    public String primeBookText(){
        String getText = getText(primeBook,"Prime Book");
        return getText;

    }
    public String top20BookText(){
        String getText = getText(top20Books,"Top 20 Books");
        return getText;

    }



}
