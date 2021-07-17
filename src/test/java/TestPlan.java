import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Click on Questions section from navbar")
    public void Questions(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.Questions();
        Assert.assertEquals(webForm.getFrequentlyAskedQuestions(), "Frequently Asked Questions");
    }
    @Test(testName = "Click on Instructors section from navbar")
    public void Instructors(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.Instructors();
        Assert.assertEquals(webForm.getOurInstructors(),"Our Instructors");
    }
    // Testare Enrollment: Username, Email, Password, Confirm Password.
    @Test(testName = "Verify Enrollment button")
    public void Enrollment(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        Utils.waitForElementToLoad(3);
        webForm.Enrollment();

    }

    // Virtual, Hybrid, In Person
    @Test(testName = "Click on Virtual 'Read More'")
    public void Virtual(){
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickOnVirtual();
        Virtual virtualWebForm = new Virtual(driver);
        Assert.assertEquals(virtualWebForm.getVirtualHeader(),"Virtual");
    }

    @Test(testName = "Click Return 'In Person'")
    public void InPersonReturn() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickInPerson();
        InPerson inPersonWebForm = new InPerson(driver);
        Assert.assertEquals(inPersonWebForm.getInPersonHeader(), "In Person");
    }

    @Test(testName = "Return from 'Hybrid'")
    public void HybridReturn() {
        driver.get(Utils.BASE_URL);
        Homepage webForm = new Homepage(driver);
        webForm.ClickHybrid();
        Hybrid secondPage = new Hybrid(driver);
        Assert.assertEquals(secondPage.getHybridHeader(), "Hybrid");
    }

    @Test(testName = "First name - Positive")
    public void FirstNamePositiveTest() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webForm = new PersonalInformationPage(driver);
        webForm.writeIntoFirstNameField();
        webForm.writeIntoSecondField();
        webForm.writeIntoThirdField();
        webForm.writeIntoForthField();
        webForm.writeIntoFifthField();
        webForm.ClickNextButton1();
        ContactInformationPage secondWebForm = new ContactInformationPage(driver);
        Assert.assertEquals(secondWebForm.getContactInformationHeader(), "Contact information");
    }

    @Test(testName = "First name - Negative")
    public void FirstNameNegativeTest() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webForm = new PersonalInformationPage(driver);
        webForm.writeIntoFirstNameField();
        webForm.writeIntoSecondField();
        webForm.writeIntoThirdField();
        webForm.ClickNextButton1();
        Assert.assertEquals(webForm.getPersonalInformationHeader(), "Personal information");
    }
    @Test(testName = "Contact information - Positive")
    public void ContactInformationPagePositiveTest() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webFormTemp = new PersonalInformationPage(driver);
        webFormTemp.NavigateToSecondPage();
        Utils.waitForElementToLoad(2);
        ContactInformationPage webForm = new ContactInformationPage(driver);
        webForm.setEmail();
        webForm.setPhone();
        webForm.setCountry();
        webForm.setCity();
        webForm.setPostCode();
        webForm.setReturnButton1();

    }
    @Test(testName = "Contact information - Negative")
    public void ContactInformationPageNegativeTest() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webFormTemp = new PersonalInformationPage(driver);
        webFormTemp.NavigateToSecondPage();
        Utils.waitForElementToLoad(2);
        ContactInformationPage webForm = new ContactInformationPage(driver);
        webForm.setEmail();
        webForm.setPhone();
        webForm.setCountry();
        Assert.assertEquals(webForm.getContactInformationHeader(), "Contact information");
    }

    @Test(testName = "Verify return button in Enrollment")
    public void ReturnFromContantactInformationToPersonal() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webFormTemp = new PersonalInformationPage(driver);
        webFormTemp.NavigateToSecondPage();
        Utils.waitForElementToLoad(2);
        ContactInformationPage webForm = new ContactInformationPage(driver);
        webForm.setEmail();
        webForm.setPhone();
        webForm.setCountry();
        webForm.setReturnButton1();
        Assert.assertEquals(webFormTemp.getPersonalInformationHeader(), "Personal information");
    }

    @Test(testName = "Fill Course Options")
    public void CourseOptionsPage() {
        driver.get(Utils.BASE_URL2);
        PersonalInformationPage webFormTemp = new PersonalInformationPage(driver);
        webFormTemp.NavigateToSecondPage();
        Utils.waitForElementToLoad(2);
        ContactInformationPage webForm = new ContactInformationPage(driver);
        webForm.setEmail();
        webForm.setPhone();
        webForm.setCountry();
        webForm.setCity();
        webForm.setPostCode();
        webForm.NextButton2();
        CourseOptionsPage webFormTwo = new CourseOptionsPage(driver);
        webFormTwo.FirstOption();
        webFormTwo.SecondOption();
        webFormTwo.ThirdOption();
        webFormTwo.FourthOption();
        CourseOptionsPage webFormT = new CourseOptionsPage(driver);
        Assert.assertEquals(webFormT.getCourseInformationHeader(),"Sign up for the Software Testing course");

    }
    @Test (testName = "PaymentInformation")
    public void PaymentInformationPage() {
        driver.get(Utils.BASE_URL2);

        PersonalInformationPage webFormTemp = new PersonalInformationPage(driver);
        webFormTemp.NavigateToSecondPage();
        Utils.waitForElementToLoad(2);

        ContactInformationPage webForm = new ContactInformationPage(driver);
        webForm.NavigateToThirdPage();
        Utils.waitForElementToLoad(2);

        CourseOptionsPage webFormTwo = new CourseOptionsPage(driver);
        webFormTwo.NextButton3();


        PaymentInformationPage webFormThree = new PaymentInformationPage(driver);
        webFormThree.setPaymentInformationPage();
        webFormThree.setCardHolderName();
        webFormThree.setCardNumber();
        webFormThree.setCVC();
        webFormThree.setYear();
        webFormThree.setMonth();
        Assert.assertEquals(webFormThree.getPaymentInformationHeader(), "Payment information");

    }

    @AfterSuite
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
