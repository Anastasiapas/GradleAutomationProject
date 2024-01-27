package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {

    public WebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod
    public void setup(String browserName){
        switch(browserName){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case  "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Browser is not passed");
                break;
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://en.wikipedia.org/wiki/Main_Page");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
