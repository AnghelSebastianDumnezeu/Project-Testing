import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }
    @Test(testName = "Verify if submenu oppens")
    public void VerifySubmenu(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);
        webForm.ClickOnContainer();
    }
    @Test(testName = "oppen's submenu button")
    public void  WhatYoullLearn(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);
        webForm.ClickOnWhatYoullLearn();

    }
    @Test(testName = "oppen's submenu button")
    public void Questions(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);
        webForm.Questions();
    }
    @Test(testName = "oppen's submenu button")
    public void Instructors(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);
        webForm.Instructors();
    }
    // Testare Enrollment: Username, Email, Password, Confirm Password.
    @Test(testName = "oppen's new page")
    public void Enrollment(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);
        Utils.waitForElementToLoad(3);
        webForm.Enrollment();
    }
    @Test(testName = "input Username")
    public void Username(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);

    }
    @Test(testName = "input Email ")
    public void Email(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar (driver);

    }
    @Test(testName = "input Password")
    public void Password(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);

    }
    @Test(testName = "input Confirm Password")
    public void ConfirmPassword(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);

    }
    @Test(testName = "Click Next Button")
    public void Next(){
        driver.get(Utils.BASE_URL);
        Navbar webForm = new Navbar(driver);

        webForm.Enrollment();
    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
