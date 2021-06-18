import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enrollment extends  PageObject {

    @FindBy (xpath = "//*[@id=\"step1\"]/div/input[1]")
    private WebElement Username;
    @FindBy (xpath = "//*[@id=\"step1\"]/div/input[2]")
    private WebElement Email;
    @FindBy (xpath = "//*[@id=\"step1\"]/div/input[3]")
    private WebElement Password;
    @FindBy (xpath = "//*[@id=\"step1\"]/div/input[4]")
    private WebElement ConfirmPassword;
    @FindBy (xpath = "//*[@id=\"step1\"]/button")
    private WebElement Next;

    public Enrollment(WebDriver driver) { super(driver); }

    public void Username(){
        this.Username.sendKeys("hgjhgjygjgjgjh");
    }
    public void Email(){
        this.Email.sendKeys();
    }
    public void Password(){
        this.Password.sendKeys();
    }
    public void ConfirmPassword(){
        this.ConfirmPassword.sendKeys();
        }
    public void Next(){
        this.Next.click();
    }
}



