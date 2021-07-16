import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Ipsum2 extends PageObject {
    @FindBy(xpath = "/html/body/a")
    private WebElement InPersonReturn;

    public Ipsum2(WebDriver driver) {
        super(driver);
    }

    public void InPersonReturn() {
        this.InPersonReturn.click();
    }

}