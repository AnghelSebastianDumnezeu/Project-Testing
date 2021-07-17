import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Hybrid extends PageObject{
    @FindBy(xpath = "/html/body/h1")
    private WebElement HybridHeader;

    @FindBy(xpath = "/html/body/a")
    private WebElement HybridReturn;

    public Hybrid(WebDriver driver){
        super(driver);
    }

    public void HybridReturn(){
        this.HybridReturn.click();
    }

    public String getHybridHeader() {
        return this.HybridHeader.getText();
    }

}
