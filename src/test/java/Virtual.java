import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Virtual extends PageObject{
    @FindBy(xpath = "/html/body/a")
    private WebElement VirtualReturnButton;

    public Virtual(WebDriver driver){super(driver);}

    public void VirtualReturn(){Utils.scrollToElement(driver,VirtualReturnButton);
        this.VirtualReturnButton.click();}


}
