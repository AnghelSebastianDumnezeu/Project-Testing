import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactInformationPage extends PageObject{

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement Email;
    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement Phone;
    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement Country;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement City;
    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement PostCode;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[1]")
    private WebElement ReturnButton1;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement NextButton2;
    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactInformationHeader;


    public ContactInformationPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(){
        Email.sendKeys("drgtrd");
    }
    public void setPhone(){
        Phone.sendKeys("asgr");
    }
    public void setCountry(){
        Country.sendKeys("sdhg");
    }
    public void setCity() { City.sendKeys("kyufkyuf"); }
    public void setPostCode(){
        PostCode.sendKeys("kjh");
    }
    public void setReturnButton1(){
        ReturnButton1.click();
    }
    public void NextButton2() { NextButton2.click(); }
    public String getContactInformationHeader() {
        return contactInformationHeader.getText();
    }

    public void NavigateToThirdPage(){
        setEmail();
        setPhone();
        setCountry();
        setCity();
        setPostCode();
        NextButton2();

    }
}
