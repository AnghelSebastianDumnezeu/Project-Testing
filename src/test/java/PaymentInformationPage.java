import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentInformationPage extends PageObject{

    public PaymentInformationPage(WebDriver driver) {super(driver);}

    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement PaymentInformationPage;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement CardHolderName;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement CardNumber;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement CVC;
    @FindBy (xpath = "//*[@id=\"month\"]/option[6]")
    private WebElement Month;
    @FindBy (xpath = "//*[@id=\"year\"]/option[4]")
    private WebElement Year;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[1]")
    private WebElement ReturnButton3;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement NextButton4;
    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement PaymentInformationHeader;

    public void setPaymentInformationPage(){
       PaymentInformationPage.click();
    }
    public void setCardHolderName(){
        CardHolderName.sendKeys("aaaaaaaa");
    }
    public void setCardNumber(){
        CardNumber.sendKeys("aaaaaaaa");
    }
    public void setCVC(){
        CVC.sendKeys("aaaaaaaa");
    }
    public void setMonth(){
        Month.click();
    }
    public void setYear(){
        Year.click();
    }
    public void setReturnButton3(){
        ReturnButton3.click();
    }
    public void setNextButton4(){
        NextButton4.click();
    }
    public String getPaymentInformationHeader() {
        return this.PaymentInformationHeader.getText();
    }

}


