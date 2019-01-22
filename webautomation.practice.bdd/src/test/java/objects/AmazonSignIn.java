package objects;


import base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonSignIn extends ApplicationPageBase {
//
//    @FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]")
//    public WebElement signIn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ap_email\"]")
    public WebElement emailbox;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    public WebElement passwordBox;

    @FindBy(css = "a#a-autoid-0-announce")
    public WebElement signinButton;

    @FindBy(xpath = "//*[@id=\"auth-warning-message-box\"]/div/h4")
    public WebElement errorMsg;

    @FindBy(css = "input#twotabsearchtextbox")
    private WebElement searchEl;

    @FindBy(xpath = "//span[@class = 'nav-line-2' and text()='Account & Lists']")
    private WebElement hovEver;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a")
    private WebElement signLast;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    private WebElement siginAllacount;

    @FindBy(xpath = "//*[@id=\"auth-captcha-guess\"]")
    private WebElement capchaBox;

//    public LoginPage login1 (String email, String password) {
//    sendKeys(emailbox,"emailBox",email);
//    sendKeys(passwordBox,"passwordbox",password);
//click(signinButton,"signInButton");
//return  new LoginPage();
//    }

    public void tempt(){
//
//        signinButton.click();

        Actions actions = new Actions(driver);
        actions.moveToElement(hovEver).build().perform();
        boolean isEnabled = signLast.isEnabled();
        boolean isDisplayed = signLast.isDisplayed();
        boolean isSelected = signLast.isSelected();
        System.out.println(isEnabled);
        System.out.println(isDisplayed);
        System.out.println(isSelected);
        signLast.click();

       /* sendKeys(emailbox,"emailbox",email);
        sendKeys(passwordBox,"passwordBoz",password);
        click(siginAllacount,"Sign in account");
        return new AmazonSignIn();*/

    }

    public AmazonSignIn sendData(String email,String password){

        sendKeys(emailbox,"emailbox",email);
        sendKeys(passwordBox,"passwordBoz",password);

       /* if(siginFailureAlert.isDisplayed())

        {    sendKeys(capchaBox,"Enter capcha values","5432222");
            click(signinAllacount, "click sign In Buton");

        }

        else{
            clickButton(signInButton, "click sign In Buton");

        }


        return new LogInPage();
*/


        click(siginAllacount,"Sign in account");
        return new AmazonSignIn();

    }

    /*@DataProvider
    public Iterator<Object[]> supplyData() {
         ArrayList<Object[]> testData = XlsDataReaderUtil.getDataFromExcel();
        return testData.iterator();

         }*/
//public void signIn(){
//
//        click(signIn,"sign in ");
//}

//        public void signInButton() {
//           click(signinButton, "sign Button");
//
//        }


public String errormsg(){
    String actualText = getText(errorMsg,"error msg");
    return actualText;
}

    }


