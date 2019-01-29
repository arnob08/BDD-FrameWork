package stepDefinitions;

import base.ApplicationPageBase;
import base.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Hook extends ApplicationPageBase {
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }

    @Before
    public void initializeTest() {
        String getOsNameFromSystem = System.getProperty("os.name");
        String browserName = System.getProperty("browser", "chrome");
        if (browserName.equalsIgnoreCase("chrome")) {

            ChromeOptions options = new ChromeOptions();
            // options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            System.out.println("Opening the browser : Chrome");
            if (getOsNameFromSystem.contains("Mac")) {
                System.setProperty("webdriver.chrome.driver", "../webautomation.practice.bdd/driver/chromedriver");
            } else if (getOsNameFromSystem.contains("Windows")) {
                System.setProperty("webdriver.chrome.driver", "webautomation.practice.bdd/driver/chromedriver.exe");
            }
            driver = new ChromeDriver(options);

        } else if (browserName.equalsIgnoreCase("firefox")) {
            /*
             * https://chercher.tech/java/chrome-firefox-options-selenium-webdriver
             *
             * */
            FirefoxOptions options = new FirefoxOptions();
            //options.setHeadless(true);
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--private");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);


            if (getOsNameFromSystem.contains("Windows")) {
                System.setProperty("webdriver.gecko.driver", "../webautomation.practice.bdd/driver/geckodriver.exe");
                // driver = new FirefoxDriver(options);
            } else if (getOsNameFromSystem.contains("Mac")) {
                System.setProperty("webdriver.gecko.driver", "webautomation.practice.bdd/driver/geckodriver");
                //  driver = new FirefoxDriver(options);
            }
            driver = new FirefoxDriver(capabilities);
        }

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); // 20
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS); //35
        driver.get("http://amazon.com");
        // driver.manage().window().maximize();
    }


    @After
    public void tearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            captureScreenshot(driver, scenario.getName());
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Chrome");
        driver.quit();
    }

    @AfterSuite
    public void generateReport() {
        extent.close();
    }

    public static void captureScreenshot(WebDriver driver, String screenshotName) {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir") + "/screenshots/" + screenshotName + " " + df.format(date) + ".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());

        }
    }
}