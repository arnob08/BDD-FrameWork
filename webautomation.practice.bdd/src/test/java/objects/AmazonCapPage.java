package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonCapPage extends ApplicationPageBase {

    @FindBy(css = "span[class='a-size-small a-color-base']")
private WebElement mensHats;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[4]/span/a/span")
    private WebElement mensBeanies;

    @FindBy(xpath = "//span[text()='Surf, Skate & Street Hats & Caps']")
    private WebElement scarfs;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[1]/span/ul/div/li[8]/span/a/span")
    private WebElement mensAccessiories;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[2]/span/a/span")
    private WebElement womensHat;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[2]/span/ul/div/li[4]/span/a/span")
    private WebElement womensAccessiories;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[3]/span/ul/div/li[2]/span/a/span")
    private WebElement boysCaps;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[2]/span/a/span")
    private WebElement mensNovelty;

    @FindBy(xpath = "//*[@id=\"leftNavContainer\"]/ul[1]/div/li[4]/span/ul/div/li[4]/span/a/span")
    private WebElement womensNovelty;

    @FindBy(xpath = "//span[text()='Novelty Clothing']")
    private WebElement noveltyClothes;




    public String mensHatText(){
        String getText = getText(mensHats,"Men's Hat");
        return getText;
    }

    public String mensBeaniText(){
        String getText = getText(mensBeanies,"Men's Beanie");
        return getText;
    }

    public String scarfsText(){
        String getText = getText(scarfs,"Scarf");
        return getText;
    }

    public String mensAccessioriesText(){
        String getText = getText(mensAccessiories,"Mens Accessiories");
        return getText;
    }

    public String womensHatText(){
        String getText = getText(womensHat,"Women's Hat");
        return getText;
    }

    public String womensAccessioriesText(){
        String getText = getText(womensAccessiories,"Women's Accessiories");
        return getText;
    }

    public String boysCapText(){
        String getText = getText(boysCaps,"Boy's Cap");
        return getText;
    }

    public String mensNoveltyText(){
        String getText = getText(mensNovelty,"Men's Novelty");
        return getText;
    }

    public String womensNoveltyText(){
        String getText = getText(womensNovelty,"Women's Novelty");
        return getText;
    }

    public String noveltyClothesText(){
        String getText = getText(noveltyClothes,"Novelty Clothes");
        return getText;
    }











}
