import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInformationPage extends  PageObject {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private  WebElement FirstName;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement LastName;
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement Username;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement Password;
    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement ConfirmPassword;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement NextButton1;

    public PersonalInformationPage(WebDriver driver) {
        super(driver);
    }
    public void writeIntoFirstNameField() {
        FirstName.sendKeys("fhdfhdsoisef");
    }
    public void writeIntoSecondField(){
        LastName.sendKeys("sgd");
    }
    public void writeIntoThirdField() {
        Username.sendKeys("jhghj");
    }
    public void writeIntoForthField(){
        Password.sendKeys("khdkj");
    }
    public void writeIntoFifthField(){
        ConfirmPassword.sendKeys("kdfj");
    }
    public void ClickNextButton1(){
        Utils.scrollToElement(driver, this.NextButton1);
        NextButton1.click();
    }

    public void NavigateToSecondPage() {
        FirstName.sendKeys("fhdfhdsoisef");
        LastName.sendKeys("sgd");
        Username.sendKeys("jhghj");
        Password.sendKeys("khdkj");
        ConfirmPassword.sendKeys("kdfj");
        ClickNextButton1();
    }
}






