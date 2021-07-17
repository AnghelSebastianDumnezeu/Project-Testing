import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InPerson extends PageObject {
    @FindBy(xpath = "/html/body/h1")
    private WebElement InPersonHeader;

    @FindBy(xpath = "/html/body/a")
    private WebElement InPersonReturn;

    public InPerson(WebDriver driver) {
        super(driver);
    }

    public void InPersonReturn() {
        this.InPersonReturn.click();
    }

    public String getInPersonHeader() {
        return this.InPersonHeader.getText();
    }

}