import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VirtualPage extends PageObject{
    @FindBy(xpath = "/html/body/a")
    private WebElement VirtualReturn;

    public VirtualPage(WebDriver driver){
        super(driver);
    }

    public void HybridReturn(){
        this.VirtualReturn.click();
    }

}
