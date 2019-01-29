package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomatedIphonePage extends ApplicationPageBase {


    @FindBy(xpath = "//*[@id=\"result_0\"]/div/div/div/div[2]/div[2]/div[1]/a/h2")
    private WebElement iphoneCharger1;


    public String iphoneCharger1(){

        String getText = getText(iphoneCharger1,"iphone Charger 1");
        return getText;
    }








}
