package tests;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;
import pages.LoginPage;
import webDriver.WebDriverBuilder;

/**
 * Created by Bharathan on 10/02/16.
 * Created on 10/02/16 1:04 PM
 */
public class BaseTest {

    RemoteWebDriver driver;
    LoginPage lgnPage;
    public Logger logger;

    public BaseTest() {
        lgnPage = new LoginPage();
        logger = Logger.getLogger(BaseTest.class);
    }

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver",
//                "/Users/Bharathan/Selenium/Driver/chromedriver");
//        driver = new ChromeDriver();
//        driver.get("http://accountsdemo.herokuapp.com");
////        login("bharathk@thoughtworks.com", "ARUNmozhi");
        driver = WebDriverBuilder.getWebDriver();

    }

    @After

    public void tearDown() {
//        driver.close();
        driver.quit();
        WebDriverBuilder.nullWebDriver();
    }
}
